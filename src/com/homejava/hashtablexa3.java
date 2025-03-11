package com.homejava;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;


public class hashtablexa3 {

	public static void main(String[] args) {
		  Hashtable<Integer, String> ht = new Hashtable<>();
		  
		   
	        ht.put(1, "Java");
	        ht.put(2, "Scala");
	        ht.put(3, "Python");
	        ht.put(4, "Pearl");
	        ht.put(5, "R");
	        // Getting keySets of Hashtable and  storing it into Set	
	        //  // Iterating through the Hashtable  object using for-Each loop
	        Set<Integer > setOfKeys = ht.keySet();
	        Iterator<Integer>it=setOfKeys.iterator();
	     while(it.hasNext())   
	     {
	    	 Integer key =it.next();
	    	    System.out.println("keys are "+key+"   Values are : " + ht.get(key));

	     }
	        
	}

}
