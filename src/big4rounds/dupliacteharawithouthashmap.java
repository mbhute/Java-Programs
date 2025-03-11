package big4rounds;

public class dupliacteharawithouthashmap {

	public static void main(String[] args) {
	    String str = "abacadae";
        System.out.println("The string is: " + str);
        System.out.print("Duplicate Characters are: ");
        findDuplicateChars(str);
    }

    static void findDuplicateChars(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    System.out.print(str.charAt(j) + " ");
                    break;
                }
            }
        }
    }
}

	

