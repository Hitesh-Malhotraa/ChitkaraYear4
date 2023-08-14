package Lec8;

public class ProductofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4};
		        int res[]=new int[arr.length];
		        int lr[]=new int[arr.length];
		        int rl[]=new int [arr.length];
		   
		   int multi=1;
		   for(int i=0;i<arr.length;i++)
		   {
		        multi=multi*arr[i];
		       lr[i]=multi;
		   }
		   multi=1;
		   for(int j=arr.length-1;j>=0;j--)
		   {
		multi=multi*arr[j];
		rl[j]=multi;
		   }
		   for(int i=0;i<arr.length;i++)
		   {
		       int left=1;
		       int right=1;
		       if(i-1>=0)
		       {
		left=lr[i-1];
		       }
		       if(i+1<arr.length)
		       {
		right=rl[i+1];
		       }
		       
		       int ans=left*right;
		       res[i]=ans;
		   }
//		return res;      
for(int i=0;i<arr.length;i++)
{
	System.out.print(res[i]+" ");
}
		    }
		}

