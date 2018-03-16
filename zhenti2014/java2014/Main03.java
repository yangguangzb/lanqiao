package java2014;
public class Main03 {
	/*
	把abcd…s共19个字母组成的序列重复拼接106次，得到长度为2014的串。
	接下来删除第1个字母（即开头的字母a），以及第3个，第5个等所有奇数位置的字母。
	得到的新串再进行删除奇数位置字母的动作。如此下去，最后只剩下一个字母，请写出该字母。
	答案是一个小写字母，请通过浏览器提交答案。不要填写任何多余的内容。
	答案：q
	*/
	public static void main(String[] args) {
		 StringBuilder sb=new StringBuilder("abcdefghijklmnopqrs");
		 StringBuilder str=new StringBuilder("");
		 for(int i=0;i<106;i++){
			 str.append(sb);
		 }
		 
		 while(str.length()!=1){
			 for(int i=0;i<str.length();i=i+2){
				 str.setCharAt(i, '0');
			 }
			 for(int j=0;j<str.length();j++){
				 if(str.charAt(j)=='0'){
					 str.deleteCharAt(j);
				 }
			 }
		 }
		 System.out.println(str);
	}
}
