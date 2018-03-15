package java2017;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main08 {
	/*
	标题： Excel地址
	Excel单元格的地址表示很有趣，它使用字母来表示列号。
	比如，
	A表示第1列，
	B表示第2列，
	Z表示第26列，
	AA表示第27列，
	AB表示第28列，
	BA表示第53列，
	....
	当然Excel的最大列号是有限度的，所以转换起来不难。
	如果我们想把这种表示法一般化，可以把很大的数字转换为很长的字母序列呢？
	本题目既是要求对输入的数字, 输出其对应的Excel地址表示方式。
	例如，
	输入：
	26
	则程序应该输出：
	Z
	再例如，
	输入：
	2054
	则程序应该输出：
	BZZ
	*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		List<Integer> list=f(n);
		for(int i=list.size()-1;i>=0;i--){
			System.out.print((char)(list.get(i)+'A'-1));
		}
	}
	public static List<Integer> f(int x){
		List<Integer> list=new ArrayList<Integer>();
		int m;
		while(x>0){
			m=x%26;
			if(m==0){
				list.add(26);
			}else{
				list.add(m);
			}
			//由于26不进位，所以需要减一
			x--;
			x=x/26;
		}
		return list;
	}
	
}
