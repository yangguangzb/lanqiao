package java2016;

public class Main08 {
	/*
	搭积木

	小明最近喜欢搭数字积木，
	一共有10块积木，每个积木上有一个数字，0~9。

	搭积木规则：
	每个积木放到其它两个积木的上面，并且一定比下面的两个积木数字小。
	最后搭成4层的金字塔形，必须用完所有的积木。

	下面是两种合格的搭法：

	   0
	  1 2
	 3 4 5
	6 7 8 9

	   0
	  3 1
	 7 5 2
	9 8 6 4    

	请你计算这样的搭法一共有多少种？768

	请填表示总数目的数字。
	注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字。
	*/
	public static void main(String[] args) {
		dfs(0); 
		System.out.println(count);
	}
	static int count = 0;
	static int[] a=new int[10];  
    static boolean[] visit=new boolean[10]; 
	public static void dfs(int step){
		if(step == 10)  
	    {  
	        if(a[0] < a[1] && a[0] < a[2]  
	            && a[1] < a[3] && a[1] < a[4] && a[2] < a[4] && a[2] < a[5]  
	            && a[3] < a[6] && a[3] < a[7] && a[4] < a[7] && a[4] < a[8] && a[5] < a[8] && a[5] < a[9]){  
	                count++;  
	        }  
	        return;  
	    }  
	    for(int i = 0;i < 10;i ++)  
	    {  
	        if(visit[i] == false)  
	        {  
	            a[step] = i+1;  
	            visit[i] = true;  
	            dfs(step+1);  
	            visit[i] = false;  
	        }  
	    }  
	    return;  
	}
}
