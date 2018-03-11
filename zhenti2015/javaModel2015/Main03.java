package javaModel2015;
/**
 * 2015校内选拔赛
 * @author zhangbiao
 *
 */
public class Main03 {
	/*
	如果x的x次幂结果为10（参见【图1.png】），你能计算出x的近似值吗？

	显然，这个值是介于2和3之间的一个数字。

	请把x的值计算到小数后6位（四舍五入），并填写这个小数值。2.506184
	*/
	public static void main(String[] args) {
		for(double i=1.0;i<3.0;i=i+0.0000001){
			if(Math.abs(10.0-Math.pow(i,i))<0.000001){
				System.out.println(i);
			}
		}
	}
}
