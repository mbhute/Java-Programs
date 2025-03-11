package big4rounds;

public class vowelandonsonants {
	public static void main(String[] args) {
	String str1="Javaisaeagoodlanguage";
	System.out.println("the total length of string is "+str1.length()
	);

int vwelcount=0;
	StringBuilder sb= new StringBuilder();
	
	sb.append(str1);
	for(int i=0;i<=str1.length()-1;i++)
	{
	if((sb.charAt(i)=='a')||(sb.charAt(i)=='e')||(sb.charAt(i)=='i')||(sb.charAt(i)=='o')||(sb.charAt(i)=='o'))
	{
		vwelcount++;
	}
			
	}		
	

	 
	int  consonantcount=str1.length()-vwelcount;
	

System.out.println("the vowels are"+vwelcount);

System.out.println("the consonant  are"+consonantcount);




	}
	
}
