package java2015.b;
/**
 * 
 * @author zhangbiao
 *s是"*.............*"，每次从左边截取"*....."，
 *除去需要拼接一个"."和一个"*"整体个数还要-1，所以一共是减3
 */
public class Main11 {
	/*
	打印菱形
	给出菱形的边长，在控制台上打印出一个菱形来。
	为了便于比对空格，我们把空格用句点代替
	*/
	public static void f(int n)
	{
		String s = "*";
		for(int i=0; i<2*n-3; i++) 
			s += ".";
		s += "*";
	
		String s1 = s + "\n";
		String s2 = "";
		//s=*.............*
		for(int i=0; i<n-1; i++){
			s = "." + s.substring(0,s.length()-3) + "*";  //填空
			s1 = s + "\n" + s1;
			s2 += s + "\n";
		}
		System.out.println(s1+s2);		
	}
	
	public static void main(String[] args)
	{
		f(8);
	}
}
