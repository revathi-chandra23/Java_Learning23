package Exceptions;
import java.util.Scanner;

public class Custom_exception extends Exception{ // create new exception class extending the exception class
	public Custom_exception(String str) //create a public constructor for new class with string parameter
	{
		super(str); // pass the string the parameter to the super class
		
	}
	

	public static void main(String[] args) throws Custom_exception {// declare the exception at method level
		// TODO Auto-generated method stub
		try
		{
			Scanner sc=new Scanner(System.in);
		System.out.println("enter your age:");
			int age=sc.nextInt();
			if(age>18)
			{
				System.out.println("you are eligible");
			}
			else
			{

				throw new Custom_exception("ypu are  not eligible");// throw the exception based on condition
			}
			
		}
		catch
		(Custom_exception e)  //write a catch block and use some pre_defined exceptions
		{
			e.printStackTrace();
		}
			
		
		

	}

}
