package java2010;
public class Main02 {
	public static void main(String[] args) {
		double one=1.8,five=1.5,ten=2.0;
		for(int i=1;i<=100;i++){
			for(int j=1;j<=100;j++){
				for(int k=1;k<=100;k++){
					if(i*one==five*j&&five*j==k*ten){
						double sum=i*0.1+j*0.5+k;
						if(sum%10==0){
							System.out.println(i+" "+j+" "+k+" "+sum);
						}
					}
				}
			}
		}
	}
}
