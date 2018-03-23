package moni;
public class Main02 {
	//方程的解
	public static void main(String[] args) {
		int sum1,sum2;
		for(int x=1;x<300;x++){
			for(int y=1;y<300;y++){
				for(int z=1;z<300;z++){
					sum1=11*x+13*y+17*z;
					sum2=13*x+17*y+11*z;
					if(sum1==2471&&sum2==2739){
						System.out.println(x+y+z);
					}
				}
			}
		}
	}
}
