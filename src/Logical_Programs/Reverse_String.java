package Logical_Programs;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the string");
		String str ="Sarita";
		String rev = "";
		int len = str.length();
		
		for(int i=len-1; i>=0; i--)  //Length-1 because index starts with zero count = 0,1,2,3,4,5
		{
			rev = rev + str.charAt(i);
		}
		
		System.out.println("String =" +rev);
		
		System.out.println("****************");
		
		String s1 = "mangu";
		String r1 ="";
		int size = s1.length();
		for(int i=size-1;i>=0;i--)
		{
			r1=r1 + s1.charAt(i);
		}
		
		System.out.println("Reverse String = " +r1);
	}

}
