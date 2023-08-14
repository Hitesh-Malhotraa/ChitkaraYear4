package Lec8;

public class RainwaterTrapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {4,2,0,3,2,5};
		        int lr[]=new int[arr.length];
		        int rl[]=new int[arr.length];
		        lr[0]=arr[0];
		        rl[arr.length-1]=arr[arr.length-1];
		        for(int i=1;i<arr.length;i++)
		        {
		            lr[i]=Math.max(arr[i],lr[i-1]);
		        }
		        for(int i=arr.length-2;i>=0;i--)
		        {
		            rl[i]=Math.max(arr[i],rl[i+1]);
		        }
		        int sum=0;
		        for(int i=0;i<arr.length;i++)
		        {
		            int val=Math.min(lr[i],rl[i])-arr[i];
		            sum=sum+val;
		        }
		        System.out.println(sum);
		    }
		}
