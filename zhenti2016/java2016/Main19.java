package java2016;

public class Main19 {
	
	public static void main(String[] args) {
		dfs(1);
		System.out.println(ans);
	}
	
	static int[] num=new int[15];  
	static int[] vis=new int[15];  
	static int ans=0; 
	
	public static int jud(int n){  
	    if(n==3){  
	        if(num[1]+num[2]==num[3]) return 1;  
	    }  
	    else if(n==6){  
	        if(num[4]-num[5]==num[6]) return 1;  
	    }  
	    else if(n==9){  
	        if(num[7]*num[8]==num[9]) return 1;  
	    }  
	    else if(n==12){  
	        if(num[12]*num[11]==num[10]){  
	            ans++;  
	            return 1;  
	        }  
	    }  
	    else{  
	        return 1;  
	    }  
	    return 0;  
	}  
	
	
	public static void dfs(int n){  
	    if(n>13){  
	        return ;  
	    }  
	    for(int i=1;i<=13;i++){  
	        if(vis[i]==0){  
	            vis[i]=1;  
	            num[n]=i;  
	            if(jud(n)==0){  
	                vis[i]=0;  
	                continue;  
	            }  
	            dfs(n+1);   
	            vis[i]=0;  
	        }  
	    }  
	}  
}
