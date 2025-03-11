package big4rounds;

import java.util.LinkedHashMap;
import java.util.Map;

public class repeatingchar {
	  public static Character findFirstNonRepeatingChar(String str) {
	        Map<Character, Integer> hmap = new LinkedHashMap<>();

	       
	        for (char ch : str.toCharArray()) {
	            hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
	        }

	       for (Map.Entry<Character, Integer> entry : hmap.entrySet()) {
	            if (entry.getValue() == 1) {
	                return entry.getKey();
	            }
	            
	        }

	        return null; // No non-repeating character found
	    }
	public static void main(String[] args) 
	{
		
	 String input = "abacddbec";
     Character result = findFirstNonRepeatingChar(input);

     if (result != null) {
         System.out.println("First non-repeating character: " + result);
     } else {
         System.out.println("No non-repeating character found.");
     }
}
}