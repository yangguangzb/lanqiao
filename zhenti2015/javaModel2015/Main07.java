package javaModel2015;
import java.math.BigInteger;
import java.util.Scanner;
/**
 * 思路：
 * 公式：1+1^2+2^2+...+n^2
 * @author zhangbiao
 *
 */
public class Main07 {
	/*
	有n级台阶。从地面（第0级）出发，首先连续的上台阶，上到不超过第n级的某一个位置后再连续的下台阶，
	直到回到地面。若每次上下台阶只允许走1级或2级，请问可能的上下台阶的方案数是多少？
	特别地，在0级站着不动也算一种方案。
	数据格式：
	输入一行包含两个正整数n和m。
	输出一个整数，表示n级台阶有多少种合法的走楼梯方案，答案对m取余。
	例如：输入：
	2 10007
	程序应该输出
	6
	【样例说明1】
	共有6种方案(其中+表示上台阶，-表示下台阶)：
	(1) 原地不动
	(2) +1 -1
	(3) +2 -2
	(4) +2 -1 -1
	(5) +1 +1 -2
	(6) +1 +1 -1 -1
	再例如，输入：
	3 14
	程序应该输出：
	1
	【样例说明2】
	共有15种方案，对14取余后得1。
	【数据规模】
	对于30%的数据，n<=10000；
	对于100%的数据，n<=10^17，m<=2*10^9。
	*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//n表示台阶数
		BigInteger n=sc.nextBigInteger();
		BigInteger m=sc.nextBigInteger();
		BigInteger sum=BigInteger.ZERO;
		BigInteger one=BigInteger.ONE;
		for(BigInteger i=one;i.compareTo(n)<=0;i=i.add(BigInteger.ONE)){
			sum=sum.add(i.pow(2));
		}
		sum=sum.add(BigInteger.ONE);
		System.out.println(sum.remainder(m));
	}
}
