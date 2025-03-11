package big4rounds;

import java.util.HashMap;
import java.util.Map;

public class hmapsimplelogic {

	public static void main(String[] args) {
		   Map<String, Integer> hm = new HashMap<>();
	        hm.put("Geek1", 1);
	        hm.put("Geek2", 2);

	        // Key "Geek1" exists, so its 
	        // associated value is returned
	        int a = hm.getOrDefault("Geek1", 10);
	        int b=hm.getOrDefault("Geek2", 10);
	        System.out.println("Value for 'Geek1': " + a);
	        System.out.println("Value for 'Geek2': " + b);

	}

}
