package basicTraining;

import java.util.Scanner;
	/*
	问题描述
	给定一个N阶矩阵A，输出A的N次幂（N是非负整数）
	例如：
	A =
	1 2
	3 4
	A的2次幂
	7 10
	15 22
	输入格式
	第一行是一个正整数N、M（1<=N<=30, 0<=M<=5），表示矩阵A的阶数和要求的幂数
	接下来N行，每行N个绝对值不超过10的非负整数，描述矩阵A的值
	输出格式
	输出共N行，每行N个整数，表示A的M次幂所对应的矩阵。相邻的数之间用一个空格隔开
	样例输入
	2 2
	1 2
	3 4
	样例输出
	7 10
	15 22
	
	分析：竟然有一个！0次幂！矩阵的零次冥要输出单位矩阵！
	*/
public class Basic17 {
	public static void main(String[] args) {  
        int N,M;  
        Scanner sc = new Scanner(System.in);  
        N = sc.nextInt();//行列  
        M = sc.nextInt();//次幂  
        int[][] matrix = new int[N][N];  
        //输入  
        for(int i = 0; i < N; i++)  
        {  
            for (int j = 0; j < N; j++)  
             {  
                matrix[i][j]=sc.nextInt();  
            }  
        }  
        //判断几次幂  
        if(M==1)  
        {  
            printNum(matrix,N);  
        }  
        else if(M==0)  
        {  
            for (int i=0;i < N;i++ )  
            {  
                for (int j=0; j<N ;j++ )  
                {  
                    matrix[i][j]=1;  
                }  
            }  
            printNum(matrix,N);  
        }  
        else if(M>=2&&M<=5)  
        {  
            getNum(matrix,N,M);  
        }  
    }  
  
    public static void getNum(int[][] matrix,int N,int M)  
    {  
        int[][] matrixCopy = new int [N][N];  
          
        for(int i = 0 ;i < N; i++)  
        {  
            for(int j = 0; j < N; j++)  
            {  
                for (int k = 0; k < N; k++)  
                 {  
                    matrixCopy[i][j]+=matrix[i][k]*matrix[k][j];//交换  
                }  
            }  
        }  
        --M;  
        while((--M)>0)  
        {     
            int [][] temp = new int[N][N];  
            for(int i = 0; i < N; i++)  
            {  
                for (int j = 0; j < N; j++)  
                 {  
                    temp[i][j]=matrixCopy[i][j];//用于保存上次结果  
                }  
            }  
  
            for(int i = 0 ;i < N; i++)  
            {  
                for(int j = 0; j < N; j++)  
                {  
                    matrixCopy[i][j]=0;//用于清空上次结果，用temp保存上次结果参加运算  
                    for (int k = 0; k < N; k++)  
                     {  
                        matrixCopy[i][j]+=temp[i][k]*matrix[k][j];  
                    }  
                }  
            }  
        }  
        printNum(matrixCopy,N);   
    }  
  
    public static void printNum(int[][] matrix,int N)  
    {  
        //输出  
        for(int i = 0; i < N; i++)  
        {  
            for (int j = 0; j < N; j++)  
             {  
                System.out.print(matrix[i][j]+" ");  
            }  
            System.out.print("\n");  
        }  
    }  
}
