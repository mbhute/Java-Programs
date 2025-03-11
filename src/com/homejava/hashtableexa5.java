package com.homejava;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class hashtableexa5 {

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
Iterator<Entry<Integer,String>>it=entrySet.iterator();
while(it.hasNext())
{
	it.hasNext();
    System.out.println("keys are "+it.next()+"  Values are : " + entrySet.notifyAll());
	
}

	}

}
