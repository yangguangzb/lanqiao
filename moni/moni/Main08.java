package moni;

import java.util.Scanner;

/**
 * 将所以的炸弹放入一个数组中，然后对其中一个炸弹用dfs()进行连锁引爆，
 * 判断是否有还有未被引爆的，
 * 如果存在，这引爆数目加一，把当前的引爆，一直这样判断下去
 * @author zhangbiao
 *
 */
public class Main08 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();		//行
		int m=sc.nextInt();		//列
		int[][][] a=new int[n][m][1];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				a[i][j][0]=sc.nextInt();
			}
		}
		
	}
}

/**
struct Point{
    int x; 
    int y;
    int bo;//是否引爆 
};

int n,m,x = 0;
Point p[100];//存放炸弹

void DFS(Point boom,int k)
{
    for(int i = 0;i < x; i++)
    {
        if(i!=k&&p[i].bo==1&&(boom.x==p[i].x||boom.y==p[i].y)) 
        //如果未被引爆且行数或者列数等于其中的一个炸弹
        {
            p[i].bo = 0;//设置为已经爆炸了 
            DFS(p[i],i);
        }
    }
}

int main()
{
    cin >> n >> m;
    int num = 0;
    for(int i = 0; i < n; i++)
    {
        for(int j = 0; j < m; j++)
        {
            int tmp;
            scanf("%1d",&tmp);
            if(tmp)
            {
                p[x].x = i;
                p[x].y = j;
                p[x].bo = 1;
                x++;
            }
        }
    }
    for(int i = 0; i < x; i++)
    {
        if(p[i].bo)
        {
            num++;//需要引爆数目加一
            DFS(p[i],i);
        }
    }
    cout << num;
    return 0;
} 
*/