package big4rounds;

public class countdupliacte {

	public static void main(String[] args) {
String str1="the the the  the the the  the the the the the India is";
String fin="the";

String []str2=str1.split(" ");
StringBuffer sb= new StringBuffer();
sb.append(fin);
int count=0;

for(int i=0;i<=str2.length-1;i++)
{
	
//	if(str2[i].contentEquals(sb))
	if(str2[i].contentEquals(fin))

	{
		count++;
		
}
	}
System.out.println("the word repeated "+count);    
	}

}
