package java2016;
/**
 * 2016省赛Java
 * @author zhangbiao
 *
 */
public class Main03 {
	/*
	平方怪圈

	如果把一个正整数的每一位都平方后再求和，得到一个新的正整数。
	对新产生的正整数再做同样的处理。

	如此一来，你会发现，不管开始取的是什么数字，
	最终如果不是落入1，就是落入同一个循环圈。

	请写出这个循环圈中最大的那个数字。

	请填写该最大数字。
	4,16,37,58,
	*/
	public static void main(String[] args) {
		int max=0;
		int m=4;
		for(int i=1;i<=100;i++){
			m=f(m);
			if(m>max){
				max=m;
			}
		}
		System.out.println(max);
		
	}
	public static int f(int m){
		int s=0;
		while(m>0){
			s=s+(m%10)*(m%10);
			m=m/10;
		}
		return s;
	}
}
