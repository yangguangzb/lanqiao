package java2015.b;
public class Main07 {
	/*
	牌型种数

	小明被劫持到X赌城，被迫与其他3人玩牌。
	一副扑克牌（去掉大小王牌，共52张），均匀发给4个人，每个人13张。
	这时，小明脑子里突然冒出一个问题：
	如果不考虑花色，只考虑点数，也不考虑自己得到的牌的先后顺序，
	自己手里能拿到的初始牌型组合一共有多少种呢？
	*/
	//1 2 3 4 5 6 7 8 9 10 11 12 13
	public static void main(String[] args) {
		int count=0;
		for(int m1=0;m1<=4;m1++){
			for(int m2=0;m2<=4;m2++){
				for(int m3=0;m3<=4;m3++){
					for(int m4=0;m4<=4;m4++){
						for(int m5=0;m5<=4;m5++){
							for(int m6=0;m6<=4;m6++){
								for(int m7=0;m7<=4;m7++){
									for(int m8=0;m8<=4;m8++){
										for(int m9=0;m9<=4;m9++){
											for(int m10=0;m10<=4;m10++){
												for(int m11=0;m11<=4;m11++){
													for(int m12=0;m12<=4;m12++){
														for(int m13=0;m13<=4;m13++){
															int sum=m1+m2+m3+m4+m5+m6+m7+m8+m9+m10+m11+m12+m13;
															if(sum==13){
																count++;
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
		System.out.println(count);
	}
}
