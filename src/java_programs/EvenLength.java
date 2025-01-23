package java_programs;

public class EvenLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="hi im revathi candra";
		
		for(String s1:s.split(" "))
        {
            if(s1.length()%2==0)
            {
              System.out.println(s1);
            }
        }

	}

}
