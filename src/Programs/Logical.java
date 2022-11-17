package Programs;

public class Logical {

	public static void main(String[] args) {

		for(int i=2; i<=10; i=i+2)
		{
			System.out.println(i);
		}
		
		for(int i=1; i<=10; i=i+2)
		{
			System.out.println(i);
		}
		
		//Factorial
		
		long fact = 1;
		for(int i=1; i<=5; i++)
		{
			fact = fact*i;
		}
		
		System.out.println(fact);
		
		System.out.println("******************");
		
		int a=10, b=80, temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("a=" +a +" " +"b="+b);
		
	}

}
