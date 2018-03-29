package java2015.b;

import java.util.HashSet;
import java.util.Set;

public class Main10 {
	/*
	九数分三组
	1~9的数字可以组成3个3位数，设为：A,B,C,  现在要求满足如下关系：
	B = 2 * A
	C = 3 * A
	请你写出A的所有可能答案，数字间用空格分开，数字按升序排列。
	注意：只提交A的值，严格按照格式要求输出。
	*/
	public static void main(String[] args) {
		for(int a=123;a<=329;a++){
			for(int b=246;b<=658;b++){
				for(int c=369;c<=987;c++){
					if((b==2*a)&&(c==3*a)){
						String s=a+""+b+""+c+"";
						char[] ch = s.toCharArray();
						Set<Character> set=new HashSet<Character>();
						for(int i=0;i<9;i++){
							if(ch[i]!='0'){
								set.add(ch[i]);
							}
						}
						if(set.size()==9){
							System.out.print(a+" ");
						}
					}
				}
			}
		}
	}
}
