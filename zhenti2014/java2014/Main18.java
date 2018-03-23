package java2014;

import java.util.Scanner;

public class Main18 {
	/*
	问题描述
	　　有n个小朋友围坐成一圈。老师给每个小朋友随机发偶数个糖果，然后进行下面的游戏：
	　　每个小朋友都把自己的糖果分一半给左手边的孩子。
	　　一轮分糖后，拥有奇数颗糖的孩子由老师补给1个糖果，从而变成偶数。
	　　反复进行这个游戏，直到所有小朋友的糖果数都相同为止。
	　　你的任务是预测在已知的初始糖果情形下，老师一共需要补发多少个糖果。
	输入格式
	　　程序首先读入一个整数N(2<N<100)，表示小朋友的人数。
	　　接着是一行用空格分开的N个偶数（每个偶数不大于1000，不小于2）
	输出格式
	　　要求程序输出一个整数，表示老师需要补发的糖果数。
	样例输入
	3
	2 2 4
	样例输出
	4
	*/
	static int n; 
	static int[] a=new int[105];
	//判断是否数组是否相等
	public static boolean is_equal(){  
	    for(int i=0;i<n-1;i++)  
	      if(a[i]!=a[i+1])  
	        return false;  
	    return true;  
	} 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ans=0;
		n=sc.nextInt();
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		while(true){
			if(is_equal()==true){
				break;
			}
			
			for(int i=0;i<n;i++){
				//是奇数加1
				if(a[i]%2==1){
					ans++;
					a[i]++;
				}
				//将手中的糖果拿掉一半
				a[i]=a[i]/2;
			}
			
			int k=a[0];  
	        for(int i=0;i<n-1;i++){
	        	 //自己的糖果等于原来的一半加上右边的一半
	        	 a[i]=a[i]+a[i+1];  
	        }
	        //最后一个元素
	        a[n-1]=a[n-1]+k;
		}
		System.out.println(ans);
	}
	
}