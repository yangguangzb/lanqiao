package moni;
/**
 * 
 * @author zhangbiao
 * dfs，把每个空格使用加减乘除进行填写，但是要处理好优先级，
 * 我这里使用的是每次停留一下看下一个符号是什么。
 * 如果是加号或者是减号就把上一个计算给计算了，如果是乘号就把b和当前数相乘。
 * 继续保留上一个符号继续往后看。
 */
public class Main11 {	
	static int[] f={1,2,3,4,5,6,7,8,9,10};
	static int s;
	public static int deal(int a,char c,int b)
	{
		if(c=='+')
		return a+b;
		else
		return a-b;
	}
	public static void dfs(int a,char c,int b,int step)
	{
		if(step==10)
		{
			if(deal(a,c,b)==0){
				s++;
				
			}
			
			//要有return 
			return ;
		}
		dfs(deal(a,c,b)   ,'+',    f[step],      step+1);
		dfs(deal(a,c,b)   ,'-',    f[step],      step+1);
		dfs(   a		  ,c ,    (b*f[step]),  step+1);
	}
	public static void main(String[] args) {
		s=0;
		dfs(0,'+',1,1);
		System.out.println(s);
	}
}

/*
int f[11] = {0,1,2,3,4,5,6,7,8,9,10};  
int a_b(int a, char c, int b)  
{  
    if(c == '+')  
        return a + b;  
    else return a - b;  
}  
int dfs(int a, char c, int b, int cnt)  
{  
    if(cnt == 11)  
    {  
        if(a_b(a, c, b) == 0)  
            return 1; //success;   
        else  
            return 0;  
    }  
    int res = 0;  
    res += dfs(a_b(a,c,b), '+', f[cnt], cnt+1);  
    res += dfs(a_b(a,c,b), '-', f[cnt], cnt+1);  
    res += dfs(a, c, b*f[cnt], cnt+1);  
    return res;  
}  
int main()  
{  
    printf("%d", dfs(0,'+',1,2));  
    return 0;  
}   
*/

