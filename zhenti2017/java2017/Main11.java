package java2017;

import java.util.HashSet;
import java.util.Set;

public class Main11 {
	/*
	标题：9数算式

	观察如下的算式：
	
	9213 x 85674 = 789314562
	
	左边的乘数和被乘数正好用到了1~9的所有数字，每个1次。
	而乘积恰好也是用到了1~9的所有数字，并且每个1次。
	
	请你借助计算机的强大计算能力，找出满足如上要求的9数算式一共有多少个？
	*/
	public static void main(String[] args) {
		int count=0;
		//1-8-9
		for(int i=1;i<=9;i++){
			for(int j=12345678;j<=98765432;j++){
				long x=i*j;
				if(f(x)==true&&g(i,j)==true){
					count++;
					System.out.println(i+" * "+j+"="+x);
				}
			}
		}
		
		//2-7-9
		for(int i=12;i<=98;i++){
			for(int j=1234567;j<=9876543;j++){
				long x=i*j;
				if(f(x)==true&&g(i,j)==true){
					count++;
					System.out.println(i+" * "+j+"="+x);
				}
			}
		}
		//3-6-9
		for(int i=123;i<=987;i++){
			for(int j=123456;j<=987654;j++){
				long x=i*j;
				if(f(x)==true&&g(i,j)==true){
					count++;
					System.out.println(i+" * "+j+"="+x);
				}
			}
		}
		//4-5-9
		for(int i=1234;i<=9876;i++){
			for(int j=12345;j<=98765;j++){
				long x=i*j;
				if(f(x)==true&&g(i,j)==true){
					count++;
					System.out.println(i+" * "+j+"="+x);
				}
			}
		}
		System.out.println(count);
	}
	public static boolean f(long x){
		String s=x+"";
		char[] charArray = s.toCharArray();
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<charArray.length;i++){
			if((int)(charArray[i])==48)
				break;
			set.add((int)charArray[i]);
		}
		if(set.size()==9&&charArray.length==9){
			return true;
		}
		return false;
	}
	public static boolean g(int x,int y){
		String s=x+""+y;
		char[] charArray = s.toCharArray();
		if(s.length()==9){
			Set<Integer> set=new HashSet<Integer>();
			for(int i=0;i<charArray.length;i++){
				if((int)(charArray[i])==48)
					break;
				set.add((int)charArray[i]);
			}
			if(set.size()==9){
				return true;
			}
		}
		return false;
	}
}
