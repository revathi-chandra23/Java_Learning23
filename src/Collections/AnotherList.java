package Collections;

import java.util.ArrayList;

public class AnotherList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> li=new ArrayList<Integer>();
		li.add(2);
		li.add(4);
		li.add(6);
		li.add(8);
		li.add(10);
		ArrayList<Integer> li1=new ArrayList<Integer>(li);
		li1.add(1);
		li1.add(3);
		li1.add(5);
		li1.add(7);
		li1.add(9);
		System.out.println(li1);
		System.out.println(li1.get(6));  // getting the element
		System.out.println(li1.set(8,11)); //setting replace modify the element
		System.out.println(li1);
	
		
	System.out.println(li);

	
	System.out.println(li1);
	li1.removeAll(li);
	System.out.println(li1);
	}

}
