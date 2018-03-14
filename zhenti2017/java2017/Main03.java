package java2017;

/**
 * 注意条件：镜像和旋转；并没有说一条边中间的两个数字不能调换
 * @author zhangbiao
 *
 */
public class Main03 {
	/*
	标题：纸牌三角形
	A,2,3,4,5,6,7,8,9 共9张纸牌排成一个正三角形（A按1计算）。要求每个边的和相等。
	下图就是一种排法（如有对齐问题，参看p1.png）。

	      1
	     9 6
	    4   8
	   3 7 5 2

	这样的排法可能会有很多。
	如果考虑旋转、镜像后相同的算同一种，一共有多少种不同的排法呢？
	请你计算并提交该数字
	*/
	static int[] vis=new int[10];
	static int[] a=new int[10];
	static int count;
	public static void main(String[] args) {
		count=0;
		dfs(1);
		System.out.println(count/6);
	}
	
	
	public static void dfs(int x){
		
		if(x>9){
			if((a[1]+a[2]+a[4]+a[6])==(a[1]+a[3]+a[5]+a[9])&&(a[1]+a[3]+a[5]+a[9])==(a[6]+a[7]+a[8]+a[9])){
				count++;
			}
		}
		
		
		for(int i=1;i<10;i++){
			if(vis[i]==0){
				vis[i]=1;
				a[x]=i;
				dfs(x+1);
				vis[i]=0;
			}
		}
		
	}
	
}



















