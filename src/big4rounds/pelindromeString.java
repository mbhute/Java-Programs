package big4rounds;

import java.util.Scanner;

public class pelindromeString {

    public static void main(String[] args) {
    	
    	System.out.println("Enter the string to check for pelindrome");
    	Scanner sc=new Scanner(System.in);
    	String str1=sc.next();
    	StringBuilder sb=new StringBuilder(str1);
    	sb.reverse();
if(str1.equals(sb.toString()))
	
{
	System.out.println("String is pelindrome");

}
else
{
	System.out.println("String is not pelindrome");

}
    }
    

}
