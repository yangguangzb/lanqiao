package java2015.c;
/**
 * 2015年省赛java C组
 * @author zhangbiao
 *
 */
public class Main05 {
	/*
	格子中输出
	stringInGrid方法会在一个指定大小的格子中打印指定的字符串。
	要求字符串在水平、垂直两个方向上都居中。
	如果字符串太长，就截断。
	如果不能恰好居中，可以稍稍偏左或者偏上一点。
	+------------------+
	|                  |
	|     abcd1234     |
	|                  |
	|                  |
	+------------------+
	*/
	public static void main(String[] args) {
		stringInGrid(20, 6, "abcd1234");
	}
	
	public static void stringInGrid(int width, int height, String s)
	{
		if(s.length()>width-2) s = s.substring(0,width-2);
		System.out.print("+");
		for(int i=0;i<width-2;i++) System.out.print("-");
		System.out.println("+");
		
		for(int k=1; k<(height-1)/2;k++){
			System.out.print("|");
			for(int i=0;i<width-2;i++) System.out.print(" ");
			System.out.println("|");
		}
		
		System.out.print("|");
		//填空
		String ff=(width-s.length()-2==0)?s:"%"+((width-s.length()-2)/2)+"s%s%"+((width-s.length()-1)/2)+"s";
		System.out.print(String.format(ff,"",s,""));
		          
		System.out.println("|");
		
		for(int k=(height-1)/2+1; k<height-1; k++){
			System.out.print("|");
			for(int i=0;i<width-2;i++) System.out.print(" ");
			System.out.println("|");
		}	
		
		System.out.print("+");
		for(int i=0;i<width-2;i++) System.out.print("-");
		System.out.println("+");	
	}
}
