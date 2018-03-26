package moni;

import java.util.Scanner;

public class Main12 {
	/*
	LIS是最长上升子序列。什么是最长上升子序列？ 就是给你一个序列，请你在其中求出一段最长严格上升的部分，它不一定要连续。
	就像这样：2, 3, 4, 7 和 2, 3, 4, 6 就是序列 2 5 3 4 1 7 6 的两个上升子序列，最长的长度是 4。
	*/
	static int[] f=new int[10000];
	static int[] b=new int[10000];
	public static int max(int a, int b) {
	    return a > b ? a : b;
	}
	public static int lis(int n) {
	    int res = 0;
	    for (int i = 0; i < n; ++i) {
	        for (int j = 0; j < i; ++j) {
	            if (b[j] < b[i]) {
	                /*在这里填写必要的代码*/
	            	f[i]=max(f[i],f[j]+1);
	            }
	        }
	        res = max(res, f[i]);
	    }
	    return res+1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			b[i]=sc.nextInt();
		}
		System.out.println(lis(n));
	}
}
