package basicTraining;

import java.util.Scanner;
	/*
	问题描述
	平面上有两个矩形，它们的边平行于直角坐标系的X轴或Y轴。对于每个矩形，
	我们给出它的一对相对顶点的坐标，请你编程算出两个矩形的交的面积。
	输入格式
	输入仅包含两行，每行描述一个矩形。
	在每行中，给出矩形的一对相对顶点的坐标，每个点的坐标都用两个绝对值不超过10^7的实数表示。
	输出格式
	输出仅包含一个实数，为交的面积，保留到小数后两位。
	样例输入
	1 1 3 3
	2 2 4 4
	样例输出
	1.00
	*/
public class Basic18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double x1,y1,x2,y2,x3,y3,x4,y4;
		x1=sc.nextDouble();
		y1=sc.nextDouble();
		x2=sc.nextDouble();
		y2=sc.nextDouble();
		x3=sc.nextDouble();
		y3=sc.nextDouble();
		x4=sc.nextDouble();
		y4=sc.nextDouble();
		sc.close();
		//找出两个矩形的最大最小坐标
		double maxx=Math.max(x1,x2),minx=Math.min(x1, x2),maxy=Math.max(y1,y2),miny=Math.min(y1,y2);
		double bigx=Math.max(x3,x4),smax=Math.min(x3,x4),bigy=Math.max(y3,y4),smay=Math.min(y3,y4);
		//判断两个矩形是否相切或相离
		if(smax>=maxx||minx>=bigx||miny>=bigy||maxy<=smay){
			System.out.println("0.00");
		}else{
			//找出相交矩形的两个点(xx,yy),(x,y)
			double xx=Math.max(minx,smax),yy=Math.max(miny,smay);
			double x=Math.min(maxx,bigx),y=Math.min(maxy,bigy);
			System.out.println(String.format("%.2f",(Math.abs(x-xx)*Math.abs(y-yy))));
		}
	}
}








