package Lec5;

public class Sort01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {0,0,0,1,1,1,1,0,1,1,0,1,1,0};
int i=0;
int j=arr.length-1;
while(i<j)
{
	if(arr[i]==0)
	{
		i++;
	}
	else if(arr[j]==1)
	{
		j--;
	}
	else {
		arr[i]=0;
		arr[j]=1;
		i++;
		j--;
	}
}
for(int k=0;k<arr.length;k++)
{
	System.out.print(arr[k]+" ");
}
	}

}
