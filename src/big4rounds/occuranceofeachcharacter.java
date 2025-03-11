package big4rounds;

import java.util.HashMap;
import java.util.Map;

public class occuranceofeachcharacter {

	public static void main(String[] args) {
	    String str = "AABBBCCCCaaaaa";
        Map<Character, Integer> charCounts = countCharacters(str);
        
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }

    public static Map<Character, Integer> countCharacters(String str) {
        Map<Character, Integer> charCounts = new HashMap<>();
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }
        
        return charCounts;
    }
}