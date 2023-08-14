package Lec1;

public class Find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,43,2,7};
int trgt=43;
int ans=find(arr,trgt,0);
System.out.println(ans);
	}
	public static int find(int arr[],int trgt,int idx)
	{
		if(idx>=arr.length)
		{
			return -1;
		}
		if(arr[idx]==trgt)
		{
			return idx;
		}
		return find(arr,trgt,idx+1);
	}

}
