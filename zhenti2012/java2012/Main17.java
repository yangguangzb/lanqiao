package java2012;

import java.util.Scanner;

public class Main17 {
	static String[] str;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		str=new String[n];
		for(int i=0;i<n;i++){
			str[i]=sc.next();
		}
		for(int j=0;j<n;j++){
			f(str[j]);
			System.out.println();
		}
		
	}
	public static void f(String ss){
		int len=ss.length();
		int[] num=new int[6];
		for(int i=0;i<len;i++){
			 num[i%6]=num[i%6]+(ss.charAt(i));
		}
		for(int i=0;i<6;i++){
			System.out.print(ya(num[i]+"",0));
		}
	}
	//压缩
	public static int ya(String m,int num){
		char[] ch = m.toCharArray();
		int[] a=new int[ch.length];
		for(int i=0;i<ch.length;i++){
			a[i]=ch[i]-'0';
		}
		for(int i=0;i<a.length;i++){
			num=num+a[i];
		}
		if(num>=10){
			return ya(num+"",0);
		}
		return num;
	}
	
	//对压缩的优化
	/*public static void main(String[] args) {
		int m=f(123);
		while(m>10){
			m=f(m);
		}
		System.out.println(m);
	}
	public static int f(int m){
		int sum=0;
		while(m>0){
			sum=sum+m%10;
			m=m/10;
		}
		return sum;
	}*/
}
