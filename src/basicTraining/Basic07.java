package basicTraining;
/** 问题描述
　　 153是一个非常特殊的数，它等于它的每位数字的立方和，即153=1*1*1+5*5*5+3*3*3。
	编程求所有满足这种条件的三位十进制数。
	输出格式
　　按从小到大的顺序输出满足条件的三位十进制数，每个数占一行。
 */
public class Basic07 {
	public static void main(String[] args) {
		Basic07 bs=new Basic07();
		bs.fun1();
	}
	//方法一
	public void fun1(){
		int a,b,c;
		for(int i=100;i<1000;i++){
			a=i/100;//百位
			b=i/10%10;//十位
			c=i%10;//个位
			if(i==(a*a*a+b*b*b+c*c*c)){
				System.out.println(i);
			}
		}
	}
	//方法二
	public void fun2(){
		for(int a=1;a<=9;a++){
			for(int b=0;b<=9;b++){
				for(int c=0;c<=9;c++){
					if((a*a*a+b*b*b+c*c*c)==(a*100+b*10+c)){
						System.out.println(a*100+b*10+c);
					}
				}
			}
		}
	}
}
