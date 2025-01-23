package java_programs;

 abstract class Car
{
	public abstract  void drive();
	public void go()
	{
		System.out.println("im going");
	}
	
	
}
 
 class suzuki extends Car
 {
	 
	 public void drive()
	 {
		 System.out.println("im driving");
	 }
 }

public class CarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Car c= new suzuki();
		c.drive();
		c.go();
	}

}
