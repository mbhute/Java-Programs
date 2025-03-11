package com.homejava;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class hashtableexa4 {

	public static void main(String[] args) {
		 Hashtable<Integer, String> ht = new Hashtable<>();
		  
		   
	        ht.put(1, "Java");
	        ht.put(2, "Scala");
	        ht.put(3, "Python");
	        ht.put(4, "Pearl");
	        ht.put(5, "R");
	        // Getting keySets of Hashtable and  storing it into Set	
	        //  // Iterating through the Hashtable  object using for-Each loop
	    
	        Set<Entry<Integer, String> > entrySet
            = ht.entrySet();
 
        // Iterating through the Hashtable object
        // using for-each loop
        for (Entry<Integer, String> entry : entrySet) {        
    	    System.out.println("keys are "+entry.getKey()+"   Values are : " + entry.getValue());
    }
	
	}

}
