package java2015.b;
/**
 * 注意：是整数，负数也是可以的
 * @author zhangbiao
 *
 */
public class Main12 {
	/*
	方程整数解
	方程: a^2 + b^2 + c^2 = 1000
	你能算出另一组合适的解吗？
	请填写该解中最小的数字。
	答案：-30
	*/
	public static void main(String[] args) {
		for(int a=-100;a<=100;a++){
			for(int b=-100;b<=100;b++){
				for(int c=-100;c<=100;c++){
					if(a*a+b*b+c*c==1000){
						if(a<b&&b<c){
							System.out.println(a+" "+b+" "+c);
						}
					}
				}
			}
		}
	}
}
