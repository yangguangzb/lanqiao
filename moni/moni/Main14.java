package moni;

public class Main14 {
	static int[][] a={
		{0,2,6,0,0,0,0,0,0},
		{0,0,0,5,0,2,0,0,4},
		{0,0,0,1,0,0,0,0,7},
		{0,3,0,0,2,0,1,8,0},
		{0,0,0,3,0,9,0,0,0},
		{0,5,4,0,1,0,0,7,0},
		{5,0,0,0,0,1,0,0,0},
		{6,0,0,9,0,7,0,0,0},
		{0,0,0,0,0,0,7,5,0}
	};
	//判断行列是否重复
	public static int isRepeatRowCol(int row,int col,int num){
		//判断行是否重复
		for(int i=0;i<9;i++){
			if(a[row][i]==num){
				return 0;
			}
		}
		
		//判断列是否重复
		for(int i=0;i<9;i++){
			if(a[i][col]==num){
				return 0;
			}
		}
		
		return 1;
	}
	//判断同色九宫格的行的范围
	public static int rangeRow(int row){
		if(row>=0&&row<=2){
			return 0;
		}else if(row>=3&&row<=5){
			return 3;
		}else{
			return 6;
		}
	}
	
	//判断同色九宫格的列的范围
	public static int rangeCol(int col){
		if(col>=0&&col<=2){
			return 0;
		}else if(col>=3&&col<=5){
			return 3;
		}else{
			return 6;
		}
	}
	
	//判断同色九宫格是否重复
	public static int isRepeatNice(int row,int col,int num){
		int x=rangeRow(row);
		int y=rangeCol(col);
		for(int i=x;i<=x+2;i++){
			for(int j=y;j<=y+2;j++){
				if(a[i][j]==num){
					return 0;
				}
			}
		}
		return 1;
	}
	
	//dfs
	public static void dfs(int row,int col){
		if(row==9){
			for(int i=0;i<9;i++){
				for(int j=0;j<9;j++){
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			System.exit(0);
		}
		
		if(a[row][col]==0){
			for(int i=1;i<=9;i++){
				if(isRepeatNice(row, col, i)==1&&isRepeatRowCol(row, col, i)==1){
					a[row][col]=i;
					dfs(row+(col+1)/9, (col+1)%9);
				}
			}
			a[row][col]=0;
		}else{
			dfs(row+(col+1)/9, (col+1)%9);
		}
	}
	public static void main(String[] args) {
		dfs(0,0);
	}
}
