package basicTraining;
import java.util.Scanner;
/**
 	问题描述
	利用字母可以组成一些美丽的图形，下面给出了一个例子：
	ABCDEFG
	BABCDEF
	CBABCDE
	DCBABCD
	EDCBABC
	这是一个5行7列的图形，请找出这个图形的规律，并输出一个n行m列的图形。
	
	输入格式
	输入一行，包含两个整数n和m，分别表示你要输出的图形的行数的列数。
	输出格式
	输出n行，每行m个字符，为你的图形。
	样例输入
	5 7
	样例输出
	ABCDEFG
	BABCDEF
	CBABCDE
	DCBABCD
	EDCBABC
	数据规模与约定
	1 <= n, m <= 26。
 */
public class basic03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//n表示行数
		int n=sc.nextInt();
		//m表示列数
		int m=sc.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print((char)('A'+Math.abs(i-j)));
			}
			System.out.println();
		}
		
	}
}
