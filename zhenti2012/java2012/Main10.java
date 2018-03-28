package java2012;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Main10 {
	/*
	 [12,127,85,66,27,34,15,344,156,344,29,47,....] 
	    这是某设备测量到的工程数据。
	    因工程要求，需要找出最大的5个值。
	    一般的想法是对它排序，输出前5个。但当数据较多时，这样做很浪费时间。因为对输出数据以外的数据进行排序并非工程要求，
	    即便是要输出的5个数字，也并不要求按大小顺序，只要找到5个就可以。
	    以下的代码采用了另外的思路。考虑如果手里已经抓着5个最大数，再来一个数据怎么办呢？让它和手里的数据比，如果比哪个大，
	    就抢占它的座位，让那个被挤出来的再自己找位子,....
	    请分析代码逻辑，并推测划线处的代码
	 */
	 public static List<Integer> max5(List<Integer> lst)  
	   {  
	     if(lst.size()<=5)
	    	 return lst;  
	     int a = (lst=lst.subList(1, lst.size())).get(0); // 填空  
	     List<Integer> b = max5(lst);  
	     for(int i=0; i<b.size(); i++)  
	     {  
	        int t = b.get(i);  
	        if(a>t)  
	        {  
	        	b.set(i, a);	// 填空  
	          a= t;   
	        }  
	     }  
	     return b;  
	   }  
	   public static void main(String[] args)  
	   {  
	     List<Integer> lst = new Vector<Integer>();  
	     lst.addAll(Arrays.asList(12,127,85,66,27,34,15,344,156,344,29,47));      
	     System.out.println(max5(lst));  
	   }  
}
