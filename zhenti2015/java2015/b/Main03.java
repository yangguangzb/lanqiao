package java2015.b;

import java.util.HashSet;
import java.util.Set;

/**
 * 2015年省赛java B组
 * @author zhangbiao
 *
 */
public class Main03 {
	/*
	三羊献瑞

	观察下面的加法算式：

	      祥 瑞 生 辉
	 + 三 羊 献 瑞
	------------------- 
	   三 羊 生 瑞 气

	(如果有对齐问题，可以参看【图1.jpg】)

	其中，相同的汉字代表相同的数字，不同的汉字代表不同的数字。

	请你填写“三羊献瑞”所代表的4位数字（答案唯一），不要填写任何多余内容。
	*/
	public static void main(String[] args) {
		for(int xiang=1;xiang<10;xiang++){
			for(int rui=0;rui<10;rui++){
				for(int sheng=0;sheng<10;sheng++){
					for(int hui=0;hui<10;hui++){
						for(int san=1;san<2;san++){
							for(int yang=0;yang<10;yang++){
								for(int xian=0;xian<10;xian++){
									for(int qi=0;qi<10;qi++){
										int num1=hui+sheng*10+rui*100+xiang*1000;
										int num2=rui+xian*10+yang*100+san*1000;
										int sum=qi+rui*10+sheng*100+yang*1000+san*10000;
										Set<Integer> set=new HashSet<Integer>();
										set.add(xiang);
										set.add(rui);
										set.add(sheng);
										set.add(hui);
										set.add(san);
										set.add(yang);
										set.add(xian);
										set.add(qi);
										if((num1+num2==sum)&&(set.size()==8)){
											System.out.println(" "+num1);
											System.out.println(" "+num2);
											System.out.println(sum);
											System.out.println("--------------");
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
