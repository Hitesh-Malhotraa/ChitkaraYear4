package Lec9;

public class FindDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="abcd";
		String s2="abcde";

	  int arr[]=new int[26];
	        for(int i=0;i<s1.length();i++)
	        {
	            char ch=s1.charAt(i);
	            int idx=ch-97;
	            arr[idx]=arr[idx]+1;
	        }
	        for(int i=0;i<s2.length();i++)
	        {
	            char ch=s2.charAt(i);
	            int idx=ch-97;
	            arr[idx]=arr[idx]-1;
	        }
	        char ans=' ';
	        for(int i=0;i<arr.length;i++)
	        {
	            if(arr[i]==-1)
	            {
	                ans=(char)(i+97);
	            }
	        }
	      System.out.print(ans);

}
	}
