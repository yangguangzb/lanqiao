package java2016;
public class Main14 {
	/**
	 * 填方格(dfs深度搜索)
	 * @param args
	 */
	static int[] vis=new int[11];
	static int[] a=new int[11];
	static int count;
	public static void main(String[] args) {
		count=0;
		dfs(1);
		System.out.println(count);
	}
	public static void dfs(int x){
		if(x>10){
			if(Math.abs(a[1]-a[2])>1 && Math.abs(a[1]-a[4])>1 && Math.abs(a[1]-a[5])>1 && Math.abs(a[1]-a[6])>1 &&  
	           Math.abs(a[2]-a[3])>1 && Math.abs(a[2]-a[5])>1 && Math.abs(a[2]-a[6])>1 && Math.abs(a[2]-a[7])>1 &&  
	           Math.abs(a[3]-a[6])>1 && Math.abs(a[3]-a[7])>1 && Math.abs(a[4]-a[5])>1 && Math.abs(a[4]-a[8])>1 && 
	           Math.abs(a[4]-a[9])>1 && Math.abs(a[5]-a[6])>1 && Math.abs(a[5]-a[8])>1 && Math.abs(a[5]-a[9])>1 && 
	           Math.abs(a[5]-a[10])>1 && Math.abs(a[6]-a[7])>1 && Math.abs(a[6]-a[9])>1 && Math.abs(a[6]-a[10])>1 &&  
	           Math.abs(a[7]-a[10])>1 && Math.abs(a[8]-a[9])>1 &&Math.abs(a[9]-a[10])>1){
				count++;
				for(int i=1;i<11;i++){
					System.out.print(a[i]);
				}
				System.out.println();
			}
		}
		
		for(int i=0;i<10;i++){
			if(vis[i]==0){	//该位置没有填数字
				vis[i]=1;	//标记以填的数字
				a[x]=i;		//赋值
				dfs(x+1);	//填下一个数字
				vis[i]=0;	//清空数字
				
			}
		}
	}
}
