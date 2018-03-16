package java2017;

import java.util.Arrays;
import java.util.Scanner;

public class Main10 {
	/*
	标题：日期问题

	小明正在整理一批历史文献。这些历史文献中出现了很多日期。
	小明知道这些日期都在1960年1月1日至2059年12月31日。令小明头疼的是，这些日期采用的格式非常不统一，
	有采用年/月/日的，有采用月/日/年的，还有采用日/月/年的。更加麻烦的是，年份也都省略了前两位，
	使得文献上的一个日期，存在很多可能的日期与其对应。  

	比如02/03/04，可能是2002年03月04日、2004年02月03日或2004年03月02日。  

	给出一个文献上的日期，你能帮助小明判断有哪些可能的日期对其对应吗？

	输入
	----
	一个日期，格式是"AA/BB/CC"。  (0 <= A, B, C <= 9)  

	输入
	----
	输出若干个不相同的日期，每个日期一行，格式是"yyyy-MM-dd"。多个日期按从早到晚排列。  

	样例输入
	----
	02/03/04  

	样例输出
	----
	2002-03-04  
	2004-02-03  
	2004-03-02  
	*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		sc.close();
		int a=Integer.parseInt(str.substring(0,2));
		int b=Integer.parseInt(str.substring(3,5));
		int c=Integer.parseInt(str.substring(6,8));
		int[] z=new int[6];
		//20040302
		z[0]=(a+2000)*10000+b*100+c;
		z[1]=(a+1900)*10000+b*100+c;
		z[2]=(c+1900)*10000+b*100+c;
		z[3]=(c+2000)*10000+b*100+c;
		z[4]=(c+1900)*10000+c*100+b;
		z[5]=(c+2000)*10000+c*100+b;
		int[] y={31,29,31,30,31,30,31,31,30,31,30,31};
		//排序
		Arrays.sort(z);
		//去除不符合要求的
		for(int i=0;i<6;i++){
			int year=z[i]/10000;
			int month=z[i]/100%100;
			int day=z[i]%100;
			if(year<1960||year>2059)
				continue;
			if(month<1||month>12)
				continue;
			if(day<1||day>y[month-1])
				continue;
			if(f(year)){
				y[1]=29;
			}else{
				y[1]=28;
			}
			StringBuffer sb=new StringBuffer(z[i]+"");
			sb.insert(4,'-');
			sb.insert(7,'-');
			System.out.println(sb);
		}
	}
	//判断是否为闰年
	public static boolean f(int x){
		if(x%400==0||(x%4==0&&x%100!=0))
			return true;
		return false;
	}
}
