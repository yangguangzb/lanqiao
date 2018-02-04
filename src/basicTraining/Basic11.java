package basicTraining;
import java.util.Scanner;
/**
 * 问题描述
　　从键盘输入一个不超过8位的正的十六进制数字符串，将它转换为正的十进制数后输出。
　　注：十六进制数中的10~15分别用大写的英文字母A、B、C、D、E、F表示。
	样例输入
	FFFF
	样例输出
	65535
 */
public class Basic11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		long sum=0;
		char[] s = n.toCharArray();
		for(int i=0;i<s.length;i++){
			if(s[i]>='A'&&s[i]<='F'){
				sum=sum*16+s[i]-'A'+10;
			}else{
				sum=sum*16+s[i]-'0';
			}
		}
		System.out.println(sum);
	}
}
