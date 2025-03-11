package com.homejava;

import java.util.Enumeration;
import java.util.Hashtable;

public class Hashtableexa {

	public static void main(String[] args) {
		Hashtable<String,Integer>friend=new Hashtable<>();
		friend.put("dept1",101);
		friend.put("dept2",201);
		friend.put("dept3",301);
		friend.put("dept4",401);
		Enumeration<String>keys=friend.keys();
		while(keys.hasMoreElements())
		{
			 String key = keys.nextElement();
		     System.out.println(key + ": " + friend.get(key));
		 
		}
			}

}
