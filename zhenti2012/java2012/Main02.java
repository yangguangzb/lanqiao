package java2012;

import java.util.HashSet;
import java.util.Set;

public class Main02 {
	/*
	  福尔摩斯到某古堡探险，看到门上写着一个奇怪的算式：
      ABCDE * ? = EDCBA
	    他对华生说：“ABCDE应该代表不同的数字，问号也代表某个数字！”
	    华生：“我猜也是！”
	    于是，两人沉默了好久，还是没有算出合适的结果来。
	    请你利用计算机的优势，找到破解的答案。
	    把 ABCDE 所代表的数字写出来。
	  答案：21978
	  */
	public static void main(String[] args) {
		for(int j=1;j<=9;j++){
			for(int i=12345;i<=98765;i++){
				int a=i/10000;//万
				int b=i/1000%10;//千
				int c=i/100%10;//百
				int d=i/10%10;//十
				int e=i%10;//个
				Set<Integer> set=new HashSet<Integer>();
				set.add(a);
				set.add(b);
				set.add(c);
				set.add(d);
				set.add(e);
				if(set.size()==5){
					int num=e*10000+d*1000+c*100+b*10+a;
					if(j*i==num){
						System.out.println(i);
					}
				}
			}
		}
	}
}
