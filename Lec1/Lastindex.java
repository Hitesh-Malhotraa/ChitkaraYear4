package Lec1;

public class Lastindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,4,3,2,5,6,78,90};
int trgt=78;
int ans=find(arr,trgt,0);
System.out.println(ans);
	}
	public static int find(int arr[],int trgt,int idx)
	{
		if(idx>=arr.length)
		{
			return -1;
		}
		int res=find(arr,trgt,idx+1);
		if(res==-1&&arr[idx]==trgt)
		{
			return idx;
		}
		return res;
	}

}
