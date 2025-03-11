import java.util.LinkedHashMap;
import java.util.Map;

public class linkedhashmap {

	
		 public static void main(String[] args) {
			  // Create a LinkedHashMap with insertion order
			  LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
			 

			  // Add key-value pairs
			  map.put("apple", 1);
			  map.put("banana", 2);
			  map.put("cherry", 3);
			  map.put("date", 4);
			 

			  // Iterate and print elements in insertion order
			  System.out.println("Elements in insertion order:");
			  for (Map.Entry<String, Integer> entry : map.entrySet()) {
			  System.out.println(entry.getKey() + ": " + entry.getValue());
			  }	// TODO Auto-generated method stub

	}

}
