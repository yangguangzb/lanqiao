package javaModel2015;

import java.util.Scanner;

public class Main06 {
	/*
	形如：1/a 的分数称为单位分数。
	可以把1分解为若干个互不相同的单位分数之和。
	例如：
	1 = 1/2 + 1/3 + 1/9 + 1/18
	1 = 1/2 + 1/3 + 1/10 + 1/15
	1 = 1/3 + 1/5 + 1/7 + 1/9 + 1/11 + 1/15 + 1/35 + 1/45 + 1/231
	等等，类似这样的分解无穷无尽。
	我们增加一个约束条件：最大的分母必须不超过30
	请你求出分解为n项时的所有不同分解法。
	数据格式要求：
	输入一个整数n，表示要分解为n项（n<12）
	输出分解后的单位分数项，中间用一个空格分开。
	每种分解法占用一行，行间的顺序按照分母从小到大排序。
	例如，
	输入：
	4
	程序应该输出：
	1/2 1/3 1/8 1/24
	1/2 1/3 1/9 1/18
	1/2 1/3 1/10 1/15
	1/2 1/4 1/5 1/20
	1/2 1/4 1/6 1/12
	再例如，
	输入：
	5
	程序应该输出：
	1/2 1/3 1/12 1/21 1/28
	1/2 1/4 1/6 1/21 1/28
	1/2 1/4 1/7 1/14 1/28
	1/2 1/4 1/8 1/12 1/24
	1/2 1/4 1/9 1/12 1/18
	1/2 1/4 1/10 1/12 1/15
	1/2 1/5 1/6 1/12 1/20
	1/3 1/4 1/5 1/6 1/20
	*/
	/**
	 * num	:分解为几项
	 * a[]  :存放分母的数组
	 * k	：当前第几项
	 */
	public static void f(int num,int a[],int k){  
        if(num==k){  
            g(a);     //判断为1  
            return;    //跳出此次函数  
        }  
        for(int i=2;i<30;i++){  
            a[k]=i;  
            f(num,a,k+1);  
        }  
    }  
    public static void g(int a[]){  
        int sum=1;  
        int sum1=1;  
        int he=0;  
        //筛选等于，后面大于前面的数  
        for(int k=0;k<a.length;k++){  
            for(int l=k+1;l<a.length ;l++){  
                if(a[k]>=a[l]){  
                    return;  
                }     
            }  
        }  
          
        for(int i=0;i<a.length;i++){  
            sum=sum*a[i];  
            for(int j=0;j<a.length;j++){  
                if(i==j){  
                    continue;  
                }  
                sum1=sum1*a[j];   //单轮积需要n次  
            }  
            he=he+sum1;  
            sum1=1;  //sum1需要清0  
        }  
        if(sum==he){  
            print(a);  
        }  
        else{  
            return;  
        }         
    }  
    public static void print(int a[]){  
        for(int i=0;i<a.length;i++){  
            if(i==a.length-1){  
                System.out.println("1/"+a[i]);  
            }  
            else{  
                System.out.print("1/"+a[i]+"+");                  
            }  
        }  
        System.out.println();  
    }     
  
  
    public static void main(String[] args) {  
        Scanner input=new Scanner(System.in);  
        int num=input.nextInt();  
        int a[]=new int[num];  
        int k=0;  
        f(num,a,k);  
    }  
		
	  
}
