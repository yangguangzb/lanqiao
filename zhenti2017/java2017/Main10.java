package java2017;

import java.util.Scanner;

public class Main10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		sc.close();
		String[] s=str.split("/");
		int[] a=new int[s.length];
		//年/月/日的，有采用月/日/年的，还有采用日/月/年的
		for(int i=0;i<s.length;i++){
			a[i]=Integer.parseInt(s[i]);
		}
		f(a);
	}
	//判断年份
	public static void f(int[] a){
		//年份在前(a[0]<a[2])
		a[0]=Math.min(a[0],a[2]);
		a[2]=Math.max(a[0],a[2]);
		
		//年份在后
		int min=Math.min(a[0],a[1]);
		int max=Math.max(a[0],a[1]);
		
		
		if(a[0]>=60){
			a[0]=1900+a[0];
		}else{
			a[0]=2000+a[0];
		}
		
		//打印年份在前
		for(int i=0;i<3;i++){
			if(i>0){
				System.out.print("-");
			}
			if(a[i]<10){
				System.out.print("0"+a[i]);
			}else{
				System.out.print(a[i]);
			}
		}
		System.out.println();
		
		if(a[2]>=60){
			a[2]=a[2]+1900;
		}else{
			a[2]=2000+a[2];
		}
		//打印年份在后
		System.out.print(a[2]);
		System.out.print("-");
		if(min<10){
			System.out.print("0"+min);
		}else{
			System.out.print(min);
		}
		System.out.print("-");
		if(max<10){
			System.out.print("0"+max);
		}else{
			System.out.print(max);
		}
		System.out.println();
		
		
		
		System.out.print(a[2]);
		System.out.print("-");
		if(max<10){
			System.out.print("0"+max);
		}else{
			System.out.print(max);
		}
		System.out.print("-");
		if(min<10){
			System.out.print("0"+min);
		}else{
			System.out.print(min);
		}
		
	}
}
