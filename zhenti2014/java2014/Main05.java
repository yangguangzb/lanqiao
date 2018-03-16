package java2014;

public class Main05 {
	/*
	数学发展历史上，圆周率的计算曾有许多有趣甚至是传奇的故事。
	其中许多方法都涉及无穷级数
	*/
	public static void main(String[] args) {
		double x=111;
		for(int n=10000;n>=0;n--){
			int i=2*n+1;
			x=2+(i*i/x);
		}
		System.out.println(String.format("%.4f",4/(x-1)));
	}
}
