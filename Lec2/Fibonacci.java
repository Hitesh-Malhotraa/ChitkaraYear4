package Lec2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=6;
int ans=sol(n);
	System.out.println(ans);
	}
	public static int sol(int n)
	{
		if(n==0||n==1)
		{
			return n;
		}
		int r1=sol(n-1);
		int r2=sol(n-2);
	return r1+r2;
	}

}
