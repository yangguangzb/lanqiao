package javaModel2015;

import java.util.Scanner;

public class Main08 {
	/*
	你一定听说过“数独”游戏。
	如【图1.png】，玩家需要根据9×9盘面上的已知数字，推理出所有剩余空格的数字，并满足每一行、每一列、
	每一个同色九宫内的数字均含1-9，不重复。
	数独的答案都是唯一的，所以，多个解也称为无解。
	本图的数字据说是芬兰数学家花了3个月的时间设计出来的较难的题目。但对会使用计算机编程的你来说，恐怕易如反掌了。
	本题的要求就是输入数独题目，程序输出数独的唯一解。我们保证所有已知数据的格式都是合法的，并且题目有唯一的解。
	格式要求，输入9行，每行9个字符，0代表未知，其它数字为已知。
	输出9行，每行9个数字表示数独的解。
	例如：
	输入（即图中题目）：
	005300000
	800000020
	070010500
	400005300
	010070006
	003200080
	060500009
	004000030
	000009700
	程序应该输出：
	145327698
	839654127
	672918543
	496185372
	218473956
	753296481
	367542819
	984761235
	521839764
	再例如，输入：
	800000000
	003600000
	070090200
	050007000
	000045700
	000100030
	001000068
	008500010
	090000400
	程序应该输出：
	812753649
	943682175
	675491283
	154237896
	369845721
	287169534
	521974368
	438526917
	796318452
	*/
	static int[][] a=new int[10][10];//存储数字
	public static int is_row_col_repeat(int row,int col,int num){//判断行列是否重复
	    //判断行是否重复
	    for (int i=1;i<=9;i++) {
	        if (a[row][i]==num) {
	            return 0;//行重复，返回0
	        }
	    }
	    //判断列是否重复
	    for (int i=1;i<=9;i++) {
	        if (a[i][col]==num) {
	            return 0;//列重复，返回0
	        }
	    }
	    return 1;//行列不重复，返回1
	}
	public static int check_row_range(int row){//判断行的范围
	    if (row>=1 && row<=3) {
	        return 1;
	    }else if(row>=4&&row<=6){
	        return 4;
	    }else {
	        return 7;
	    }
	}
	public static int check_col_range(int col){//判断列的范围
	    if(col>=1&&col<=3){
	        return 1;
	    }else if (col>=4&&col<=6) {
	        return 4;
	    }else {
	        return 7;
	    }
	}
	public static int is_block_repeat(int row,int col,int num){//判断同色九宫格是否重复
	    int x,y;
	    x=check_row_range(row);
	    y=check_col_range(col);
	    for (int i=x;i<=x+2;i++) {
	        for (int j=y;j<=y+2;j++) {
	            if (a[i][j]==num) {
	                return 0;//重复，返回0
	            }
	        }
	    }
	    return 1;//不重复，返回1
	}

	public static void dfs(int row,int col){
	    if (row>9) {//如果行超出9行，直接输出
	        for (int i=1;i<=9;i++) {
	            for (int j=1;j<=9;j++) {
	                System.out.print(a[i][j]);
	            }
	            System.out.println();
	        }
	        //return ;
	        //退出程序
	        System.exit(0);
	    }

	    if (a[row][col]==0) {//如果没有填数字
	        for (int i=1;i<=9;i++) {
	            if (is_row_col_repeat(row, col, i)==1 && is_block_repeat(row, col, i)==1) {//如果行列九宫格不重复
	                a[row][col]=i;//填充数字
	                /**
	                 * 注意：取余是10，不是9
	                 */
	                dfs(row+(col+1)/10, (col+1)%10);//继续搜索
	            }
	        }
	        a[row][col]=0;//重新置为0
	    }else{//如果已经填了，继续搜索
	        dfs(row+(col+1)/10, (col+1)%10);
	        
	    }
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=9;i++){
			String s=sc.next();
			for(int j=1;j<=9;j++){
				char x=s.charAt(j-1);
				a[i][j]=x-'0';
			}
		}
		dfs(1,1);
	}
}
