package java2015.b;

import java.util.Scanner;

public class Main05 {
	/*
	移动距离
	X星球居民小区的楼房全是一样的，并且按矩阵样式排列。其楼房的编号为1,2,3...
	当排满一行时，从下一行相邻的楼往反方向排号。
	比如：当小区排号宽度为6时，开始情形如下：
	1  2  3  4  5  6
	12 11 10 9  8  7
	13 14 15 .....
	我们的问题是：已知了两个楼号m和n，需要求出它们之间的最短移动距离（不能斜线方向移动）
	输入为3个整数w m n，空格分开，都在1到10000范围内
	w为排号宽度，m,n为待计算的楼号。
	要求输出一个整数，表示m n 两楼间最短移动距离。
	例如：
	用户输入：
	6 8 2
	则，程序应该输出：
	4

	再例如：
	用户输入：
	4 7 20
	则，程序应该输出：
	5
	资源约定：
	峰值内存消耗（含虚拟机） < 256M
	CPU消耗  < 1000ms
	*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int w=sc.nextInt();	//宽度
		int m=sc.nextInt();//楼号
		int n=sc.nextInt();//楼号
		if(m==n){
			System.out.println(0);
			return ;
		}
		int min=Math.min(m, n);//小的楼号
		int max=Math.max(m,n);//大的楼号
		int cengMin=min%w==0?min/w-1:min/w;		//小的在第几层
		int cengMax=max%w==0?max/w-1:max/w;		//大的在第几层
		if(cengMin==cengMax){
			System.out.println(max-min);
			return ;
		}
		int sum=cengMax-cengMin;
		int jili=f(cengMin,min,w)+f(cengMax, max, w);
		if(f(cengMin,min,w)==f(cengMax, max, w)){
			System.out.println(sum);
		}else{
			System.out.println(sum+w-jili-1);
		}
	}
	//计算同层的差
	public static int f(int ceng,int min,int w){
		int left=0;
		int right=0;
		if(ceng%2==0){
			//从小到大
			left=min-ceng*w-1;
			right=w-left-1;
		}else{
			//从大到小
			left=(ceng+1)*w-min;
			right=w-left-1;
		}
		return Math.min(left,right);
	}
}
