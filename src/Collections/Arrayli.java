package Collections;
import java.util.ArrayList;


public class Arrayli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> A=new ArrayList<Integer>();

		ArrayList<Integer> A1=new ArrayList<Integer>();
		A.add(10);   	
		A.add(20);
		A.add(30);
		A1.add(10);
		A1.add(30);
		A.add(40);
		A1.add(20);
		A1.add(59);
	
		ArrayList<Integer> a=new ArrayList<Integer>(A1);
		a.retainAll(A);
		System.out.println(a);
		


	}

}
