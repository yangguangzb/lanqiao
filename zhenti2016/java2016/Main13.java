package java2016;

import java.util.HashSet;
import java.util.Set;

public class Main13 {
	/*
	方格填数
	如下的10个格子
	   +---+---+---+
	   | a | b | c |
	 +---+---+---+---+
	 | d | e | f | g |
	+--+--+--+--+
	| h | i | j |
	+--+--+--+1 4 2 7 9 6 8 5 3 0
	（如果显示有问题，也可以参看【图1.jpg】）
	填入0~9的数字。要求：连续的两个数字不能相邻。
	（左右、上下、对角都算相邻）
	一共有多少种可能的填数方案？1580
	*/
	public static void main(String[] args) {
		Set<Integer> set;
		int  count=0;
		for(int a=0;a<10;a++){
			for(int b=0;b<10;b++){
				for(int c=0;c<10;c++){
					for(int d=0;d<10;d++){
						for(int e=0;e<10;e++){
							for(int f=0;f<10;f++){
								for(int g=0;g<10;g++){
									for(int h=0;h<10;h++){
										for(int i=0;i<10;i++){
											for(int j=0;j<10;j++){
												set=new HashSet<Integer>();
												set.add(a);
												set.add(b);
												set.add(c);
												set.add(d);
												set.add(e);
												set.add(f);
												set.add(g);
												set.add(h);
												set.add(i);
												set.add(j);
												if(set.size()==10&&(Math.abs(a-b))!=1&&(Math.abs(b-c))!=1&&(Math.abs(d-e))!=1&&(Math.abs(e-f))!=1&&(Math.abs(f-g))!=1
														&&(Math.abs(h-i))!=1&&(Math.abs(i-j))!=1&&(Math.abs(a-e))!=1&&(Math.abs(b-f))!=1&&(Math.abs(c-g))!=1
														&&(Math.abs(d-h))!=1&&(Math.abs(e-i))!=1&&(Math.abs(j-f))!=1&&(Math.abs(a-f))!=1&&(Math.abs(a-d))!=1
														&&(Math.abs(b-e))!=1&&(Math.abs(b-g))!=1&&(Math.abs(c-f))!=1&&(Math.abs(d-i))!=1&&(Math.abs(e-h))!=1
														&&(Math.abs(e-j))!=1&&(Math.abs(i-f))!=1&&(Math.abs(g-j))!=1){
													count++;
													System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h+" "+i+" "+j);
															
													
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}
