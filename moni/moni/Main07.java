package moni;

import java.util.Arrays;

public class Main07 {
	//礼物盒
	static int widths[] = {11,8,11,16,1,2,6,10,17,10,6,5,2,19,4,
    7,5,5,15,3,15,11,9,17,9,4,10,12,17,19,20,11,10,20,3};
	static int[] p=new int[20];
	//static int s = 0;
	public static void dfs(int n,int sum,int step){
		if(sum==100){
			int s=0;
		    for(int i = 0;i<20;i++){
		        if(p[i]>0)
		        	s++;
		    }
		    System.out.println(s);
		    System.exit(0);
		}else if(sum>100){
			return;
		}
		
		for(int i = n;i<35;i++){
		    p[step] = widths[n];
		    dfs(i+1,sum+widths[n],step+1);
		    p[step] = 0;
		}
	}
	public static void main(String[] args) {
		Arrays.sort(widths);
		dfs(0,0,0);
	}
}
