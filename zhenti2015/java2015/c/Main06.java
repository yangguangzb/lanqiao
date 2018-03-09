package java2015.c;

import java.util.HashSet;
import java.util.Set;

/**
 * 2015年省赛java C组
 * @author zhangbiao
 *
 */
public class Main06 {
	/*
	奇妙的数字

	小明发现了一个奇妙的数字。它的平方和立方正好把0~9的10个数字每个用且只用了一次。
	你能猜出这个数字是多少吗？
	*/
	public static void main(String[] args) {
		Set<Integer> set=new HashSet<Integer>();
		int num=0,qua=0,cube=0,n=0;
		while(n!=10){
			set=new HashSet<Integer>();
			num++;
			qua=num*num;
			cube=num*num*num;
			while(qua>0){
				set.add(qua%10);
				qua=qua/10;
			}
			while(cube>0){
				set.add(cube%10);
				cube=cube/10;
			}
			n=set.size();
		}
		System.out.println("这个数为："+num);
	}
}
