package Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;



public class iteratefor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> name=Arrays.asList("Revathi","kranthi","tanuja","sowmya","somii" ,"" );
		//basic for loop
		System.out.println("1");
				for(int i=0;i<name.size();i++)
				{
					System.out.println(name.get(i));
				}
				// using for each loop
				
				System.out.println("2");
				
				for(String Nam:name)
				{
					System.out.println(Nam);
				}
				// using for each +lambda
				
				System.out.println("3");
				
			name.forEach((e)-> System.out.println(e)
			);	
			
			
				
	}

}
