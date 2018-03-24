package moni;

import java.util.Arrays;

public class Main07 {
	
	public static void main(String[] args) {
		//宽度100，高度
		int[][] a={
			{11,3},
			{8,12},
			{11,17},
			{16,13},
			{1,14},
			{2,8},
			{6,10},
			{10,18},
			{17,11},
			{10,15},
			{6,14},
			{5,6},
			{2,19},
			{19,10},
			{4,9},
			{7,9},
			{5,14},
			{5,20},
			{15,19},
			{3,17},
			{15,11},
			{11,20},
			{9,12},
			{17,4},
			{9,19},
			{4,18},
			{10,10},
			{12,19},
			{17,3},
			{19,9},
			{20,16},
			{11,16},
			{10,2},
			{20,15},
			{3,14}
		};
		
		for(int i=0;i<35;i++){
			width[i]=a[i][0];
		}
		Arrays.sort(width);
		int num=0;
		for(int i=0;i<35;i++){
			num=num+width[i];
			System.out.println(num+"--"+width[i]);
			if(num==89){
				System.out.println(i);
			}
		}
	}
	static int[] width=new int[35];
	
	
}
/*
int widths[] = {11,8,11,16,1,2,6,10,17,10,6,5,2,19,4,
        7,5,5,15,3,15,11,9,17,9,4,10,12,17,19,20,11,10,20,3};
int p[20];
void dfs(int n,int sum,int step){
if(sum==100){
    int s = 0;
    for(int i = 0;i<20;i++){
        if(p[i]>0)s++;
    }
    printf("%d\n",s);
    exit(0);
}else if(sum>100)return;

for(int i = n;i<35;i++){
    p[step] = widths[n];
    dfs(i+1,sum+widths[n],step+1);
    p[step] = 0;
}
}
int main() {

sort(widths,widths+35);
dfs(0,0,0);
return 0;
}*/