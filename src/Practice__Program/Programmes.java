package Practice__Program;

public class Programmes {

	public static void main(String[] args) {

		//RevString
		
		String str = "madam";
		String rev = "";
		String newStr = str;
		
		int len = str.length();
		for(int i=len-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		
		if(newStr.equals(rev))
		{
			System.out.println("Palindrome String");
		}
		
		else
		{
			System.out.println("Not Palindrome String");

		}
		
		
	}

}
