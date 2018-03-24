package moni;

import java.util.HashSet;
import java.util.Set;
/**
 * 思路：dfs
 * 优化：先判断等于6是，前面六个是否相等，不相等的话，就不需要判断后面6位了，
 * @author zhangbiao
 *
 */
public class Main06 {
	public static void main(String[] args) {
		dfs(1);
		System.out.println(count);
	}
	static int count=0;
	static int[] a=new int[14];
	static int[] vis=new int[14];
	public static void dfs(int x){
		if(x==7){
			if((a[1]*a[2]+a[3]*a[4])!=a[5]*a[6]){
				return ;
			}
		}
		if(x==13){
			Set<Integer> set=new HashSet<Integer>();
			for(int i=1;i<=12;i++){
				set.add(a[i]);
			}
			if((a[7]*a[8]-a[9]*a[10]==a[11]*a[12])&&set.size()==12){
				count++;
			}
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
