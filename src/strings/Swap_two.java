package strings;

public class Swap_two {

	public static void main(String[] args) {
		
	
	String str="java";
	System.out.println(swap(str));
	

	}
	
	public static String swap (String str)	{
	

if(str==null || str.isEmpty())
	
return str;



char ch[]=str.toCharArray();
for(int i=0;i<ch.length;i+=2)
{
	char temp= ch[i];
	ch[i]=ch[i+1];
	ch[i+1]=temp;
}

return  new String(ch);

		
	
	

	}


}
