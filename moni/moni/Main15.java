package moni;
/*  推到公式
A2=2*A1-A0;
A3=2*A2-A1=3A1-2*A0;
A4=2*A3-A2=4*A1-3*A0;
*/
import java.util.Scanner;
public class Main15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double a0=sc.nextDouble();
		double an1=sc.nextDouble();
		double[] c=new double[n+1];
		c[0]=0.0;
		for(int i=1;i<=n;i++){
			c[i]=sc.nextDouble();
		}
		double sum=0.0;
		for(int i=n;i>=1;i--){
			sum=sum+2*(i)*c[n-i+1];
		}
		System.out.println(String.format("%.2f",(an1+n*a0-sum)/(n+1)));
	}
}
