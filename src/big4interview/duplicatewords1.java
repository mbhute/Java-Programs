package big4interview;

import java.util.HashMap;
import java.util.Map;

public class duplicatewords1 {
	

	public static void main(String[] args) {
        String text = "This is a test string. This string contains some duplicate words.";

        String[] words = text.split("\\s+");

        Map<String, Integer> wordFrequency = new HashMap<>();

        for (String word : words) {
            word = word.toLowerCase(); 
            if (wordFrequency.containsKey(word)) {
                wordFrequency.put(word, wordFrequency.get(word) + 1);
            } else {
                wordFrequency.put(word, 1);
            }
        }

       
        System.out.println("Duplicate words:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
            }
        }
    }
}



