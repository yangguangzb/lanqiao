package javaModel2015;
/**
 * 2015校内选拔赛C组
 * @author zhangbiao
 *
 */
public class Main02C {
	/*
	有如下的加法算式。其中每个汉字代表一个数字。
	（如存在对齐问题，可参见【图1.png】）

	               年
	             大年
	           过大年
	         能过大年
	       怎能过大年
	     我怎能过大年
	+  让我怎能过大年
	------------------
	   能能能能能能能

	请填写“让我怎能过大年” 所代表的整数。
	
	所有数字连在一起，中间不要空格。例如："3125697"。当然，这个不是正确的答案。
	*/
	public static void main(String[] args) {
		int rang=0,wo=0,zen=0,neng=rang+1,guo=0,da=0,nian=0;
		for(nian=0;nian<10;nian++){
			for(da=1;da<10;da++){
				for(guo=1;guo<10;guo++){
					for(rang=1;rang<10;rang++){
						for(neng=rang+1;neng<10;neng++){
							for(zen=1;zen<10;zen++){
								for(wo=1;wo<10;wo++){
									int sum1=nian;
									int sum2=da*10+sum1;
									int sum3=guo*100+sum2;
									int sum4=neng*1000+sum3;
									int sum5=zen*10000+sum4;
									int sum6=wo*100000+sum5;
									int sum7=rang*1000000+sum6;
									int sum8=neng+neng*10+neng*100+neng*1000+neng*10000+neng*100000+neng*1000000;
									if((sum1+sum2+sum3+sum4+sum5+sum6+sum7)==sum8){
										System.out.println(sum7);
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








