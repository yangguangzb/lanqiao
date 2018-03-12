package javaModel2015;

public class Main03A {
	/*
	1193是个素数，对它循环移位后发现：
	1931,9311,3119也都是素数，这样特征的数叫：循环素数。

	你能找出具有这样特征的5位数的循环素数吗？12345 
								   23451 34512 45123 51234 

	当然，这样的数字可能有很多，请写出其中最大的一个。

	注意：答案是个5位数，不要填写任何多余的内容。99371
	*/
	public static void main(String[] args) {
		//从大的向小的循环
		for(int j=100000;j>10000;j--){
			if(f(j)){
				int a=j/10000;	//万
				int b=j/1000%10;//千
				int c=j/100%10;//百
				int d=j/10%10;//十
				int e=j%10;//个
				int num1=b*10000+c*1000+d*100+e*10+a;
				int num2=c*10000+d*1000+e*100+a*10+b;
				int num3=d*10000+e*1000+a*100+b*10+c;
				int num4=e*10000+a*1000+b*100+c*10+d;
				if(f(num1)&&f(num2)&&f(num3)&&f(num4)){
					System.out.println(j);
					return ;
				}
			}
		}
	}
	//return true 是素数
	public static boolean f(int m){
		if(m==2||m==3){
			return true;
		}
		for(int i=2;i<=Math.sqrt(m);i++){
			if(m%i==0){
				return false;
			}
		}
		return true;
	}
}
