
package Exceptions;

public class Nullpoiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			try{ 
	            Class.forName("Class1");   // Class1 is not defined 
	        } 
	        catch(ClassNotFoundException e){ 
	            System.out.println(e); 
	            System.out.println("Class Not Found..."); 
	        } 
		String s="d";

		System.out.println(s.charAt(0));
		int num=Integer.parseInt("booki");
		System.out.println(num);
				String b= "gfyefuehf hgdhea";
				System.out.println(b.charAt(33));
				
				  
				
;
		
		System.out.println(s.charAt(0));
		}	
		catch(NullPointerException e){
			System.out.println(e.getMessage());
			
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		catch
		(NumberFormatException e)
		{
			System.out.println(e.getMessage());
		}


	}

}
