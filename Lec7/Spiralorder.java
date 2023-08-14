package Lec7;

public class Spiralorder {
public static void main(String args[])
{
int arr[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

    int sc=0;
    int ec=arr[0].length-1;
    int sr=0;
    int er=arr.length-1;
    int total=arr.length*arr[0].length;
    int cnt=0;
    while(cnt<total)
    {
        for(int i=sc;i<=ec&&cnt<total;i++)
        {
            System.out.print(arr[sr][i]+ " ");
            cnt+=1;
        }
        sr++;
        for(int i=sr;i<=er&&cnt<total;i++)
        {
            System.out.print(arr[i][ec]+" ");
        cnt+=1;
        }
        ec-=1;
    for(int i=ec;i>=sc&&cnt<total;i--)
    {
        System.out.print(arr[er][i]+" ");
    cnt+=1;
    }
        er--;
        for(int i=er;i>=sr&&cnt<total;i--)
        {
           System.out.println(arr[i][sc]+" ");
        cnt++;
        }
        sc++;
    }

}
}
