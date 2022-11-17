package Practice_Program;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
				
		System.out.println("Enter a string");
		
		String s1 = s.next();
		
		String rev = "";
		
		String org_str = s1;
		
		int len = s1.length();
		
		
		for(int i=len-1; i>=0; i--)
		{
			
			rev = rev + s1.charAt(i);

		}
		
		System.out.println("Reverse String = " +rev);
		
		if(org_str.equals(rev))
		{
			System.out.println("Palindrome String");
		}
		else
		{
			System.out.println("Not a palindrome string");
		}
		
	}

}
