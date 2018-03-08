package java2015.c;
/**
 * 2015年省赛java C组
 * @author zhangbiao
 *
 */
public class Main02 {
	/*
	有些数字的立方的末尾正好是该数字本身。
	比如：1,4,5,6,9,24,25,....
	请你计算一下，在10000以内的数字中（指该数字，并非它立方后的数值），
	符合这个特征的正整数一共有多少个。
	*/
	public static void main(String[] args) {
		int sum=0;
		for(long i=1;i<10000;i++){
			String temp=i*i*i+"";
			String m=i+"";
			if(m.equals(temp.substring(temp.length()-m.length()))){
				sum++;
			}
		}
		System.out.println(sum);
	}
}
