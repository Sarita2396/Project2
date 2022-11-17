package Practice_Program;

import java.util.Scanner;

public class Plindrome_no {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no");
		int no = s.nextInt();
		
		int org_no = no;
		
		int rev=0;
		
		while(no!=0)
		{
			rev=rev*10 + no%10;
			no = no/10;
		}
		
		System.out.println("reverse value" +rev);
		
		if(org_no==rev)
		{
		System.out.println("Palindrome number");	
		}
		else
		{
			System.out.println("not a palindrome number");
		}
		
	}
	

}
