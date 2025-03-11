package big4rounds;

public class Removeunwantedchar {

	public static void main(String[] args) {
	String str1="a1b2c3d4e5f6";
	String temp=" abcdef";
	StringBuffer sb=new StringBuffer();
	sb.append(temp);
	sb.reverse();
	System.out.println("the word without number is  "+sb);    

	}
	
}
