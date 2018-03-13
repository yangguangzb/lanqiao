package java2016;

public class Main11 {
	/*
	生日蜡烛
	某君从某年开始每年都举办一次生日party，并且每次都要吹熄与年龄相同根数的蜡烛。
	现在算起来，他一共吹熄了236根蜡烛。
	请问，他从多少岁开始过生日party的？
	请填写他开始过生日party的年龄数。
	*/
	/*从x岁开始够过生日
	 * x+0
	 * x+1
	 * x+2
	 * x+3
	 * x+4
	 * x+y
	 */
	public static void main(String[] args) {
		//(y+1)*y/2+x*(y+1)=236
		for(int x=1;x<100;x++){
			for(int y=1;y<100;y++){
				if(((y+1)*y/2+x*(y+1))==236){
					System.out.println(x);
				}
			}
		}
	}
}
