package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("reva");
		a.add("chandra");
		a.add("string");
		a.add("reva");
		a.add("rc");
		a.add("tan");
		
		Iterator<String> itr=a.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		
		HashSet<String> s= new HashSet<String>();
		s.addAll(a);
		System.out.println(s);

	}

}
