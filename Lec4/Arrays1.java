package Lec4;

import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int arr[]=new int[n];
for(int i=0;i<arr.length;i++)
{
	arr[i]=scn.nextInt();
}
for(int i=0;i<arr.length;i++)
{
	System.out.print(arr[i]+" ");
}
	}

}
