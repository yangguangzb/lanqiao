package java2012;

import java.util.Scanner;

public class Main16 {
	static String[] str;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		str=new String[n];
		for(int i=0;i<n;i++)
			str[i]=sc.next();
		for(int i=0;i<n;i++){
			System.out.println(f(str[i]));
		}
	}
	public static int f(String ss){
		char[] ch = ss.toCharArray();
		int num=0;
		int index=0;
		//判断连续
		for(int i=0;i<3;i++){
			if(Math.abs(ch[i]-ch[i+1])==1){
				index++;
			}
		}
		if(index==3){
			num=num+5;
		}
		//判断是否四个都相同
		int index1=0;
		for(int i=0;i<3;i++){
			if(Math.abs(ch[i]-ch[i+1])==0){
				index1++;
			}
		}
		if(index1==3){
			//四个都相同
			num=num+8;
		}
		//判断前三个后三个是否相同
		if((ch[0]==ch[1]&&ch[1]==ch[2]&&ch[2]!=ch[3])||(ch[0]!=ch[1]&&ch[1]==ch[2]&&ch[2]==ch[3])){
			num=num+3;
		}
		//判断6,8,9
		for(int i=0;i<4;i++){
			if(ch[i]=='6'||ch[i]=='8'||ch[i]=='9'){
				num++;
			}
		}
		//判断AABB，ABAB
		if((ch[0]==ch[1]&&ch[2]==ch[3]&&ch[0]!=ch[2])||(ch[1]!=ch[0]&&ch[0]==ch[2]&&ch[1]==ch[3])){
			num++;
		}
		return num;
	}
}


















