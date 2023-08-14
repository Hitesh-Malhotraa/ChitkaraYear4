package Lec3;

public class BoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=10;
int dice=6;
		int ans=totalWays(0,n,dice);
	System.out.println(ans);
	}
	public static int totalWays(int strt,int end,int dice)
	{
		if(strt==end)
		{
			return 1;
		}
		if(strt>end)
		{
			return 0;
		}
		int cnt=0;
		if(strt==0)
		{
			cnt+=totalWays(strt+1,end,dice);
			cnt+=totalWays(strt+6,end,dice);
		}
		else {
			for(int i=1;i<=dice;i++)
			{
				cnt+=totalWays(strt+i,end,dice);
			}
		}
		return cnt;
	}
}