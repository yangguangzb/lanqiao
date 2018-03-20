package java2013;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Main10 {
	/*
	小明正看着 203879 这个数字发呆。
	原来，203879 * 203879 = 41566646641
	这有什么神奇呢？仔细观察，203879 是个6位数，并且它的每个数位上的数字都是不同的，
	并且它平方后的所有数位上都不出现组成它自身的数字。
	具有这样特点的6位数还有一个，请你找出它！
	再归纳一下筛选要求：
	1. 6位正整数
	2. 每个数位上的数字不同
	3. 其平方数的每个数位不含原数字的任何组成数位
	答案是一个6位的正整数。
	请通过浏览器提交答案。
	注意：只提交另一6位数，题中已经给出的这个不要提交。
	注意：不要书写其它的内容（比如：说明性的文字）。
	答案：639172
	*/
	public static void main(String[] args) {
		for(int i=100000;i<999999;i++){
			String s=i+"";
			Set<Character> set=new HashSet<Character>();
			for(int j=0;j<s.length();j++){
				set.add(s.charAt(j));
				if(set.size()==6){
					//6个数字都不同
					BigDecimal b=new BigDecimal(i);
					BigDecimal ss=b.pow(2);
					String str=ss.toString();//平方后的结果
					Set<Character> sets=new HashSet<Character>();
					boolean boo=true;
					for(int k=0;k<str.length();k++){
						for(int h=0;h<s.length();h++){
							if(str.charAt(k)==(s.charAt(h))){
								//如果含有相同的，则设置为false
								boo=false;
							}
						}
					}
					if(boo){
						System.out.println(s);
						System.out.println(str);
					}
				}
			}
		}
	}
}
