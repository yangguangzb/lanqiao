package java2012;

public class Main01 {
	/*
	微生物增殖
	假设有两种微生物 X和 Y
	  X出生后每隔3分钟分裂一次（数目加倍），Y出生后每隔2分钟分裂一次（数目加倍）。
	    一个新出生的X，半分钟之后吃掉1个Y，并且，从此开始，每隔1分钟吃1个Y。
	    现在已知有新出生的 X=10, Y=89，求60分钟后Y的数目。答案：-979369984
	    如果X=10，Y=90  呢？答案：94371840
	    本题的要求就是写出这两种初始条件下，60分钟后Y的数目。
	  */
	/**
	 * x=10 y=89
	 * @param args
	 */
	public static void main(String[] args) {
		int x=10,y=89;
		for(int i=1;i<=120;i++){
			if(i%2==1){
				y=y-x;
			}
			if(i%6==0){
				x=x*2;
			}
			if(i%4==0){
				y=y*2;
			}
		}
		System.out.println(y);
	}
}
