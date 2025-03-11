package com.homejava;

public class Student {
int id;
String name;
Student(int id1,String name1)
{
this.id=id1;
this.name=name1;
}
void display()
{
	int p;
	
	System.out.println("the value of id "+id+" & name is"+name);
	System.out.println("showing the change value of name in int ");
	p=Integer.parseInt(name);
	System.out.println(+p);
}

	public static void main(String[] args) {
Student s1= new Student(111,"Ashok");
Student s2= new Student(114,"Pathak");
s1.display();
s2.display();
	}

}
