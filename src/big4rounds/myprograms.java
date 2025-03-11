package big4rounds;

import java.io.InputStream;
import java.util.Scanner;

public class myprograms {

	public static void main(String[] args) {
		System.out.println("Enter the string:" );

Scanner sc=new Scanner(System.in);
String str1=sc.next();
System.out.println("the reveser of mystring is "+reversemystring(str1));


		
	}

	private static String reversemystring(String str2) {
	String rev=" ";
	int len =str2.length();
	
	
	for(int i=len-1;i>=0;i--) {
		
		rev=rev+str2.charAt(i);
	
	}
	return rev;

	}
}


