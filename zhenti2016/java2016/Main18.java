package java2016;

public class Main18 {
	static int[] a=new int[14];
	static int[] vis=new int[14];
	static int count;
	public static void main(String[] args) {
		count=0;
		dfs(1);
		System.out.println(count);
	}
	
	public static void dfs(int x){
		if(x>13){
			return ;
		}
		if(x>3&&a[1]+a[2]!=a[3])
			return ;
		if(x>6&&a[4]-a[5]!=a[6])
			return ;
		if(x>12&&a[10]==a[11]*a[12]){
			count++;
		}
		
		for(int i=1;i<=13;i++){
			if(vis[i]==0){
				vis[i]=1;
				a[x]=i;
				dfs(x+1);
				vis[i]=0;
			}
		}
	}
}
