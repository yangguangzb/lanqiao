package algorithmImprovement;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main01 {
	/*
	九宫格。输入1-9这9个数字的一种任意排序，构成3*3二维数组。
	如果每行、每列以及对角线之和都相等，打印1。否则打印0
	*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] s=new int[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				s[i][j]=sc.nextInt();
			}
		}
		
		int[] num=new int[8];
		
		//计算每行
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				num[i]=num[i]+s[i][j];
			}
		}
		//计算每列
		for(int i=3;i<6;i++){
			for(int j=0;j<3;j++){
				num[i]=num[i]+s[j][i-3];
			}
		}
		//计算对角线
		for(int i=0;i<3;i++){
			num[6]=num[6]+s[i][i];
		}
		for(int i=0;i<3;i++){
			num[7]=num[7]+s[i][2-i];
		}
		
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<num.length;i++){
			set.add(num[i]);
		}
		if(set.size()==1){
			System.out.println(1);
		}else{
			System.out.println(0);
		}
	}
}












