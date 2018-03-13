package java2016;
/**
 * 2016省赛Java
 * @author zhangbiao
 *
 */
public class Main02 {
	/*
	煤球数目

	有一堆煤球，堆成三角棱锥形。具体：
	第一层放1个，	1
	第二层3个（排列成三角形），1+2
	第三层6个（排列成三角形），1+2+3
	第四层10个（排列成三角形），1+2+3+4
	....
	如果一共有100层，共有多少个煤球？

	请填表示煤球总数目的数字。
	*/
	public static void main(String[] args) {
		int num=0;
		for(int i=1;i<=100;i++){
			num=num+(1+i)*i/2;
		}
		System.out.println(num);
	}
}
