package Practice_Program;

import java.util.Scanner;

public class Reverse_No {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int no = s.nextInt();
		System.out.println("Enter the no's");
		
		int rev=0;
		while(no!=0)
		{
			rev = rev*10 + no%10; //%gives last digit
			no = no/10;    //it remove last digit
		}
		System.out.println(rev); //removed no will be stored
	}

}
