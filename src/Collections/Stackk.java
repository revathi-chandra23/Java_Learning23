package Collections;

import java.util.LinkedList;
import java.util.Stack;

public class Stackk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack <String> st=new Stack();
		st.push("chandra");
		st.push("ramu");
		st.push("vamsi");
		st.push("somi");
		System.out.println(st);
		
		System.out.println(st.size());
		System.out.println(st.pop());
		System.out.println(st);
		st.forEach((e)->{
			System.out.println(e);
		});
	}
	

}
