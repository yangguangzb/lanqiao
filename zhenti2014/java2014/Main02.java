package java2014;

import java.util.Scanner;

public class Main02 {
	/*
	 一根高筋拉面，中间切一刀，可以得到2根面条。
	 如果先对折1次，中间切一刀，可以得到3根面条。
	 如果连续对折2次，中间切一刀，可以得到5根面条。
	 那么，连续对折10次，中间切一刀，会得到多少面条呢？
	 答案是个整数，请通过浏览器提交答案。不要填写任何多余的内容
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		System.out.println((int)(Math.pow(2,m)+1));
	}
}
