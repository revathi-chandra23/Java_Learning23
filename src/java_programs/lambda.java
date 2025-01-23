package java_programs;

interface z

{
	void sow(int i);
}

public class lambda {
	public static void main( String args[])
	{
		
		
		// lambda expression 
		z s=(int i) -> System.out.println("im sow"+i);
		s.sow(4);
	}

}
