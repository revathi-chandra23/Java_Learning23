package Exceptions;

public class returnwthexceptions {
	public static void main(String[] args)
	{
		System.out.println(methodreturn());
	}
	public static int methodreturn()
	{
		try
		{
			System.out.println("Try block");
			return 10/0;
		}
		catch(Exception e)
		{
			System.out.println("catch block");
			return  10/0;
		}
		finally
		{
			System.out.println("this final to be executed ");
		}
	}

}
