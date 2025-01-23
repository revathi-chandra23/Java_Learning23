package Exceptions;

public class Throww
{
	static void validate(int age)
	{
	if(age<18)
	throw new ArithmeticException("you are not eligible ");
	
	else
		System.out.println("you are  eligible");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		validate(17);
		
	}

}
