package java2015.b;

public class Main09 {
	/*
	星系炸弹
	在X星系的广袤空间中漂浮着许多X星人造“炸弹”，用来作为宇宙中的路标。
	每个炸弹都可以设定多少天之后爆炸。
	比如：阿尔法炸弹2015年1月1日放置，定时为15天，则它在2015年1月16日爆炸。
	有一个贝塔炸弹，2014年11月9日放置，定时为1000天，请你计算它爆炸的准确日期。
	请填写该日期，格式为 yyyy-mm-dd  即4位年份2位月份2位日期。比如：2015-02-19
	请严格按照格式书写。不能出现其它文字或符号。
	*/
	//2017-08-05
	public static void main(String[] args) {
		int year=2017;
		if(year%400==0||(year%4==0&&year%100!=0)){
			System.out.println(366);
		}else{
			System.out.println(365);
		}
	}
}
