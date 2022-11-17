package LogicalPrograms;
//Factorial
//5!= 1*2*3*4*5
public class Program8 {

	public static void main(String[] args) {

		long f = 1;
		for(int i=1; i<=5; i++)
		{
			f = f*i;
		}
		
		System.out.println(f);
	}

}
