package Arraylist1;

public class findduplicatewithouthashmap {

	public static void main(String[] args) {
		  String sentence = "This is a test sentence and this is a test"; 
	        String[] words = sentence.split("\\s+"); 

	        for (int i = 0; i < words.length; i++) {
	            words[i] = words[i].toLowerCase();
	        }

	        System.out.println("Duplicate words in the sentence:");
	        for (int i = 0; i < words.length; i++) {
	            for (int j = i + 1; j < words.length; j++) {
	                // Check if words[i] equals words[j] and is not already printed
	                if (words[i].equals(words[j])) {
	                    boolean alreadyPrinted = false;
	                    // Check if the word has already been printed
	                    for (int k = 0; k < i; k++) {
	                        if (words[i].equals(words[k])) {
	                            alreadyPrinted = true;
	                            break;
	                        }
	                    }if (!alreadyPrinted) {
	                        System.out.println(words[i]);

	}
	                
	            }
	        }
	        }
	}
}
