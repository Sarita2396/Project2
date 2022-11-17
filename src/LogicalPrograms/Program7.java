package LogicalPrograms;
//ArmStrong
public class Program7 {

	public static void main(String[] args) {

		int num=343, rem, sum=0;
		int num1 = num;
		while(num>0)
		{
			rem = num%10;
			sum = sum + rem*rem*rem;
			num=num/10;
		}
		
		if(num1==num)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("No");
		}
	}
	
	int num=321, rem,sum=0;
	int num1 = num;
	
	while(num>0)
	{
		rem = num%10;
		sum = sum + rem*rem*rem;
		num = num/10;
	}
	
	if(num1==num)
	{
		System.out.println("yes");
	}
	else
	{
		System.out.println("no");
	}
 }
}
