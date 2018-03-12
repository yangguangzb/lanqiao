package javaModel2015;
/**
 * 2015校内选拔赛C组
 * @author zhangbiao
 *
 */
public class Main01C {
	/*
	其排列规律：
	1
	1    1
	1    2    1
	1    3    3    1
	1    4    6    4    1
	1    5    10   10   5    1
	1    6    15   20   15   6    1
	1    7    21   35   35   21   7    1

	如下的程序，用来建立N行的杨辉三角形。请填写划线部分缺少的代码
	*/
	public static void main(String[] args) {
		int N = 8;
		int[][] a = new int[N][N] ;
		
		for(int i=0; i<N; i++){
			a[i][0] = 1;
			a[i][i] = 1;
		}
		
		for(int i=1; i<N; i++){
			for(int j=1; j<i; j++){
				a[i][j]=a[i-1][j]+a[i-1][j-1];					 //填空
			}
		}
		
		for(int i=0; i<N; i++){
			for(int j=0; j<=i; j++)	
			System.out.print(String.format("%-5d", a[i][j]));
			System.out.println();
		}	
	}
}
