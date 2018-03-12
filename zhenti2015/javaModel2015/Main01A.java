package javaModel2015;

public class Main01A {
	/*
	一个串的子串是指该串的一个连续的局部。如果不要求连续，则可称为它的子序列。
	比如对串： "abcdefg" 而言，"ab","abd","bdef" 等都是它的子序列。
	特别地，一个串本身，以及空串也是它的子序列。

	对两个串而言，可以有许多的共同的子序列，我们关心的是：它们所共同拥有的长度最大的子序列是多长。
	以下代码实现了这个问题的求解。请填写划线部分缺失的代码。
	*/
	public static int f(String x, String y)
	{
		if(x.length()==0) return 0;
		if(y.length()==0) return 0;
		
		String x1 = x.substring(1);
		String y1 = y.substring(1);	
		
		if(x.charAt(0)==y.charAt(0)) return f(x1,y1)+1;
		
		return Math.max(f(x, y1),f(x1, y));//填空
	}
	
	public static void main(String[] args)
	{
		System.out.println(f("ac","acd")); //2
		System.out.println(f("acebbcde1133","xya33bc11de")); //5
	}
}
