package Lec1;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,3,4,3,6,7,8,9};
int trgt=3;
	int cnt=count(arr,trgt,0,0);
	}
	public static int count(int arr[],int trgt,int idx,int cnt)
	{
		if(arr.length==idx)
		{
			return cnt;
		}
		if(arr[idx]==trgt)
		{
			return count(arr,trgt,idx+1,cnt+1);
		}
		else {
			return count(arr,trgt,idx+1,cnt);
		}
	}

}
