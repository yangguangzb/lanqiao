package moni;
public class Main09 {
	public static void main(String[] args) {
		int count=0;
		//三位的(从1开始，不是从2开始)
		for(int i=1;i<=9;i++){
			for(int j=0;j<9;j++){
				for(int k=1;k<=9;k++){
					if(i>j&&j<k){
						count++;
					}
				}
			}
		}
		//四位
		for(int a=1;a<=9;a++){
			for(int b=0;b<9;b++){
				for(int c=0;c<9;c++){
					for(int d=1;d<=9;d++){
						//1位递减
						if(a>b&&b<c&&c<d){
							count++;
						}
						//2位递减
						if(a>b&&b>c&&d>c){
							count++;
						}
					}
				}
			}
		}
		
		//五位的
		for(int a=1;a<=9;a++){
			for(int b=0;b<9;b++){
				for(int c=0;c<9;c++){
					for(int d=0;d<9;d++){
						for(int e=1;e<=9;e++){
							//1位递减
							if(a>b&&b<c&&c<d&&d<e){
								count++;
							}
							//2位递减
							if(a>b&&b>c&&c<d&&d<e){
								count++;
							}
							//3位递减
							if(a>b&&b>c&&c>d&&d<e){
								count++;
							}
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}
