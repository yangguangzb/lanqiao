package basicTraining;

import java.util.Scanner;
	/*
	问题描述
	给定一个N阶矩阵A，输出A的N次幂（N是非负整数）
	例如：
	A =
	1 2
	3 4
	A的2次幂
	7 10
	15 22
	输入格式
	第一行是一个正整数N、M（1<=N<=30, 0<=M<=5），表示矩阵A的阶数和要求的幂数
	接下来N行，每行N个绝对值不超过10的非负整数，描述矩阵A的值
	输出格式
	输出共N行，每行N个整数，表示A的M次幂所对应的矩阵。相邻的数之间用一个空格隔开
	样例输入
	2 2
	1 2
	3 4
	样例输出
	7 10
	15 22
	
	分析：竟然有一个！0次幂！矩阵的零次冥要输出单位矩阵！
	*/
public class Basic17 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//矩阵阶数
		int N=sc.nextInt();
		//幂数
		int M=sc.nextInt();
		
	}
}
