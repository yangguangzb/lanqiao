package java2013;
/**
 * 思路：从符合条件的数字中挑选
 * @author zhangbiao
 *
 */
public class Main07 {
	/*
	小李的店里专卖其它店中下架的样品电视机，可称为：样品电视专卖店。
	其标价都是4位数字（即千元不等）。
	小李为了标价清晰、方便，使用了预制的类似数码管的标价签，只要用颜色笔涂数字就可以了。
	这种价牌有个特点，对一些数字，倒过来看也是合理的数字。如：1 2 5 6 8 9 0 都可以。
	这样一来，如果牌子挂倒了，有可能完全变成了另一个价格，比如：1958 倒着挂就是：8561，差了几千元啊!!
	当然，多数情况不能倒读，比如，1110 就不能倒过来，因为0不能作为开始数字。
	有一天，悲剧终于发生了。某个店员不小心把店里的某两个价格牌给挂倒了。并且这两个价格牌的电视机都卖出去了!
	庆幸的是价格出入不大，其中一个价牌赔了2百多，另一个价牌却赚了8百多，综合起来，反而多赚了558元。
	请根据这些信息计算：赔钱的那个价牌正确的价格应该是多少？
	答案是一个4位的整数，请通过浏览器直接提交该数字。
	注意：不要提交解答过程，或其它辅助说明类的内容。
	*/
	//答案：9088
	public static void main(String[] args) {
		int[] x=new int[]{1,2,5,6,8,9,0};
		int[] i=new int[100];
		int[] ii=new int[100];
		int[] j=new int[100];
		int[] jj=new int[100];
		int k=0;
		int g=0;
		for(int a=0;a<6;a++){	//千
			for(int b=0;b<7;b++){	//百
				for(int c=0;c<7;c++){  //十
					for(int d=0;d<6;d++){	//个
						//原来
						int m=0;
						//颠倒后的
						if(x[a]==6){
							m=9*1000+x[b]*100+x[c]*10+x[d];
						}
						if(x[b]==6){
							m=x[a]*1000+9*100+x[c]*10+x[d];
						}
						if(x[c]==6){
							m=x[a]*1000+x[b]*100+9*10+x[d];
						}
						if(x[d]==6){
							m=x[a]*1000+x[b]*100+x[c]*10+9;
						}
						
						if(x[a]==9){
							m=6*1000+x[b]*100+x[c]*10+x[d];
						}
						if(x[b]==9){
							m=x[a]*1000+6*100+x[c]*10+x[d];
						}
						if(x[c]==9){
							m=x[a]*1000+x[b]*100+6*10+x[d];
						}
						if(x[d]==9){
							m=x[a]*1000+x[b]*100+x[c]*10+6;
						}
						int n=x[d]*1000+x[c]*100+x[b]*10+x[a];
						if(m-n>200&&m-n<300){
							i[k]=m;
							ii[k]=n;
							k++;
						}
						if(n-m>800&&n-m<900){
							j[g]=m;
							jj[g]=n;
							g++;
						}
					}
				}
			}
		}
		
		//寻找符合条件的
		for(int a=0;a<i.length;a++){
			for(int b=0;b<j.length;b++){
				if(i[a]!=0&&ii[a]!=0&&j[b]!=0&&jj[b]!=0){
					if((ii[a]-i[a])+(jj[b]-j[b])==558){
						System.out.println(i[a]);
						break;
					}
				}
			}
		}
	}
}