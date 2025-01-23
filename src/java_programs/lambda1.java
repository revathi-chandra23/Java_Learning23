package java_programs;
@FunctionalInterface
interface y
{
	int ys(int i , int j);

}

public class lambda1 {
	public static void main
	(String args[])
	{
		y s=(i,j)-> i+j; // lamda return type
		System.out.println(s.ys(1, 10));
		}

}
