package Exceptions;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		int j=2;
		
		int k[]=new int[4];
		try 
		{
			//j=j/0;
			System.out.println(k[4]);
			System.out.println(k[3]);
			
		}
		
		catch( ArithmeticException e)
		{
			System.out.println("please check " + e.getMessage());
			//System.out.println(e.printStackTrace());
		}
		catch
		(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("please check " + e.getStackTrace());
		}
		System.out.println(j);
		//Exception is super class of the exception catch(Exception e) --> super class of exceptions  
	

	}

}
