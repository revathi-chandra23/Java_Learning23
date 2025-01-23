package java_programs;


class A
{

	public A() {
		super();
		
		System.out.println("im a");
	}
	
	public A(int n)
	{
		System.out.println("n of A");
	}
	
	
}

class B extends A
{

	public B() {
		super();
		
		System.out.println("im B");
	}

	public B(int n) {
		
this();
		// constructor will execute with in the class
		System.out.println(" n of B");
	}
	
	
}

public class thisuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B ob=new B(5);

	}

}
