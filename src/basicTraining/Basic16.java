package basicTraining;

import java.util.Scanner;

/*
	问题描述
	求出区间[a,b]中所有整数的质因数分解。
	输入格式
	输入两个整数a，b。
	输出格式
	每行输出一个数的分解，形如k=a1*a2*a3...(a1<=a2<=a3...，k也是从小到大的)(具体可看样例)
	样例输入
	3 10
	样例输出
	3=3
	4=2*2
	5=5
	6=2*3
	7=7
	8=2*2*2
	9=3*3
	10=2*5
	提示
	先筛出所有素数，然后再分解。
	数据规模和约定
	2<=a<=b<=10000
*/
public class Basic16 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		Basic16 test=new Basic16();
		for(int i=a;i<=b;i++){
			int temp=i,flag=0;
			System.out.print(i+"=");
			while(temp!=1){
				for(int j=2;j<=temp;j++){
					if(test.isPrime(j)==1&&temp%j==0){
						temp=temp/j;
						if(flag==1){
							System.out.print("*");
						}
						System.out.print(j);
						flag=1;
						//break 从头开始计算
						break;
					}
				}
			}
			System.out.println();
		}
	}
	//判断是否为素数，返回值1:素数，返回值0:偶数
	public int isPrime(int n){
		if(n<=1){
			return 0;
		}else if(n==2||n==3){
			return 1;
		}else{
			for(int i=2;i*i<=n;i++){
				if(n%i==0){
					return 0;
				}
			}
			return 1;
		}
	}
}
