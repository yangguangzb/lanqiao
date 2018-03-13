package java2016;

import java.util.HashSet;
import java.util.Set;

public class Main07 {
	/*
	搭积木

	小明最近喜欢搭数字积木，
	一共有10块积木，每个积木上有一个数字，0~9。

	搭积木规则：
	每个积木放到其它两个积木的上面，并且一定比下面的两个积木数字小。
	最后搭成4层的金字塔形，必须用完所有的积木。

	下面是两种合格的搭法：

	   0
	  1 2
	 3 4 5
	6 7 8 9

	   0
	  3 1
	 7 5 2
	9 8 6 4    

	请你计算这样的搭法一共有多少种？768

	请填表示总数目的数字。
	注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字。
	*/
	public static void main(String[] args) {
		Set<Integer> set=new HashSet<Integer>();
		int num=0;
		for(int a=1;a<10;a++){
			for(int b=1;b<10;b++){
				for(int c=1;c<10;c++){
					for(int d=1;d<10;d++){
						for(int e=1;e<10;e++){
							for(int f=1;f<10;f++){
								for(int g=1;g<10;g++){
									for(int h=1;h<10;h++){
										for(int i=1;i<10;i++){
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
											if(set.size()==9&&a<c&&a<d&&b<d&&b<e&&c<f&&c<g&&d<g&&d<h&&e<h&&e<i){
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
