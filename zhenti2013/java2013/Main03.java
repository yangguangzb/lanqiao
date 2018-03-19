package java2013;

import java.math.BigDecimal;

public class Main03 {
	/*
		黄金分割数0.61803... 是个无理数，这个常数十分重要，
		在许多工程问题中会出现。有时需要把这个数字求得很精确
		答案：0.618033988749894848204586834
		36563811772030917980576286
		21354486227052604628189024
		497072072041893911375

	*/
	public static void main(String[] args) {
		BigDecimal s=BigDecimal.ONE;
		for(int i=1;i<1001111;i++){
			//s=1/(s+1);
			s=s.add(BigDecimal.ONE);
			s=BigDecimal.ONE.divide(s,100,BigDecimal.ROUND_UP);
		}
		System.out.println(s.toString());
	}
}
