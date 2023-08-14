package Lec9;

public class FrequencyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="jdjkfjkfdgkldlkflkd";
int arr[]=new int[26];
for(int i=0;i<s1.length();i++)
{
    char ch=s1.charAt(i);
    int idx=ch-97;
    arr[idx]=arr[idx]+1;
}
for(int i=0;i<arr.length;i++)
{
	char ch=(char)(i+97);
	System.out.println(ch+" -> "+arr[i]);
}
}
}