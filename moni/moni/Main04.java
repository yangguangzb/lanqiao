package moni;

import java.util.HashSet;
import java.util.Set;

public class Main04 {
	//九宫格
	public static void main(String[] args) {
		dfs(1);
		System.out.println("count="+count);
	}
	static int[] a=new int[10];
	static int[] vis=new int[10];
	static int count=0;
	public static void dfs(int x){
		if(x>9){
			Set<Integer> set=new HashSet<Integer>();
			for(int i=1;i<10;i++){
				set.add(a[i]);
			}
			if(a[1]+a[2]+a[3]==a[4]+a[5]+a[6]&&a[4]+a[5]+a[6]==a[7]+a[8]+a[9]
		&&a[1]+a[4]+a[7]==a[2]+a[5]+a[8]&&a[2]+a[5]+a[8]==a[3]+a[6]+a[9]&&a[1]!=a[2]){
				count++;
				for(int i=1;i<10;i++){
					System.out.print(a[1]+" ");
					if(i%3==0){
						System.out.println();
					}
				}
			}
		}
		for(int i=1;i<10;i++){
			if(vis[i]==0){
				vis[i]=1;
				a[x]=i;
				dfs(x+1);
				vis[i]=0;
			}
		}
	}
}
