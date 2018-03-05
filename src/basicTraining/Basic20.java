package basicTraining;

import java.util.Scanner;
	/*
	问题描述
	Tom教授正在给研究生讲授一门关于基因的课程，有一件事情让他颇为头疼：
	一条染色体上有成千上万个碱基对，它们从0开始编号，到几百万，几千万，甚至上亿。
	比如说，在对学生讲解第1234567009号位置上的碱基时，光看着数字是很难准确的念出来的。
	所以，他迫切地需要一个系统，然后当他输入12 3456 7009时，会给出相应的念法：
	十二亿三千四百五十六万七千零九
	用汉语拼音表示为
	shi er yi san qian si bai wu shi liu wan qi qian ling jiu
	这样他只需要照着念就可以了。
	你的任务是帮他设计这样一个系统：给定一个阿拉伯数字串，你帮他按照中文读写的规范转为汉语拼音字串，
	相邻的两个音节用一个空格符格开。
	注意必须严格按照规范，比如说“10010”读作“yi wan ling yi shi”而不是“yi wan ling shi”，
	“100000”读作“shi wan”而不是“yi shi wan”，“2000”读作“er qian”而不是“liang qian”。
	输入格式
	有一个数字串，数值大小不超过2,000,000,000。
	输出格式
	是一个由小写英文字母，逗号和空格组成的字符串，表示该数的英文读法。
	样例输入
	12  3456  7009
	样例输出
	shi er yi san qian si bai wu shi liu wan qi qian ling jiu
	*/
public class Basic20 {
	public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);  
        String s = input.nextLine(); 
        input.close();  
        int length = s.length();  
        char[] ch=new char[length];
        int n = (int) Math.ceil(length / 4.0);  
        String[] arrS = new String[n]; 
        for (int i = 0; i < arrS.length; i++) {  
            if (i == arrS.length - 1) {  
                arrS[arrS.length - 1 - i] = s.substring(0, s.length() - 4 * i);  
            } else {  
                arrS[arrS.length - 1 - i] = s.substring(s.length() - 4 * i - 4,  
                        s.length() - 4 * i);  
            }  
        }  
        getSound(arrS);  
    }  
  
    public static void getSound(String[] arrS) {  
        String[] num = new String[] { "ling", "yi", "er", "san", "si", "wu",  
                "liu", "qi", "ba", "jiu" };  
        String[] maxWei = new String[] { "", "wan", "yi" };  
        String[] minWei = new String[] { "", "shi", "bai", "qian" };  
        String aim = "";  
        for (int i = 0; i < arrS.length; i++) {  
            String[] tS = arrS[i].split("");  
            int t = -1;  
            for (int j = 1; j < tS.length; j++) {  
                if (t == 0) {  
                    if (Integer.parseInt(tS[j]) == 0) {  
                    } else if ("shi".equals(minWei[tS.length - j - 1])  
                            && Integer.parseInt(tS[j]) == 1) {  
                        aim += (minWei[tS.length - j - 1] + " ");  
                    } else {  
                        aim += (num[Integer.parseInt(tS[j])] + " "  
                                + minWei[tS.length - j - 1] + " ");  
                    }  
                    t = Integer.parseInt(tS[j]);  
                } else {  
                    if (Integer.parseInt(tS[j]) == 0) {  
                        aim += (num[Integer.parseInt(tS[j])] + " ");  
                    } else if ("qian".equals(minWei[tS.length - j - 1])  
                            && Integer.parseInt(tS[j]) == 2) {  
                        aim += ("liang" + " " + minWei[tS.length - j - 1] + " ");  
                    } else {  
                        aim += (num[Integer.parseInt(tS[j])] + " "  
                                + minWei[tS.length - j - 1] + " ");  
                    }  
  
                    t = Integer.parseInt(tS[j]);  
                }  
  
            }  
            aim += (maxWei[arrS.length - i - 1] + " ");  
        }  
        System.out.println(aim);  
    }  
}
