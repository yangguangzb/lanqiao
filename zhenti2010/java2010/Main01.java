package java2010;
import java.util.Scanner;
public class Main01 {
	/*
	在西方，星期五和数字 13 都代表着坏运气，两个不幸的个体最后结合成超级不幸的一天。
	所以，不管哪个月的十三日又恰逢星期五就叫“黑色星期五”。
	要求：输入年份，输出是：判断该年是否包含黑色星期五，如包含，给出具体日期
	*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		int day=13;
		//该年的1，2月份使用上一年的13,14月份来计算的
		//先计算1，2月份
		//int sum=(year+year/4-year/100+year/400+day+)%7;
		int year2=year-1;
		for(int i=13;i<=14;i++){
			if((year2+year2/4-year2/100+year2/400+13+i*2+3*(i+1)/5)%7==4){
				System.out.println(year+"-"+(i-12)+"-"+13);
			}
		}
		//其他月份
		for(int i=3;i<=12;i++){
			if((year+year/4-year/100+year/400+day+2*i+3*(i+1)/5)%7==4){
				System.out.println(year+"-"+i+"-"+13);
			}
		}
	}
}
