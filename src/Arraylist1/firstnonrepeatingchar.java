package Arraylist1;

import java.util.HashMap;
import java.util.Map;

public class firstnonrepeatingchar {

	public static void main(String[] args) {
String  str1 = "gwaliorisgreat";

char [] ch1=str1.toCharArray();
Map<Character,Integer>mycharcount=new HashMap<>();
for(Character c: ch1)
{
	mycharcount.put(c, mycharcount.getOrDefault(c, 0) + 1);
}
	
	 for (Map.Entry<Character, Integer> entry : mycharcount.entrySet()) {
// System.out.println("This is the occurance of char:"+"Character: " + entry.getKey() + ", Count: " + entry.getValue());
         
         if(((entry.getValue())==1))
        		 {
             System.out.println("Non Repeating Character  are : " + entry.getKey() + ", Count: " + entry.getValue());
 
        		 }
}
}
	}

