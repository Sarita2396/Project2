package Logical_Programs;

import java.util.Scanner;

public class Palindrome {

	//16461 = 16461
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number"); 	
		int num = sc.nextInt();
		int org_num=num;  //
		
		int rev = 0;
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		if(org_num==rev)
		{
			System.out.println("palindrome no");
		}
		
		else
		{
		    System.out.println("not a palindrome no");
		}
	}

}
