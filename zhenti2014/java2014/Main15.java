package java2014;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/**
 * 思路：转化为数组，再调用Arrays.sort对数组排序
 * 注意：是四个不同的数字
 * @author zhangbiao
 *
 */
public class Main15 {
	/*
	 由4个不同的数字，组成的一个乘法算式，它们的乘积仍然由这4个数字组成。
	 比如：
	 210 x 6 = 1260
	 8 x 473 = 3784
	 27 x 81 = 2187
	 都符合要求。
	 如果满足乘法交换律的算式算作同一种情况，那么，包含上边已列出的3种情况，一共有多少种满足要求的算式。
	 请填写该数字，通过浏览器提交答案，不要填写多余内容（例如：列出所有算式）。
	 */
	public static void main(String[] args) {
		//1-3
		int count=0;
		for(int i=1;i<=9;i++){
			for(int j=100;j<=999;j++){
				String sum=i*j+"";
				String str=i+""+j;
				String s=j+"";
				if(sum.length()==4&&!s.contains(i+"")){
					int m=0;
					char[] ch1 = sum.toCharArray();
					char[] ch2 = str.toCharArray();
					Arrays.sort(ch1);
					Arrays.sort(ch2);
					for(int k=0;k<4;k++){
						if(ch1[k]==ch2[k]){
							m++;
						}
					}
					if(m==4){
						count++;
					}else{
						m=0;
					}
				}
			}
		}
		
		//2-2
		for(int i=10;i<=99;i++){
			for(int j=10;j<=99;j++){
				String sum=i*j+"";
				String str=i+""+j;
				Set<Integer> set=new HashSet<Integer>();
				set.add(i%10);
				set.add(i/10);
				set.add(j%10);
				set.add(j/10);
				//判断条件：乘积4位，i<j，不重复
				if(sum.length()==4&&i<j&&set.size()==4){
					int m=0;
					char[] ch1 = sum.toCharArray();
					char[] ch2 = str.toCharArray();
					Arrays.sort(ch1);
					Arrays.sort(ch2);
					for(int k=0;k<4;k++){
						if(ch1[k]==ch2[k]){
							m++;
						}
					}
					if(m==4){
						count++;
					}else{
						m=0;
					}
				}
			}
		}
		System.out.println(count);
	}
}
