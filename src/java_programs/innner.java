package java_programs;



class out{
	public void show() // member inner class 
	{
		System.out.println("im the out ");
	}
	class in{
		public void show1()
		{
			System.out.println("im the IN");
		}
	}
	
	static class in1{  // static nested class
		public  void show2()
		{
			System.out.println("im the in-out");
		}
	}
	
	
}

public class innner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		out o=new out();
		o.show();
		
		
		
	out.in i=o.new in();
	i.show1();
	
	out.in1 i1=new out.in1();
	i1.show2();
	
	

	}

}
