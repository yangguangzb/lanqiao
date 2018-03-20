package java2012;

public class Main04 {
	/*
	奇怪的比赛
	某电视台举办了低碳生活大奖赛。题目的计分规则相当奇怪：
	每位选手需要回答10个问题（其编号为1到10），越后面越有难度。答对的，
	当前分数翻倍；答错了则扣掉与题号相同的分数（选手必须回答问题，不回答按错误处理）。
	每位选手都有一个起步的分数为10分。
	某获胜选手最终得分刚好是100分，如果不让你看比赛过程，你能推断出他（她）哪个题目答对了，
	哪个题目答错了吗？
	如果把答对的记为1，答错的记为0，则10个题目的回答情况可以用仅含有1和0的串来表示。
	例如：0010110011 就是可能的情况。
	你的任务是算出所有可能情况。每个答案占一行。
	1-2-3-4-5-6-7-8-9-10
    */
	public static void main(String[] args) {
		int[] a=new int[11];
		int num=10;
		for(int i=0;i<2;i++){
			for(int i1=0;i1<2;i1++){
				for(int i2=0;i2<2;i2++){
					for(int i3=0;i3<2;i3++){
						for(int i4=0;i4<2;i4++){
							for(int i5=0;i5<2;i5++){
								for(int i6=0;i6<2;i6++){
									for(int i7=0;i7<2;i7++){
										for(int i8=0;i8<2;i8++){
											for(int i9=0;i9<2;i9++){
												a[1]=i;
												a[2]=i1;
												a[3]=i2;
												a[4]=i3;
												a[5]=i4;
												a[6]=i5;
												a[7]=i6;
												a[8]=i7;
												a[9]=i8;
												a[10]=i9;
												for(int h=1;h<a.length;h++){
													if(a[h]==0){
														num=num-h;
													}else{
														num=num*2;
													}
												}
												if(num==100){
													for(int k=1;k<a.length;k++){
														System.out.print(a[k]);
													}
													System.out.println();
												}else{
													num=10;
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
