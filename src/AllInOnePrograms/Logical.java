package AllInOnePrograms;

public class Logical {

	public static void main(String[] args) {

		int num=641, rem, sum=0;
		int newNum = num;
		while(num>0
				)
		{
			rem =num%10;
			sum = sum + rem*rem*rem;
			num = num/10;
			
		}
		
		if(newNum==sum)
		{
			System.out.println("arm");
		}
		else
		{
			System.out.println("not arm");
		}
	}

}
