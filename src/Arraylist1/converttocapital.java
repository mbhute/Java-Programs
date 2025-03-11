package Arraylist1;

import java.util.ArrayList;

public class converttocapital {

	public static void main(String[] args) {
		String []temp = null;
ArrayList<String>citylist=new ArrayList<String>();
citylist.add("Dallas");
citylist.add("Houston");
citylist.add("Austin");
citylist.add("SanAntonio");
citylist.add("Fortworth");



for(int i=0;i<=citylist.size()-1;i++)
	
{
	System.out.println(citylist.get(i).substring(0,1).toLowerCase()+citylist.get(i).substring(1).toUpperCase());
//	System.out.println(citylist.get(i).substring(0,1).toUpperCase());
                                                                                                                                                                                                                                               
}}
	


}
