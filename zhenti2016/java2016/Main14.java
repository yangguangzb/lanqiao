package java2016;
public class Main14 {
	static int[] vis=new int[14];
	static int[] a=new int[14];
	public static void main(String[] args) {
		vis[1]=1;
		vis[8]=1;
		vis[3]=1;
		a[1]=1;
		a[2]=8;
		a[12]=3;
		dfs(1);
	}
	
	public static void dfs(int x){
		if(x==1||x==2||x==12){
			dfs(x+1);
			return ;
		}
		if(x>12){
			int[] b=new int[6];
			b[0]=a[2]+a[3]+a[4]+a[5];
			b[1]=a[2]+a[6]+a[9]+a[12];
			b[2]=a[5]+a[7]+a[10]+a[12];
			b[3]=a[1]+a[3]+a[6]+a[8];
			b[4]=a[1]+a[4]+a[7]+a[11];
			b[5]=a[8]+a[9]+a[10]+a[11];
			if(b[0]==b[1]&&b[1]==b[2]&&b[2]==b[3]&&b[3]==b[4]&&b[4]==b[5]){
				for(int i=1;i<13;i++){
					System.out.print(a[i]+" ");
				}
				System.out.println();
			}
		}
		for(int j=2;j<=12;j++){
			if(vis[j]==0){
				vis[j]=1;
				a[x]=j;
				dfs(x+1);
				vis[j]=0;
			}
		}
	}
}
