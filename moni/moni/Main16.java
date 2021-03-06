package moni;
import java.util.Scanner;
public class Main16 {
	//表示封印之门上的字母
    static char[] c1=new char[1005];  
    //表示解开封印之门的文字
    static char[] c2=new char[1005];
    //数组
    static int[][] e=new int[30][30];
    public static void init() {//初始化   
        for(int i = 1; i <= 26; i++) {  
            for(int j = 1; j <= 26; j++) {  
                if(i == j) e[i][j] = 0;//两个相同的字母互相转化不需要步数   
                else e[i][j]=1000000;		//初始将两个字母之间的转化赋值为1000000
            }  
        }  
    }  
    public static void Floyd() {//跑最短路   
        for(int k = 1; k <= 26; k++) {  
            for(int i = 1; i <= 26; i++) {  
                for(int j = 1; j <= 26; j++) {  
                    if(i == j) continue;  
                    if(e[i][j] > e[i][k] + e[k][j])  
                        e[i][j] = e[i][k] + e[k][j];  
                }  
            }  
        }     
    }
    public static void main(String[] args) {
    	int n;  
        char C1, C2;
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        c1=str1.toCharArray();
        String str2=sc.next();
        c2=str2.toCharArray();
        n=sc.nextInt();
        init();  
        long sum = 0;  
        while(n!=0) {  
            C1=sc.next().charAt(0);
            C2=sc.next().charAt(0);
            //有可能输入两个字母是相同的(字母相同表示自己到自己的距离为0，不是1)
            if(C1 != C2)  
            e[C1-'a'+1][C2-'a'+1] = 1;//建图
            n--;
        }  
        Floyd();   
        int m = c1.length;  
        //从0开始，计算c[i]
        for(int i = 0; i < m; i++) {  
        	//如果没有对应路径，则两点之间的距离为初始化的距离
            sum += e[c1[i]-'a'+1][c2[i]-'a'+1];//求出步数   
        }  
        if(sum<1000000){
        	System.out.println(sum);
        }else{
        	//没有找到时，由于初始化为1000000，所有会大于1000000
        	System.out.println(-1);
        }
	}
}
