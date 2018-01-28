package basicTraining;

import java.util.Scanner;

/**
 * 问题描述
	给出一个包含n个整数的数列，问整数a在数列中的第一次出现是第几个。
	
	输入格式
	第一行包含一个整数n。
	
	第二行包含n个非负整数，为给定的数列，数列中的每个数都不大于10000。
	
	第三行包含一个整数a，为待查找的数。
	
	输出格式
	如果a在数列中出现了，输出它第一次出现的位置(位置从1开始编号)，否则输出-1。
	样例输入
	6
	1 9 4 8 3 9
	9
	样例输出
	2
	数据规模与约定
	1 <= n <= 1000。
 * 
 */
public class basic05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//n个整数
		int n=sc.nextInt();
		if(n<1||n>1000){
			return ;
		}
		//定义数组
		int nums[]=new int[n];
		for(int i=0;i<n;i++){
			nums[i]=sc.nextInt();
		}
		int temp=sc.nextInt();
		for(int j=0;j<n;j++){
			//存在与之相等
			if(nums[j]==temp){
				System.out.println(j+1);
				return ;
			}
			//不存在
			if(j==n-1){
				System.out.println(-1);
				return ;
			}
		}
	}
}
