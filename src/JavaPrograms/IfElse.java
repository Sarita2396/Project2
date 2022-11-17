package JavaPrograms;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter markes");
		int marks = sc.nextInt();
		if(marks>40)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
