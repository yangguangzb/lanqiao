package java2016;
/**
 * 等到该数能够排的排完后，就将该数与找到的比它小的数交换位置，
 * 这样下面才能继续递归，否则第一个数总是5，下面递归的时候总是以5作为标准
 * @author zhangbiao
 *
 */
public class Main23 {
	/*
	快速排序
	排序在各种场合经常被用到。
	快速排序是十分常用的高效率的算法。
	其思想是：先选一个“标尺”，
	用它把整个队列过一遍筛子，
	以保证：其左边的元素都不大于它，其右边的元素都不小于它。
	这样，排序问题就被分割为两个子区间。
	再分别对子区间排序就可以了。
	*/
	public static void swap(int a[], int i, int j)
	{
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	public static int partition(int a[], int p, int r)
	{
	    int i = p;
	    int j = r + 1;
	    int x = a[p];
	    while(true){
	        while(i<r && a[++i]<x);
	        while(a[--j]>x);
	        if(i>=j) break;
	        swap(a,i,j);
	    }
	    swap(a, p, j);			//填空
	    return j;
	}
	public static void quicksort(int a[], int p, int r)
	{
	    if(p<r){
	        int q = partition(a,p,r);
	        quicksort(a,p,q-1);
	        quicksort(a,q+1,r);
	    }
	}
	public static void main(String[] args) {
		int i;
		int a[] = {5,13,6,24,2,8,19,27,6,12,1,17};
		int N = 12;
		quicksort(a, 0, N-1);
		for(i=0; i<N; i++){
			System.out.print(a[i]+" ");
		}
	}
}
