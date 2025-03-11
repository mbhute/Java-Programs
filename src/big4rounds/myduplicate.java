package big4rounds;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class myduplicate {

	public static void main(String[] args) {
String [] mystr= {"Amar","Amarr","Amar","Amaar","Amarr","Amar"};

Map<String,Integer>mymap=new HashMap<>();
for(String s:mystr)
{
	mymap.put(s,mymap.getOrDefault(s, 0) + 1);
	}

	   System.out.println("Duplicate words:");
       for (Map.Entry<String, Integer> entry : mymap.entrySet()) {
           if (entry.getValue() > 1) {
               System.out.println(entry.getKey() + " - " + entry.getValue()+" times");
           }
       }
}

}
