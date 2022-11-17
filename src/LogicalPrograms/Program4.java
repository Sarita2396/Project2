package LogicalPrograms;
//Palindrome no
public class Program4 {

	public static void main(String[] args) {

		int no = 1214;
		int rev = 0;
		int orgNo = no;
		 
		while(no!=0)
		{
			rev = rev*10 + no%10;
			no = no/10;
		}
		
		if(orgNo==rev)
		{
			System.out.println("Palindrome");
		}
		
		else
		{
			System.out.println("Not a palindrome");
		}
	}

}
