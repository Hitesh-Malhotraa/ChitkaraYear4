package Lec3;

public class Boardpath2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=10;
int ans=totalWays(0,n,6);
	System.out.println(ans);
	}
	public static int totalWays(int strt,int end,int dice)
	{
		if(strt>end) {
			return 0;
		}
		if(strt==end)
		{
			return 1;
		}
		int cnt=0;
		for(int i=1;i<=dice;i++)
		{
			cnt+=totalWays(strt+i,end,dice);
		}
		return cnt;
	}

}
