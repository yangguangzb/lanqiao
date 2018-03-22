package moni2018;
public class Main01 {
	/*
	今天蒜头君带着花椰妹和朋友们一起聚会，当朋友们问起年龄的时候，
	蒜头君打了一个哑谜（毕竟年龄是女孩子的隐私）说：“我的年龄是花椰妹年龄个位数和十位数之和的二倍”。
	花椰妹看大家一脸懵逼，就知道大家也不知道蒜头君的年龄，
	便连忙补充道：“我的年龄是蒜头君个位数和十位数之和的三倍”。
	请你计算：蒜头君和花椰妹年龄一共有多少种可能情况？
	提醒：两位的年龄都是在 [10,100)[10,100)[10,100) 这个区间内
	*/
	public static void main(String[] args) {
		int x,y;
		int count=0;
		for(int i=10;i<100;i++){
			x=i;
			int a=x/10;
			int b=x%10;
			for(int j=10;j<100;j++){
				y=j;
				int c=y/10;
				int d=y%10;
				if((c+d)*2==x&&(a+b)*3==y){
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
