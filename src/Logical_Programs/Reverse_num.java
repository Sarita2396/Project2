package Logical_Programs;

import java.util.Scanner;

public class Reverse_num {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number"); //1234 = 4321
		int num = sc.nextInt();  //----% will give you the last digit only
		int rev=0;               //----/ will removes the last digit
		while(num!=0)           //we have put a final value in rev so we want rev remain empty
		{
			rev = rev*10 + num%10; // 1234%4 = 4
			num = num/10;          //1234/4  =123
		}
		
		System.out.println(rev);
		
	}

}
