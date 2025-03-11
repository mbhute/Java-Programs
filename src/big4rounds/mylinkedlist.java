package big4rounds;

import java.util.LinkedList;

public class mylinkedlist {

	public static void main(String[] args) {
LinkedList<String>l1= new LinkedList<>();
l1.add("John");
l1.add("jack");
l1.add("James");
l1.add("Jerome");
l1.add("Rax");

System.out.println("This is before iteartion"+l1);
l1.add(2,"Riah");
l1.remove(1);
System.out.println("This is after addition"+l1);
	}

}
