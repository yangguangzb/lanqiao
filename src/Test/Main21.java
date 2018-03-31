package Test;

public class Main21 {
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
		dfs(0,0);
		System.out.println(sum);
	}
	static int sum=0;
	public static void dfs(int n,int cartNum){
		if(n>13){
			return ;
		}
		if(cartNum>=13){
			if(cartNum==13){
				sum++;
			}
		}else{
			dfs(n+1, cartNum);
			dfs(n+1, cartNum+1);
			dfs(n+1, cartNum+2);
			dfs(n+1, cartNum+3);
			dfs(n+1, cartNum+4);
		}
	}
}
