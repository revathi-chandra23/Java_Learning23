package strings;

public class regexxxxx {
	public static void main(String args[])
	{
String input = "The quick brown fox jumps over the lazy dog";


        
        // Use regular expression to split the string by spaces
        String[] words = input.split("\\s+");
        
        for (String word : words) {
            System.out.print(word.charAt(0)+" ");
            
            
        }
	}

}
