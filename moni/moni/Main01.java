package moni;

public class Main01 {
	/*
	某君的年龄是个两位数，如果把他年龄的两位数字交换位置后与原数字相加和为 xxx，
	与原数字相减差的绝对值为 yyy。已知 xxx 比 yyy 大 32。请你计算 yyy 的值是多少
	*/
	public static void main(String[] args) {
		int x,y;
		for(int i=10;i<100;i++){
			int a=i/10;	//十位
			int b=i%10;	//个位
			x=i+b*10+a;
			y=Math.abs((b*10+a)-i);
			if(x==y+32){
				System.out.println(y);
			}
		}
	}
}
