package Test;

public class Main {
	/*
	 幻方是把一些数字填写在方阵中，使得行、列、两条对角线的数字之和都相等。
	 欧洲最著名的幻方是德国数学家、画家迪勒创作的版画《忧郁》中给出的一个4阶幻方。
	 他把1,2,3,…16 这16个数字填写在4 x 4的方格中16 3 2 13 5 10 11 8 9 6 7 12 4 15 14 1 
	 16 ?  ? 13
	 ?  ?  11 ?
	 9  ?  ?  *
	 ? 15  ?  1
	 答案：12
	 */
	
	public static void main(String[] args) {
		//把已经访问过的标记为1，不是下标有没有被访问，而是具体的值
		vis[16]=vis[13]=vis[11]=vis[9]=vis[15]=vis[1]=1;
		a[1]=16;
		a[4]=13;
		a[7]=11;
		a[9]=9;
		a[14]=15;
		a[16]=1;
		dfs(1);
	}
	static int[] vis=new int[17];
	static int[] a=new int[17];
	public static void dfs(int step){
		//被访问过的，访问下一个
		if(step==1||step==4||step==7||step==9||step==14||step==16){
			step++;
		}
		if(step>16){
			int row1=a[1]+a[2]+a[3]+a[4];
			int row2=a[5]+a[6]+a[7]+a[8];
			int row3=a[9]+a[10]+a[11]+a[12];
			int row4=a[13]+a[14]+a[15]+a[16];
			
			int col1=a[1]+a[5]+a[9]+a[13];
			int col2=a[2]+a[6]+a[10]+a[14];
			int col3=a[3]+a[7]+a[11]+a[15];
			int col4=a[4]+a[8]+a[12]+a[16];
			
			int dui1=a[1]+a[6]+a[11]+a[16];
			int dui2=a[4]+a[7]+a[10]+a[13];
			if(row1==row2&&row2==row3&&row3==row4&&row4==col1&&col1==col2&&
					col2==col3&&col3==col4&&col4==dui1&&dui1==dui2){
				for(int i=1;i<=16;i++){
					System.out.print(a[i]+" ");
				}
			}
		}
		for(int i=1;i<=16;i++){
			if(vis[i]==0){
				vis[i]=1;
				a[step]=i;
				dfs(step+1);
				vis[i]=0;
			}
		}
		
	}
	
}
