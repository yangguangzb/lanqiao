package java2016;

public class Main20 {
	/*
	网友年龄
	某君新认识一网友。
	当问及年龄时，他的网友说：
	“我的年龄是个2位数，我比儿子大27岁,
	如果把我的年龄的两位数字交换位置，刚好就是我儿子的年龄”
	请你计算：网友的年龄一共有多少种可能情况？
	提示：30岁就是其中一种可能哦.
	请填写表示可能情况的种数。7种
	*/
	public static void main(String[] args) {
		int count=0;
		for(int i=27;i<100;i++){
			int num=f(i);
			if(num+27==i){
				count++;
			}
		}
		System.out.println("count="+count);
	}
	public static int f(int i){
		int a=i%10;//个位
		int b=i/10;//十位
		int sum=a*10+b;
		return sum;
	}
}
