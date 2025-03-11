package big4rounds;
class A
{
	int a=100;
	
void show()
{

	System.out.println("the a from parent class is "+a);

}
}

class B extends  A
{
	int b=200;
	void show()
	{
		System.out.println("the B from child class  is "+a);

	}
}

class C extends B
{
	int c=300;
	
void show()
{

	System.out.println("the c  from  class c is "+c);

}
}

  
public class Inhertitancetype {

	public static void main(String[] args) {
	B bobj=new B();
	C cobj=new C();
//		A aobj=new A();
		System.out.println("the a from parent class is ");

		System.out.println(bobj.a);
	System.out.println("the B from child class  is "+bobj.b);

	System.out.println("the C from child class  is "+cobj.c);
	
	System.out.println("the C from child class  is "+cobj.a);

//		aobj.show();
//		bobj.show();
		
	}

}
