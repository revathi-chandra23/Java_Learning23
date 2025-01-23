package Collections;

import java.util.Collection;
import java.util.ArrayList;
public class CollecionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> col=new ArrayList<>();
		col.add("apple");
		col.add("ran");
		col.add("banana");
		col.add("mango");
		System.out.println(col);
		
		Collection<String> col1=new ArrayList<>();
		col1.add("chocolate");
		col1.add("biscuit");
		col1.add("mango");
		col.add("apple");
		col1.addAll(col);
		System.out.println(col1);
		
		System.out.println(col.contains("apple"));
		
		col.remove("ran");
		System.out.println(col);
		
		
		System.out.println("\n");
	System.out.println(	col.containsAll(col1));
	
	
		System.out.println(col.isEmpty());
		System.out.println(col.hashCode());
		System.out.println(col.stream());
		System.out.println(col.size());
		System.out.println(col.remove(null));
		System.out.println(col.removeAll(col1));
		System.out.println(col1);
		System.out.println(col.addAll(col1));
		System.out.println(col);
		System.out.println(col.remove("chocolate"));
		System.out.println(col.remove("biscuit"));
		System.out.println(col);
		System.out.println(col.spliterator());
	col.retainAll(col1);
	System.out.println(col);
		
//		col.forEach((e)->{
//			System.out.println(e);
//		});
//		

	}

}
