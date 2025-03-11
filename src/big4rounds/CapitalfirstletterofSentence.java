package big4rounds;

import java.util.Scanner;

public class CapitalfirstletterofSentence {

	public static void main(String[] args) {

		
		 String sentence = "this is a sentence.";
	        String capitalizedSentence = capitalizeFirstLetter(sentence);
	        System.out.println(capitalizedSentence);
	    }

	    public static String capitalizeFirstLetter(String sentence) {
	        if (sentence == null || sentence.isEmpty()) {
	            return sentence;
	        }

	        return sentence.substring(0, 1).toUpperCase() + sentence.substring(1);
	    }

}
