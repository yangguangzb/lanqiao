package java2013;

public class Main08 {
	/*
	 幻方是把一些数字填写在方阵中，使得行、列、两条对角线的数字之和都相等。
	 欧洲最著名的幻方是德国数学家、画家迪勒创作的版画《忧郁》中给出的一个4阶幻方。
	 他把1,2,3,…16 这16个数字填写在4 x 4的方格中16 3 2 13 5 10 11 8 9 6 7 12 4 15 14 1 
	 16 ?  ? 13
	 ?  ? 11 ?
	 9  ? ?  *
	 ? 15 ?  1
	 答案：12
	 */
	
	public static void main(String[] args) {
		//把已经有的标记为1，被访问过
		vis[16]=vis[13]=vis[11]=vis[9]=vis[15]=vis[1]=1;
		//设置已经被访问过的值
		a[1]=16;
		a[4]=13;
		a[7]=11;
		a[9]=9;
		a[14]=15;
		a[16]=1;
		f(1);
		
	}
	static int[] a=new int[17];
	static int[] vis=new int[17];
	public static void f(int x){
		//被访问过的,访问下一个x++
		if(x==1||x==4||x==7||x==9||x==14||x==16){
			x++;
		}
		if(x>10){
			int b1=a[1]+a[2]+a[3]+a[4];
			int b2=a[5]+a[6]+a[7]+a[8];
			int b3=a[9]+a[10]+a[11]+a[12];
			int b4=a[13]+a[14]+a[15]+a[16];
			int c1=a[1]+a[5]+a[9]+a[13];
			int c2=a[2]+a[6]+a[10]+a[14];
			int c3=a[3]+a[7]+a[11]+a[15];
			int c4=a[4]+a[8]+a[12]+a[16];
			int d1=a[1]+a[6]+a[11]+a[16];
			int d2=a[4]+a[7]+a[10]+a[13];
			//判断行，列，对角线
			if(b1==b2&&b2==b3&&b3==b4&&b4==c1&&c1==c2&&c2==c3&&c3==c4&&c4==d1&&d1==d2){
				for(int i=1;i<=16;i++){
					System.out.print(a[i]+" ");
				}
			}
			
		}
		for(int i=1;i<17;i++){
			if(vis[i]==0){	//未被访问
				vis[i]=1;	//设置被访问
				a[x]=i;		
				f(x+1);
				vis[i]=0;
			}
		}
		
	}
}
