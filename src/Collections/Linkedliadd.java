package Collections;

import java.util.ArrayDeque;
import java.util.LinkedList;


public class Linkedliadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// add,addAll,addLast,addLastllkklllkk
		long start=System.currentTimeMillis()
;		LinkedList<String> li=new LinkedList<String>();
		
		//ArrayDeque<String> li = new ArrayDeque<String>();	
		li.add("run");
		li.add("ran");
		li.add("book");
		li.add("pen");
		System.out.println("first lis:"+li);
	//	li.add(2, "running");
		System.out.println("after adding insert method: "+li);
		li.addFirst("start this");
		System.out.println("adding first:"+li);
		li.addLast("pencil");
		li.add("pen");
		System.out.println("adding last: "+li);
		System.out.println(li);
		System.out.println(li.getFirst());
		System.out.println(li.getLast());
		//System.out.println(li.get(2));
		for(String l:li)
		{
			System.out.println(l);
		}
li.descendingIterator();
System.out.println(li);

//System.out.println("latsindex of "+li.lastIndexOf("pen"));

//System.out.println(li.subList(0, 3));
System.out.println(li.element());
System.out.println(li.offer("king"));
System.out.println(li);
System.out.println(li.offerFirst("hotel"));
System.out.println(li.offerLast("humming"));
System.out.println(li);
//System.out.println(li.lastIndexOf(7));
System.out.println(li.peek());
System.out.println(li);
System.out.println(li.peekLast());
System.out.println(li);
System.out.println(li.poll());
System.out.println(li);
//System.out.println(li.set(0,"hotel"));
System.out.println(li);
System.out.println(li.pop());
System.out.println(li);
System.out.println(3>>1);
//System.out.println(li.indexOf("pen"));


System.out.println("time taken :"+ (System.currentTimeMillis()-start));

	}

}
