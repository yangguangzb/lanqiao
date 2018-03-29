package java2015.b;

import java.util.HashSet;
import java.util.Set;

public class Main13 {
	/*
	奇妙的数字
	小明发现了一个奇妙的数字。它的平方和立方正好把0~9的10个数字每个用且只用了一次。
	你能猜出这个数字是多少吗？
	答案：69
	*/
	public static void main(String[] args) {
		for(int i=10;i<1000;i++){
			int a=i*i;
			int b=i*i*i;
			String s=a+""+b;
			char[] ch = s.toCharArray();
			if(ch.length==10){
				Set<Character> set=new HashSet<Character>();
				for(int j=0;j<=9;j++){
					set.add(ch[j]);
				}
				if(set.size()==10){
					System.out.println(i);
				}
			}
		}
	}
}
