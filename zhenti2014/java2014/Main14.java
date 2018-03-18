package java2014;

public class Main14 {
	/*
	 话说大诗人李白，一生好饮。幸好他从不开车。

	 一天，他提着酒壶，从家里出来，酒壶中有酒2斗。他边走边唱：

	 无事街上走，提壶去打酒。
	 逢店加一倍，遇花喝一斗。

	 这一路上，他一共遇到店5次，遇到花10次，已知最后一次遇到的是花，他正好把酒喝光了。

	 请你计算李白遇到店和花的次序，可以把遇店记为a，遇花记为b。则：babaabbabbabbbb 
	 就是合理的次序。像这样的答案一共有多少呢？请你计算出所有可能方案的个数（包含题目给出的）。

	 注意：通过浏览器提交答案。答案是个整数。不要书写任何多余的内容
	 */
	public static void main(String[] args) {
		int count=0;
		char[] s=new char[15];
		s[14]='b';
		for(char i='a';i<='b';i++){
			for(char i2='a';i2<='b';i2++){
				for(char i3='a';i3<='b';i3++){
					for(char i4='a';i4<='b';i4++){
						for(char i5='a';i5<='b';i5++){
							for(char i6='a';i6<='b';i6++){
								for(char i7='a';i7<='b';i7++){
									for(char i8='a';i8<='b';i8++){
										for(char i9='a';i9<='b';i9++){
											for(char i10='a';i10<='b';i10++){
												for(char i11='a';i11<='b';i11++){
													for(char i12='a';i12<='b';i12++){
														for(char i13='a';i13<='b';i13++){
															for(char i14='a';i14<='b';i14++){
																s[0]=i;
																s[1]=i2;
																s[2]=i3;
																s[3]=i4;
																s[4]=i5;
																s[5]=i6;
																s[6]=i7;
																s[7]=i8;
																s[8]=i9;
																s[9]=i10;
																s[10]=i11;
																s[11]=i12;
																s[12]=i13;
																s[13]=i14;
																int a=0,b=0;
																int sum=2;
																for(int j=0;j<14;j++){
																	if(s[j]=='a'){
																		a++;
																		sum=sum*2;
																	}else{
																		b++;
																		sum=sum-1;
																	}
																}
																if(a==5&&b==9&&sum==1){
																	System.out.println(s);
																	count++;
																}else{
																	sum=2;
																	a=0;
																	b=0;
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
					}
				}
			}
		}
		System.out.println("count="+count);
	}
	
	
}
