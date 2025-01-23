package Collections;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Dequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long start=System.currentTimeMillis()
;		ArrayDeque<String> dq = new ArrayDeque<String>();
		
			dq.add("helleh");
			dq.add("wtbh");
			dq.add("fegvjzeng");
			dq.add("book");
			dq.add("ramdj");
			System.out.println(dq);
		System.out.println(dq.pop());
		System.out.println(dq);
		System.out.println(dq.poll());
System.out.println(dq);		
		System.out.println(dq.pollLast());
		System.out.println(dq);
	
		System.out.println(dq.peek());
		
		
		System.out.println("time taken :"+ (System.currentTimeMillis()-start));
	
	}

}
