package java_programs;

class per
{
	private int age;
	private String name;
	
	
	public int getAge()
	{
		return age;
	}
	
	public String getName()
	{
		return name;
	}

	public void setAge(int age) {
		this.age = age;
		// int a
		//age=a;
	}

	public void setName(String name) {
		this.name = name;
		// string n
		
		// name=n
	}
	
	
}

public class encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		per p=new per();
		p.setAge(23);
		p.setName("Revathi chandra");
		System.out.println("my name is :" + p.getName() + " and my age is " + p.getAge());

	}

}
