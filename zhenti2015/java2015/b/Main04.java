package java2015.b;

import java.util.Scanner;

public class Main04 {
	/*
	饮料换购
	乐羊羊饮料厂正在举办一次促销优惠活动。乐羊羊C型饮料，凭3个瓶盖可以再换一瓶C型饮料，并且可以一直循环下去，但不允许赊账。
	请你计算一下，如果小明不浪费瓶盖，尽量地参加活动，那么，对于他初始买入的n瓶饮料，最后他一共能得到多少瓶饮料。
	输入：一个整数n，表示开始购买的饮料数量（0<n<10000）
	输出：一个整数，表示实际得到的饮料数
	例如：
	用户输入：
	100
	程序应该输出：
	149

	用户输入：
	101
	程序应该输出：
	151
	资源约定：
	峰值内存消耗（含虚拟机） < 256M
	CPU消耗  < 1000ms
	*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();	//购买的n瓶饮料
		sc.close();
		int num=n;	//瓶盖
		int sum=n;	//总共的饮料
		while(num>=3){
			sum=sum+num/3;
			num=num/3+num%3;
		}
		System.out.println(sum);
	}
}
