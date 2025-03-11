package Arraylist1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashmaptohashset {

	public static void main(String[] args) {
HashMap<String,Integer>hmap=new HashMap<String,Integer>();
hmap.put("India",23);
hmap.put("India",29);
hmap.put("India",26);
hmap.put("India",238);

hmap.put("Japan",24);
hmap.put("Iran",25);
hmap.put("Iraq",23);

Set<String> keySet = hmap.keySet();
System.out.println("The keyset values are,"+hmap.entrySet());
	}
	
}
