package Aa;

public class JavaLogicalProgram {

	public static void main(String[] args) {

		
		int no = 371, sum=0, rem;
		int newNo = no;
		
		while(no!=0)
		{
			rem = no%10;
			sum = sum + rem*rem*rem;
			no = no/10;
		}
		
		if(newNo==sum)
		{
			System.out.println("Arm No");
		}
		else
			System.out.println("Not Arm No");
	}

}
