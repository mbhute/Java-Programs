package Arraylist1;

import java.util.Scanner;

public class pelindrome {

	public static void main(String[] args) {
		System.out.println("Enter the word :");

		Scanner sc= new Scanner(System.in);
	
String str=sc.next();	
System.out.println("The reverse string is "+reverse(str));
String str1=reverse(str);
if(str==str1)
{
		System.out.println("The word is pelindrome");

	}
else
{
	System.out.println("The word is not  pelindrome");

}

}


	

		private static String reverse(String mystring)
		{
			String temp= " ";
		int len=mystring.length();
		for(int i=len-1;i>=0;i--)
		{
		temp=temp+mystring.charAt(i);
		 }
			return temp;
			}

			
}


