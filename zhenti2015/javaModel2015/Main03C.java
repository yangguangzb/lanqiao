package javaModel2015;

import java.util.Scanner;

/**
 * 2015校内选拔赛C组
 * @author zhangbiao
 *
 */
public class Main03C {
	/*
	把一个整数的每个数位都平方后求和，又得到一个整数，我们称这个整数为：位平方和。
	对新得到的整数仍然可以继续这一运算过程。
	比如，给定整数为4，则一系列的运算结果为：
	16,37,58,89,....
	本题的要求是，已知一个整数x，求第n步的运算结果。
	数据格式要求：
	输入，两个整数x n，中间以空格分开。表示求x的第n步位平方和。其中，x，n都大于0，且小于100000。
	输出，一个整数，表示所求结果。
	例如，
	输入：
	4 3
	则程序应该输出：
	58
	再例如，
	输入：
	1314 10
	则程序应该输出：
	20
	*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();		//数
		int n=sc.nextInt();		//第几步
		sc.close();
		if(n==1){
			System.out.println(x*x);
		}else{
			for(int i=1;i<=n;i++){
				x=f(x);
			}
			System.out.println(x);
		}
	}
	public static int f(int n){
		int m=0;
		int i=0;
		while(n>0){
			i=n%10;
			m=m+i*i;
			n=n/10;
		}
		return m;
	}
}
