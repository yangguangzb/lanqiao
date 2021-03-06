package java2014;

public class Main07 {
	/*
	 A A 2 2 3 3 4 4， 一共4对扑克牌。请你把它们排成一行。
	 要求：两个A中间有1张牌，两个2之间有2张牌，两个3之间有3张牌，两个4之间有4张牌。

	 请填写出所有符合要求的排列中，字典序最小的那个。

	 例如：22AA3344 比 A2A23344 字典序小。当然，它们都不是满足要求的答案。

	 请通过浏览器提交答案。“A”一定不要用小写字母a，也不要用“1”代替。字符间一定不要留空格。

	 参考答案：

	 解题思路
	 该题可以看做字符串处理的题目，首先遍历由这几个字符组成的字符串，找到符合要求的字符串并输出。

	 满足要求的字符串有两个：

	 2342A3A4
	 4A3A2432
	 取字典序最小的那个
	 */
	public static void main(String[] args) {
		int a=0,b=0,c=0,d=0;
		char[] s=new char[8];
		for(int i=0;i<8;i++){	//A--i->i+2
			for(int j=0;j<8;j++){ //2--j->j+3
				for(int k=0;k<8;k++){ //3--k->k+4
					for(int m=0;m<8;m++){ //4--m->m+5
						if(i+2<8&&j+3<8&&k+4<8&&m+5<8&&i!=j&&i!=k&&i!=m&&j!=k&&j!=m&&k!=m
						&&(i+2)!=(j+3)&&(i+2)!=(k+4)&&(i+2)!=(m+5)&&(j+3)!=(k+4)&&(j+3)!=(m+5)&&(k+4)!=(m+5)){
							s[i]=s[i+2]='A';
							s[j]=s[j+3]='2';
							s[k]=s[k+4]='3';
							s[m]=s[m+5]='4';
							for(int p=0;p<8;p++){
								if(s[p]=='A'){
									a++;
								}else if(s[p]=='2'){
									b++;
								}else if(s[p]=='3'){
									c++;
								}else{
									d++;
								}
							}
							if(a==2&&b==2&&c==2&&d==2){
								System.out.println(s);
							}else{
								a=0;
								b=0;
								c=0;
								d=0;
							}
							
						}
					}
				}
			}
		}
	}
}
