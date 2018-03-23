package java2013;

import java.util.Scanner;

public class Main11 {
	/*
	问题描述
	　　观察这个数列：
	　　1 3 0 2 -1 1 -2 ...

	　　这个数列中后一项总是比前一项增加2或者减少3。

	　　栋栋对这种数列很好奇，他想知道长度为 n 和为 s 而且后一项总是比前一项增加a或者减少b的整数数列可能有多少种呢？
	输入格式
	　　输入的第一行包含四个整数 n s a b，含义如前面说述。
	输出格式
	　　输出一行，包含一个整数，表示满足条件的方案数。由于这个数很大，请输出方案数除以100000007的余数。
	样例输入
	4 10 2 3
	样例输出
	2
	样例说明
	　　这两个数列分别是2 4 1 3和7 4 1 -2。
	*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();		//长度
		int s=sc.nextInt();		//和
		int a=sc.nextInt();		//增加a
		int b=sc.nextInt();		//减少b
		
	}
}
