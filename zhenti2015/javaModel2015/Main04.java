package javaModel2015;
/**
 * 2015校内选拔赛
 * @author zhangbiao
 *
 */
public class Main04 {
	/*
	今有7对数字：两个1，两个2，两个3，...两个7，把它们排成一行。
	要求，两个1间有1个其它数字，两个2间有2个其它数字，以此类推，两个7之间有7个其它数字。如下就是一个符合要求的排列：

	17126425374635
	74xxxx4x7xxxxx
	当然，如果把它倒过来，也是符合要求的。

	请你找出另一种符合要求的排列法，并且这个排列法是以74开头的。
	*/
	 static int[] a = new int[] { 0, 7, 4, 0, 0, 0, 0, 4, 0, 7, 0, 0, 0, 0, 0 };

	    public static void main(String[] args) {
	        getResult(1);//从数字1开始
	    }

	    /**
	     * 
	     * @param index
	     *             数1-7
	     */
	    public static void getResult(int index) {
	        if (index == 4) {//跳过数字4
	            index++;
	        }
	        if (index >= 7) {//此时说明1-7数字都被取完,输出答案即可
	            for (int i = 1; i < a.length; i++) {
	                System.out.print(a[i]);
	            }
	        }
	        //i--->位数
	        for (int i = 3; i < 14; i++) {
	            if ((i + index + 1) <= 14 && a[i] == 0 && a[i + index + 1] == 0) {
	                a[i] = a[i + index + 1] = index;
	                getResult(index + 1);
	                //------------------------------
	                //执行到这一步说明此时的数字index不适合于位置i,撤回赋值
	                a[i] = a[i + index + 1] = 0;
	            }
	        }
	    }
}
