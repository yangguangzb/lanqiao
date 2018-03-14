package java2016;

public class Main16 {
	static int[] vis=new int[11];
	static int[] a=new int[11];
	static int count;
	public static void main(String[] args) {
		count=0;
		a[1]=0;
		vis[0]=1;	//数值0已经被使用
		dfs(1);
		System.out.println(count);
	}
	
	public static void dfs(int x){
		if(x==1){
			dfs(x+1);
			return ;
		}
		if(x>10){
			if(a[2]<a[4]&&a[2]<a[5]&&a[3]<a[5]&&a[3]<a[6]&&a[4]<a[7]
			   &&a[4]<a[8]&&a[5]<a[8]&&a[5]<a[9]&&a[6]<a[9]&&a[6]<a[10]){
				for(int i=1;i<=10;i++){
					System.out.print(a[i]);
				}
				count++;
				System.out.println();
			}
		}
		
		for(int i=1;i<=9;i++){
			if(vis[i]==0){
				vis[i]=1;
				a[x]=i;
				dfs(x+1);
				vis[i]=0;
			}
		}
	}
}
