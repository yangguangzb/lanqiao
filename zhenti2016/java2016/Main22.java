package java2016;
/**
 * 注意：填空尽量使用已存在的变量
 * @author zhangbiao
 *
 */
public class Main22 {
	/*
	打印方格
	小明想在控制台上输出 m x n 个方格
	*/
	public static void main(String[] args) {
		f(10,4);
	}
	public static void f(int m,int n){
		int row;
		int col;
		for(row=0;row<n;row++){
			for(col=0;col<m;col++){
				System.out.print("+--");
			}
			System.out.println("+");
			for(col=0;col<m;col++){
				System.out.print("|  ");
			}
			System.out.println("|");
		}
		System.out.print("+");
		for(row=0;row<m;row++)System.out.print("--+");	//填空
		System.out.println();
	}
}
