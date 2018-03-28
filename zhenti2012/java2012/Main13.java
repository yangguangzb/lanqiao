package java2012;

import java.math.BigInteger;

public class Main13 {
	public static void main(String[] args) {
		BigInteger sum=BigInteger.ZERO;
		for(int i=1;i<=64;i++){
			sum=sum.add(BigInteger.valueOf(2).pow(i-1));
		}
		System.out.println(sum.toString());
		System.out.println(BigInteger.valueOf(2).pow(64).subtract(BigInteger.ONE));
	}
}
