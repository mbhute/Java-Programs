package Arraylist1;

public class movethreeletters {

	public static void main(String[] args) {
String str1="company";
String str2=str1.substring(3);
System.out.println("The String last 4 char is "+str2);

String rev="";
for(int i=3;i>0;i--)
{
	rev=rev+str1.charAt(i);
	
}
System.out.println("The rev is "+rev);
	StringBuilder sb=new StringBuilder();
	sb.append(rev);

	System.out.println("The jumbeled arrange string is  "+sb.append(str2));
	
}
}
