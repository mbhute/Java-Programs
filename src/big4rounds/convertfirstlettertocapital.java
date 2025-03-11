package big4rounds;

import java.util.Scanner;

public class convertfirstlettertocapital {

	public static void main(String[] args) {
		
		System.out.println("Enter the string:" );

Scanner sc=new Scanner(System.in);
String str1=sc.next();
System.out.println("the First capital of capital letter of changed  mystring is "+FirstCharUpperAllway1(str1));
	}

	
		public static String FirstCharUpperAllway1(String str2){
		     StringBuffer sb=new StringBuffer(str2);
		     for(int i=0;i<sb.length();i++)
		            if(i==0 || sb.charAt(i-1)==' ')
		          sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
		     return sb.toString();
		}


	}

