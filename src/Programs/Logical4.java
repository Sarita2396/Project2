package Programs;
//ArmStrong
public class Logical4 {

	public static void main(String[] args) {

		int num=371, rem, sum=0;
		int orgnum = num;
		
		while(num!=0)
		{
			rem = num%10;
			sum = sum + rem*rem*rem;
			num = num/10;
		}
		
		
		if(orgnum==sum)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong no");
		}
	}

}
