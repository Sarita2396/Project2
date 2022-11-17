package JavaPrograms;

import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter bio marks");
		int bioMarks = sc.nextInt();
		if(bioMarks>=40 && bioMarks<59)
		{
			System.out.println("Second Class");
		}
		else if(bioMarks>=59 && bioMarks<=70)
		{
			System.out.println("First Class");
		}
		else if(bioMarks>=70 && bioMarks<90)
		{
			System.out.println("Distinction");
		}
		else if(bioMarks>=90 && bioMarks<100)
		{
			System.out.println("merit");
		}
		else
		{
			System.out.println("fail in bio");
		}
	}

}
