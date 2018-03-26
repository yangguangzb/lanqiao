package moni;

import java.util.Scanner;
/*	思路：
	填空的地方的意思是，如果i的后面有和s[i] 相等且访问过的字符，则不可以（break），一旦break，j 就不能等于len，就不能继续递归。那么怎么理解这个呢？
	先想一下简化的问题吧，假如输入的字符串不重复，例如abcd，那么就是简单的dfs了，一个for循环加一个vis判断，如果判断可以，继续递归。
	当有重复的字符时候就比较麻烦了，比如aab，单纯的用递归会输出重复的。那么怎么加上限定条件呢。
	这里，我们让重复的这些字符只顺序输出一遍，这样就不会重复
	这是什么意思呢，比如说aabc,我们只允许第一个a访问后再访问第二个a，不允许访问第二个，再第一个。
	再如，abacda，那三个a只能按顺序访问。
	原理是什么呢，用了点高中学的排列组合的知识，先排重复的，例如我们搞abacda这个例子, 先排三个a, 就是 aaa,
	那么剩下的就相当于直接插入到aaa中，那么如果我们aaa如果按多种顺序排，就会产生多种结果，所以只能按顺序访问。
	那么又如何用算法实现呢，直接加个if判断就行了，判断i之后的有没有访问过的且相等的。例如，aabc这个例子，
	我们第一轮选完之后，到了第二个a,然后进入递归，for循环又从0开始，到了第一个a，然后从这个之后去判断有没有访问过的a，结果判断有，违反了顺序，所以结束。
	这个题目的关键也就是排除重复的
*/
public class Main13 {
	public static final int N = 1000;
    public static char[] str = new char[N];
    public static char[] buf = new char[N];
    public static int[] vis = new int[N];
    public static int total = 0;
    public static int len = 0;

    public static void arrange(int num) {
        if (num == len) {
            for (int i = 0; i < len; ++i) {
                System.out.print(buf[i]);
            }
            System.out.println();
            total++;
            return;
        }
        for (int i = 0; i < len; ++i) {
            if (vis[i] == 0) {
                int j = 0;
                for (j = i + 1; j < len; ++j) {
                    if (str[i]==str[j]&&vis[j]==1) {			/*在这里填写必要的代码*/
                        break;
                    }
                }
                if (j == len) {
                    vis[i] = 1;
                    buf[num] = str[i];
                    arrange(num + 1);
                    vis[i]= 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        str = cin.next().toCharArray();
        total = 0;
        len = str.length;
        buf[len] = '\0';
        int i = 0, j = 0;
        for (i = 0; i < len; ++i) {
            for (j = i + 1; j < len; ++j) {
                if (str[i] > str[j]) {
            		char tmp = str[i];
            		str[i] = str[j];
            		str[j] = tmp;
        		}
            }
        }
        arrange(0);
        System.out.println("Total " + total);
    }
}
