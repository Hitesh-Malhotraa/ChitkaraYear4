package Lec9;

public class validAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="anagram";
String s2="nagarama";
int arr[]=new int[26];
for(int i=0;i<s1.length();i++)
{
	int idx=s1.charAt(i)-97;
	arr[idx]++;
}
for(int i=0;i<s2.length();i++)
{
	int idx=s2.charAt(i)-97;
	arr[idx]--;
}
boolean ans=true;
for(int i=0;i<arr.length;i++)
{
	if(arr[i]!=0)
	{
		ans=false;
		break;
	}
}
System.out.println(ans);
	}

}
