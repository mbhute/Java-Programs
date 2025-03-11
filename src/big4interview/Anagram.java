package big4interview;

import java.util.Arrays;

public class Anagram {
	 public static boolean areAnagrams(String str3, String str4) {
		 int len1=str3.length();
		 int len2=str4.length();

		for(int i=0;i<=len1-1;i++)
		{
			if((str3.charAt(i))
					==(str3.charAt(i)))
				
					{
				System.out.println("The words are Anagram ");
		
					}
			return true;
			
 
	
		
}
		
				
	return false;
		 
		 
		 
		 
	 }
	 
	public static void main(String[] args) {
		 String str1 = "listen";
	        String str2 = "silent";
	        Boolean value=areAnagrams(str1,str2);
	System.out.println("the value is "+value);
	
}

}


