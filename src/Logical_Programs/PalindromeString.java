package Logical_Programs;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string"); 	
		String s1 = sc.next();
		String org_str=s1;
		String rev ="";
		
		int len = s1.length();
		
		for(int i=len-1; i>=0; i--)
		{
			  rev = rev + s1.charAt(i);
		}
		
		if(org_str.equalsIgnoreCase(rev))
		{
			System.out.println("palindrome string");
		}
		else
		{
			System.out.println("not a palindrome string");
		}
	}

}
