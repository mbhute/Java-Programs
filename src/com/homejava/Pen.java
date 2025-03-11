package com.homejava;

public class Pen {
	Pen(String name)
{
	System.out.println("constructor with  one argument with ones string type is "+name);
	
}
	Pen(String name,String category)
{
	System.out.println("constructor with  two argument with two string type are"+name+category);
	
}
	Pen (double price)
	{
		System.out.println("constructor with  one  argument with one float type"+price);
	}
}
