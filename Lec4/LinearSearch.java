package Lec4;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int arr[]=new int[n];
for(int i=0;i<arr.length;i++)
{
	arr[i]=scn.nextInt();
}
int trgt=scn.nextInt();
int idx=-1;
for(int i=0;i<arr.length;i++)
{
	if(arr[i]==trgt)
	{
		idx=i;
		break;
	}
}
System.out.println(idx);
	}

}
