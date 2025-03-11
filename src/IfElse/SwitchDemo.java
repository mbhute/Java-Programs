package IfElse;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		System.out.println("Enter the case TYPE:");
Scanner sc=new Scanner(System.in);
String casetype=sc.next();
System.out.println("The case number no is:"+casetype);

switch(casetype)
{
 case "Ross":
	    System.out.println("This ROSS store is all over USA");
	    break;	

 case "Taget":
	    System.out.println("This Target store is all over USA");
	    break;	
 case "Walmart":
	    System.out.println("This Walmart store is all over USA");
	    break;	

}
}
}
