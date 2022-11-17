package LogicalPrograms;
//Palindrome String
public class Program5 {

	public static void main(String[] args) {

		String str= "lol";
		String rev ="";
		String orgString = str;
		int var = str.length();
		
		for(int i=var-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		
		if(orgString.equalsIgnoreCase(rev))
		{
			System.out.println("Palindrome String");
		}
		else
		{
			System.out.println("Not a Palindrome String");
		}
	}

}
