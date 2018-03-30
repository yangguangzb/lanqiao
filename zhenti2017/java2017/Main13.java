package java2017;

import java.util.Scanner;

public class Main13 {
	public static int gcd(int a, int b){  
	    return b == 0 ? a : gcd(b, a%b);  
	}  
	static int n;  
	static int[] a=new int[105];  
	static int[] dp=new int[100*100+5];  
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
	    for(int i = 0; i < n; i++){  
	        a[i]=sc.nextInt();
	    }  
	    // 判断是否互质   
	    int g = a[0];  
	    for(int i = 1; i < n; i++){  
	        g = gcd(g, a[i]);  
	    }  
	    if(g != 1){
	    	System.out.println("INF");
	    	return ;
	    }  
	    dp[0] = 1; // 完全背包标记能凑到的数为true(1)   
	    for(int i = 0; i < n; i++){  
	        for(int j = 0; j+a[i] < 100*100+5; j++){  
	            if(dp[j]==1){
	            	dp[j+a[i]] = 1;  
	            }
	        }  
	    }  
	    int cnt = 0;  
	    for(int i = 0;i < 100*100+5; i++){  
	        if(dp[i]==0){
	        	cnt++;  
	        }
	    }  
	    System.out.println(cnt);
	}
}
