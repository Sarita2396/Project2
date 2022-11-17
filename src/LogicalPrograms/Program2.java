package LogicalPrograms;

import java.util.Scanner;

//reverse no
public class Program2 {

	public static void main(String[] args) {

		System.out.println("Enter a no");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int rev=0;
		
		while(no!=0)
		{
			rev = rev*10 + no%10;
			no = no/10;
		}
		
		System.out.println(rev);
	}

}
