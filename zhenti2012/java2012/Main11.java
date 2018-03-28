package java2012;
/**
 * 把空格替换：记得左边的str要写
 * str=str.replaceAll(" ","");
 * @author zhangbiao
 *
 */
public class Main11 {
	/*
	匪警请拨110,即使手机欠费也可拨通！
          为了保障社会秩序，保护人民群众生命财产安全，警察叔叔需要与罪犯斗智斗勇，
          因而需要经常性地进行体力训练和智力训练！
         某批警察叔叔正在进行智力训练：
    1 2 3 4 5 6 7 8 9 = 110;
          请看上边的算式，为了使等式成立，需要在数字间填入加号或者减号
          （可以不填，但不能填入其它符号）。之间没有填入符号的数字组合成一个数，
          例如：12+34+56+7-8+9就是一种合格的填法；123+4+5+67-89是另一个可能的答案。
         请你利用计算机的优势，帮助警察叔叔快速找到所有答案。
         每个答案占一行。形如：
    12+34+56+7-8+9
    123+4+5+67-89
    */
	static char[] fu={' ','+','-'};
	public static void main(String[] args) {
		for(int x1=0;x1<3;x1++){
			for(int x2=0;x2<3;x2++){
				for(int x3=0;x3<3;x3++){
					for(int x4=0;x4<3;x4++){
						for(int x5=0;x5<3;x5++){
							for(int x6=0;x6<3;x6++){
								for(int x7=0;x7<3;x7++){
									for(int x8=0;x8<3;x8++){
										int[] a={x1,x2,x3,x4,x5,x6,x7,x8};
										String str="";
										for(int i=1;i<=9;i++){
											if(i==9){
												 str=str+i;
											}else{
												 str=str+i+fu[a[i-1]];
											}
										}
										//把空格替换
										str=str.replaceAll(" ","");
										String[] ss = str.split("[+|-]");
										int sum=Integer.parseInt(ss[0]);
										int index=1;
										for(int i=0;i<str.length();i++){
											if(str.charAt(i)=='+'){
												sum=sum+Integer.parseInt(ss[index++]);
											}else if(str.charAt(i)=='-'){
												sum=sum-Integer.parseInt(ss[index++]);
											}
										}
										if(sum==110){
											System.out.println(str);
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
