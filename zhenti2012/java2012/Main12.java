package java2012;

public class Main12 {
	public static void main(String[] args) {
		//1948-6-12  19480612
		for(int i=1900;i<=2015;i++){
			for(int j=1;j<=30;j++){
				int num=i*10000+6*100+j;
				if(num%2012==0&&num%3==0&&num%12==0){
					System.out.println(num);
				}
			}
		}
	}
}
