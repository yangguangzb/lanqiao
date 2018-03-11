package javaModel2015;
/**
 * 2015校内选拔赛
 * @author zhangbiao
 *
 */
public class Main01 {
	/*
	java中提供了对正则表达式的支持。
	有的时候，恰当地使用正则，可以让我们的工作事半功倍！

	如下代码用来检验一个四则运算式中数据项的数目，请填写划线部分缺少的代码。
	*/
	public static void main(String[] args) {
		System.out.println(f("12+35*5-2*18/9-3")); //7
		System.out.println(f("354*12+3-14/7*6")); //6
	}
	public static int f(String s)
	{
		return s.split("\\p{Punct}").length; //填空
	}
}
