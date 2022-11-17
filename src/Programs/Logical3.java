package Programs;

public class Logical3 {

	public static void main(String[] args) {

		int num = 11211;
		int rev = 0;
		int orgNum = num;
		
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		if(orgNum==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		
		System.out.println("*********************");
		
		String s1 = "mad";
		String rev2 ="";
		String orgS1 = s1;
		
		int leng = s1.length();
		
		for(int i=leng-1; i>=0; i--)
		{
			rev2 = rev2 + s1.charAt(i);
		}
		
		if(orgS1.equals(rev2))
		{
			System.out.println("Palindrome String");
		}
		else
		{
			System.out.println("Not Palindrome String");
		}
		
	}

}
