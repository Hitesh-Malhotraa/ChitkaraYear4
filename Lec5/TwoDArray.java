package Lec5;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int m=scn.nextInt();
int arr[][]=new int[m][n];
for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<arr[0].length;j++)
	{
		arr[i][j]=scn.nextInt();
	}
}
for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<arr[0].length;j++)
	{
		System.out.print(arr[i][j]+" ");
	}
	System.out.println();
}
	}

}
