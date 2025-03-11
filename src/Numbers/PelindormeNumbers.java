package Numbers;

import java.util.Scanner;

public class PelindormeNumbers {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
				
int num=sc.nextInt();
int rev=0;
while(num!=0)
{
	rev=rev*10+num%10;
	num=num/10;
	
}
System.out.println("The Reverse number is"+rev);
if(rev==num)
{
	System.out.println("The number is pelindrome");
	

}
else
{
	System.out.println("The number is not a  pelindrome");

}
}
	

}
