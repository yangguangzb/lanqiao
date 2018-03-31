package Test;

public class Main20 {
	/*
	九数组分数
	1,2,3...9 这九个数字组成一个分数，其值恰好为1/3，如何组法
	*/
	public static void main(String[] args) {
		dfs(1);
	}
	static int[] a=new int[9];
	public static void dfs(int index){
		if(index>9){
			int x=1000*a[0]+100*a[1]+10*a[2]+a[3];
			int y=10000*a[4]+1000*a[5]+100*a[6]+10*a[7]+a[8];
			if(x*3==y){
				System.out.println(x+"--"+y);
			}
		}
		for(int i=0;i<9;i++){
			if(a[i]==0){
				a[i]=index;
				dfs(index+1);
				a[i]=0;
			}
		}
	}
}
