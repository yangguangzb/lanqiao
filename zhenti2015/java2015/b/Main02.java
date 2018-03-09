package java2015.b;

import java.util.ArrayList;
import java.util.List;

/**
 * 2015年省赛java B组
 * @author zhangbiao
 *
 */
public class Main02 {
	/*
	立方变自身

	观察下面的现象,某个数字的立方，按位累加仍然等于自身。
	1^3 = 1 
	8^3  = 512    5+1+2=8
	17^3 = 4913   4+9+1+3=17
	...
	
	请你计算包括1,8,17在内，符合这个性质的正整数一共有多少个？
	*/
	public static void main(String[] args) {
		int k=0;
		for(int i=1;i<=1000;i++){
			int sum=i*i*i;
			if(i==f(sum)){
				k++;
			}
		}
		System.out.println(k);
	}
	public static int f(int sum){
		int m=0;
		List<Integer> list=new ArrayList<Integer>();
		while(sum>0){
			list.add(sum%10);
			sum=sum/10;
		}
		for(int i=0;i<list.size();i++){
			m=m+list.get(i);
		}
		return m;
	}
}
