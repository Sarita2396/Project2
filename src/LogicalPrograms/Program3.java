package LogicalPrograms;

import java.util.Scanner;

//reverse string
public class Program3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String rev="";
		
		int len = str.length();
		System.out.println(str.length());
		for(int i=len-1; i>=0; i-- )
		{
			rev = rev + str.charAt(i);
			
		}
		
		System.out.println(rev);
		
		//for(int i=len-1; i>=0; i--)
		//rev = rev + str.chatAt(i);
	}

}
