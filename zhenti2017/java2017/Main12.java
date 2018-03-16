package java2017;

public class Main12 {
	/*
	标题：字母组串

	由 A,B,C 这3个字母就可以组成许多串。
	比如："A","AB","ABC","ABA","AACBB" ....

	现在，小明正在思考一个问题：
	如果每个字母的个数有限定，能组成多少个已知长度的串呢？

	他请好朋友来帮忙，很快得到了代码，
	解决方案超级简单，然而最重要的部分却语焉不详。
	*/
	public static void main(String[] args) {
		System.out.println(f(1,1,1,2));
		System.out.println(f(1,2,3,3));
	}
	public static int f(int a, int b, int c, int n){
		if(a<0 || b<0 || c<0) return 0;
		if(n==0) return 1; 
		return f(a-1,b,c,n-1)+f(a,b-1,c,n-1)+f(a,b,c-1,n-1);  //填空
	}
}
