package javaModel2015;

public class Main02A {
	/**
	 * 历史上有许多计算圆周率pai的公式，其中，格雷戈里和莱布尼茨发现了下面的公式：
		pai = 4*(1-1/3+1/5-1/7 ....)
		参见【图1.png】
		这个公式简单而优美，但美中不足，它收敛的太慢了。
		如果我们四舍五入保留它的两位小数,那么：
		累积1项是：4.00
		累积2项是：2.67
		累积3项是：3.47
		。。。
		请你写出它累积100项是多少（四舍五入到小数后两位）。
	 */
	public static void main(String[] args) {
		double sum=0.0;
		int num=0;
		for(int i=1;i<=100;i++){
			if(i%2==0){
				num=-(i*2-1);
			}else{
				num=(i*2-1);
			}
			sum=sum+4.0/num;
		}
		System.out.println(String.format("%.2f",sum));
	}
}










