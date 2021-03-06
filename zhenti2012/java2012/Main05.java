package java2012;

public class Main05 {
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
		//初始化分数为10，从第一题开始
		dfs(10,1);
	}
	/**
	 * @param sum	当前分数
	 * @param u		当前回答的题目编号
	 */
	static int[] a=new int[11];
	public static void dfs(int sum,int u){
		if(u>10){
			if(sum==100){
				for(int i=1;i<11;i++){
					System.out.print(a[i]);
				}
				System.out.println();
			}
		}else{
			//答错情况
			a[u]=0;
			dfs(sum-u,u+1);
			//答对情况
			a[u]=1;
			dfs(sum*2,u+1);
		}
	}
}
