package java2016;

import java.util.Scanner;

public class Main10 {
	/*
	四平方和
	四平方和定理，又称为拉格朗日定理：
	每个正整数都可以表示为至多4个正整数的平方和。
	如果把0包括进去，就正好可以表示为4个数的平方和。
	比如：
	5 = 0^2 + 0^2 + 1^2 + 2^2
	7 = 1^2 + 1^2 + 1^2 + 2^2
	（^符号表示乘方的意思）
	对于一个给定的正整数，可能存在多种平方和的表示法。
	要求你对4个数排序：
	0 <= a <= b <= c <= d
	并对所有的可能表示法按 a,b,c,d 为联合主键升序排列，最后输出第一个表示法
	程序输入为一个正整数N (N<5000000)
	要求输出4个非负整数，按从小到大排序，中间用空格分开
	例如，输入：
	5
	则程序应该输出：
	0 0 1 2
	再例如，输入：
	12
	则程序应该输出：
	0 2 2 2
	再例如，输入：
	773535
	则程序应该输出：
	1 1 267 838
	*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long time=System.currentTimeMillis();
		for(int a=0;a<=Math.sqrt(n);a++){
			for(int b=0;b<=Math.sqrt(n);b++){
				for(int c=0;c<=Math.sqrt(n);c++){
					for(int d=0;d<=Math.sqrt(n);d++){
						if(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2)+Math.pow(d,2)==n){
							System.out.print(a+" "+b+" "+c+" "+d);
							return ;
						}
					}
				}
			}
		}
		long time2=System.currentTimeMillis();
		System.out.println(time2);
		System.out.println(time);
	}
}
