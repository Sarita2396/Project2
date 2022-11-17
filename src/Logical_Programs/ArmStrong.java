package Logical_Programs;

public class ArmStrong {

	//let's take a no 371 if the addition of cube of its no is equal to the original no then its Armstrong no 
	//no is equal to addition of no of cubes = 3cube+7cube+1cube = 371  
	public static void main(String[] args) {
		int num = 666, rem,sum=0;
		int num1 = num;
		while(num>0)
		{
			rem = num%10;
			sum = sum + rem*rem*rem;
			num = num/10;
			
		}
		if(num1==sum)
		{
			System.out.println("no is armstrong");
		}

		else
		{
			System.out.println("no is not an armstrong");
		}
	}
}
