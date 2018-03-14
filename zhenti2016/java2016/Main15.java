package java2016;

public class Main15 {
	public static void main(String[] args) {
		count=0;  
		dfs(1);  
	    System.out.println(count); 
	}
	static int[] a=new int[11];
	static int[] vis=new int[11];
	static int count; 
	public static void dfs(int x){
		 if(x>10)//所有方格填数完毕   
		    {  
		        if(Math.abs(a[1]-a[2])>1 && Math.abs(a[1]-a[4])>1 && Math.abs(a[1]-a[5])>1 && Math.abs(a[1]-a[6])>1 &&  
		        		Math.abs(a[2]-a[3])>1 && Math.abs(a[2]-a[5])>1 && Math.abs(a[2]-a[6])>1 && Math.abs(a[2]-a[7])>1 &&  
		        		Math.abs(a[3]-a[6])>1 && Math.abs(a[3]-a[7])>1 &&  
		        		Math.abs(a[4]-a[5])>1 && Math.abs(a[4]-a[8])>1 && Math.abs(a[4]-a[9])>1 &&  
		        		Math.abs(a[5]-a[6])>1 && Math.abs(a[5]-a[8])>1 && Math.abs(a[5]-a[9])>1 && Math.abs(a[5]-a[10])>1 &&  
		        		Math.abs(a[6]-a[7])>1 && Math.abs(a[6]-a[9])>1 && Math.abs(a[6]-a[10])>1 &&  
		        		Math.abs(a[7]-a[10])>1 &&  
		        		Math.abs(a[8]-a[9])>1 &&  
		        		Math.abs(a[9]-a[10])>1)  
		            {  
		                //输出每种情况   
		              for(int i=1;i<=10;i++)
		            	  System.out.print(a[i]);
		                  count++; 
		                  System.out.println();
		            }  
		    }  
		    for(int i=0;i<=9;i++)  
		        if(vis[i]==0)  
		        {  
		            vis[i]=1;//将用过的数标记   
		            a[x]=i;//填数   
		            dfs(x+1);//对下一个方格继续填数   
		            vis[i]=0;//清除标记   
		        }  
	}
}
