package java2015.c;

import java.util.Vector;

/**
 * 2015年省赛java C组
 * @author zhangbiao
 *
 */
public class Main04 {
	/*
	两个整数做除法，有时会产生循环小数，其循环部分称为：循环节。
	比如，11/13=6=>0.846153846153.....  其循环节为[846153] 共有6位。
	下面的方法，可以求出循环节的长度。
	*/
	public static void main(String[] args) {
		System.out.println(f(2,5));
	}
	public static int f(int n, int m)
	{
		n = n % m;	
		Vector v = new Vector();
		
		for(;;)
		{
			v.add(n);
			n *= 10;
			n = n % m;
			if(n==0) return 0;
			if(v.indexOf(n)>=0){
				return v.size();
			}
		}
	}
}
