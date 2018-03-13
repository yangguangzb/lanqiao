package java2016;

import java.util.HashSet;
import java.util.Set;

public class Main06 {
	/*
	凑算式

	    B      DEF
	A + --- + ------- = 10
	    C      GHI
	    
	（如果显示有问题，可以参见【图1.jpg】）
		 
		 
	这个算式中A~I代表1~9的数字，不同的字母代表不同的数字。
	
	比如：
	6+8/3+952/714 就是一种解法，
	5+3/1+972/486 是另一种解法。
	
	这个算式一共有多少种解法？
	*/
	public static void main(String[] args) {
		int num=0;
		double sum=0.0;
		Set<Double> set=new HashSet<Double>();
		for(double a=1;a<10;a++){
			for(double b=1;b<10;b++){
				for(double c=1;c<10;c++){
					for(double d=1;d<10;d++){
						for(double e=1;e<10;e++){
							for(double f=1;f<10;f++){
								for(double g=1;g<10;g++){
									for(double h=1;h<10;h++){
										for(double i=1;i<10;i++){
											sum=a+b/c+(d*100+e*10+f)/(g*100+h*10+i);
											set=new HashSet<Double>();
											set.add(a);
											set.add(b);
											set.add(c);
											set.add(d);
											set.add(e);
											set.add(f);
											set.add(g);
											set.add(h);
											set.add(i);
											if(set.size()==9&&sum==10.0){
												num++;
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
		System.out.println(num);
	}
}
