package Lec4;

public class TwoPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4,6};
int trgt=8;
int i=0;int j=arr.length-1;
boolean ans=false;;
while(i<j)
{
	if(arr[i]+arr[j]==trgt)
	{
		ans=true;
		break;
	}
	if(arr[i]+arr[j]>trgt)
	{
		j--;
	}
	else {
		i++;
	}
}
System.out.println(ans);
	}

}
