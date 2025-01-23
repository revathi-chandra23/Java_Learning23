package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList li=new ArrayList(Arrays.asList(01,3,2,4,3,4,4));//linked ,vector ,stack
//List a = new ArrayList();
//List b = new LinkedList();
//List c = new Vector(); 
//List d = new Stack(); 
// allows null,duplicates

li.add(22);
Collections.addAll(li, 7,8,9,03);
System.out.println(li.toString());
System.out.println(li.get(4));



	}


}
