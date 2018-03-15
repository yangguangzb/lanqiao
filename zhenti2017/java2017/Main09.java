package java2017;

public class Main09 {
	/*
	标题：取数位

	求1个整数的第k位数字有很多种方法。
	以下的方法就是一种。
	*/
	public static void main(String[] args) {
		int x = 1234567;
		System.out.println(len(x));
		System.out.println(f(x,6));
	}
	
	static int len(int x){
		if(x<10) return 1;
		return len(x/10)+1;
	}
	
	// 取x的第k位数字
	static int f(int x, int k){
		if(len(x)-k==0) return x%10;
		return f(x/10,k);  		//填空
	}
}
