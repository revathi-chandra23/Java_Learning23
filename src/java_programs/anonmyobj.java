package java_programs;



class obj{
	public obj()
	{
	 System.out.println("anonymous object");	
	}
	
	public void show()
	{
		System.out.println("im showing to you ");
	}
	
	public void book()
	{
		System.out.println("im here to book");
	}
}

public class anonmyobj {


	public static void main(String[] args) {
		// anonymous ob	ject
		
		new obj().show();
		new obj().book();

	}

}
