package moni;

public class Main10 {
	public static void main(String[] args) {
		int[] a=new int[1001];
		for(int i=0;i<1001;i++){
			a[i]=1;
		}
		//3的倍数
		for(int i=1;i<=1000;i++){
			if(i%3==0){
				a[i]=0;
			}
		}
		//5的倍数
		for(int i=1;i<=1000;i++){
			if(i%5==0){
				if(a[i]==0){
					a[i]=1;
				}else{
					a[i]=0;
				}
			}
		}
		//7的倍数
		for(int i=1;i<=1000;i++){
			if(i%7==0){
				if(a[i]==0){
					a[i]=1;
				}else{
					a[i]=0;
				}
			}
		}
		int count=0;
		for(int i=1;i<=1000;i++){
			if(a[i]==1){
				count++;
			}
		}
		System.out.println(count);
	}
}
