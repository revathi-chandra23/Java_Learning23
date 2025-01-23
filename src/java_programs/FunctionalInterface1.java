package java_programs;

@FunctionalInterface

interface functiona
{
	void run();
}

public class FunctionalInterface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		functiona f=new functiona()
				
		{
		public void run()
		{
			System.out.println("im running");
		}
				
				
				};
				
				f.run();

	}

}
