package JavaPrograms;

public class Constructor2 {
	
	int a,b;
	Constructor2()
	{
		a=10;
	}
	
	Constructor2(int c)
	{
		b=c;
	}

	Constructor2(int d, int e)
	{
		a=d;
		b=e;
	}

	public void call()
	{
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {

		Constructor2 obj = new Constructor2();
		obj.call();
				
		System.out.println("********************");

		Constructor2 ref = new Constructor2(56);
		ref.call();
		
		System.out.println("********************");
		
		Constructor2 var = new Constructor2(67, 89);
		var.call();
		
	}

}
