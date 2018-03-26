package moni;

import java.util.Scanner;

public class Main15 {
	/*  推到公式
	A2=2*A1-A0;
	A3=2*A2-A1=3A1-2*A0;
	A4=2*A3-A2=4*A1-3*A0;
	*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double a0=sc.nextDouble();
		double an1=sc.nextDouble();
		double[] c=new double[n];
		for(int i=0;i<n;i++){
			c[i]=sc.nextDouble();
		}
		System.out.println(String.format("%.2f",(an1+n*a0-2*c[n-1])/(n+1)));
	}
}
