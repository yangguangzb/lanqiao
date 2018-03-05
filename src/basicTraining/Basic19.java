package basicTraining;

import java.util.Scanner;
	/*
	问题描述
	回文串，是一种特殊的字符串，它从左往右读和从右往左读是一样的。
	小龙龙认为回文串才是完美的。现在给你一个串，它不一定是回文的，
	请你计算最少的交换次数使得该串变成一个完美的回文串。
	交换的定义是：交换两个相邻的字符
	例如mamad
	第一次交换 ad : mamda
	第二次交换 md : madma
	第三次交换 ma : madam (回文！完美！)
	输入格式
	第一行是一个整数N，表示接下来的字符串的长度(N <= 8000)
	第二行是一个字符串，长度为N.只包含小写字母
	输出格式
	如果可能，输出最少的交换次数。
	否则输出impossible
	样例输入
	5
	mamad
	样例输出
	3
	*/
public class Basic19 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		char[] str=s.toCharArray();
		int end=n-1;//最后一个字符
		int cnt=0;	//交换次数
		int oddNum=0;//判断是否有单独的奇个数的字符
		for(int i=0;i<end;i++){//从第一个字符到倒数第二个遍历
			for(int j=end;j>=i;j--){//从最后一个开始，到第i个字符，寻找与str[i]相等的字符
				if(i==j){
					//没有找到
					if(n%2==0||oddNum==1){
						System.out.println(s);
						return ;
					}
					oddNum=1;
					cnt+=n/2-i;
				}else if(str[i]==str[j]){
					for(int k=j;k<end;k++){
						swap(str[k], str[k+1]);
						cnt++;
					}
					end--;
					break;
				}
			}
		}
		System.out.println(cnt);
	}
	public static void swap(char a,char b){
		char temp;
		temp=a;
		a=b;
		b=temp;
	}
}





