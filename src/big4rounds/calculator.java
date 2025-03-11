package big4rounds;

public class calculator {

	calculator(){
		System.out.println("Hi There s calling");
	}
	public void add(String message) {
		
		System.out.println(message);

	}
public void sub(String message) {
		
	System.out.println(message);

	}
public static void main(String[] args) {
	calculator c1=new calculator();
	calculator c2=new calculator();
	c2.add("this is an additional message");

}
	}


