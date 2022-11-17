package Programs;

public class Logical2 {

	public static void main(String[] args) {

		int num= 6789;
		int rev =0;
		
		while(num!=0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
	
		System.out.println(rev);
	
		System.out.println("******************");
		String str ="sarita";
		String rev1 ="";
		
		int len = str.length();
		for(int i=len-1; i>=0; i--)
		{
			rev1 = rev1 + str.charAt(i);
		}
		
		System.out.println(rev1);
		
		
	       }
		
	}
	
