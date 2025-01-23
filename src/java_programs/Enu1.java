package java_programs;

// enum using the if else if 

enum status
{
	run,fail,pass,success;
}

public class Enu1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 status s=status.success;
		 if(s==status.run)
		 {
			 System.out.println(" run");			
		 }
		 
		 else if(s==status.fail)
		 {
			 System.out.println("fail");
		 }
		 else if(s==status.pass)
		 {
			 System.out.println("pass");
		 }
		 else
		 {
			 System.out.println("success");
		 }

	}

}
