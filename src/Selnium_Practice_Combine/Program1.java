package Selnium_Practice_Combine;

public class Program1 {

	public static void main(String[] args) {
		
		String str = "sarita";
		String rev="";
		
		int var = str.length();
		for(int i=var-1; i>=0;i--)
		{
			rev=rev + str.charAt(i);
		}

		System.out.println(rev);
	}

}
