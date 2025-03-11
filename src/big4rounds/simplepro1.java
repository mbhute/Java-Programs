package big4rounds;

import java.util.HashMap;
import java.util.Map;

public class simplepro1 {

	public static void main(String[] args) {
		Map<String, Integer> people = new HashMap<String, Integer>();

		    // Add keys and values (Name, Age)
		    people.put("John", 32);
		    people.put("John", 32);
		    people.put("John", 32);
		    people.put("Steve", 30);
		    people.put("Angie", 33);

		    for (String i : people.keySet()) {
		      System.out.println("key: " + i + " value: " + people.get(i));
		    }
	}

}
