package Arraylist1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicate {

	
		

		    public static void main(String[] args) {
		        ArrayList<String> fruitlist = new ArrayList<>();
		        fruitlist.add("apple");
		        fruitlist.add("banana");
		        fruitlist.add("orange");
		        fruitlist.add("apple");
		        fruitlist.add("banana");
		        fruitlist.add("grape");

		        HashMap<String, Integer> fruitmap = new HashMap<>();

		        for (String fruit : fruitlist) {
		            if (fruitmap.containsKey(fruit)) {
		            	fruitmap.put(fruit, fruitmap.get(fruit) + 1);
		            } else {
		                // If it does not exist, add it to the map with count 1
		                fruitmap.put(fruit, 1);
		            }
		        }

		        // Print out the duplicates (strings with a count greater than 1)
		        System.out.println("Duplicate strings:");
		        for (String fruit : fruitmap.keySet()) {
		            if (fruitmap.get(fruit) > 1) {
		                System.out.println(fruit);
		            }
		        }
		    }
		}
		