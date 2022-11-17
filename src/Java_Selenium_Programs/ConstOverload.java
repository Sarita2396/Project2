package Java_Selenium_Programs;

public class ConstOverload {
	
	ConstOverload(int a)
	{
		System.out.println(a);
	}
	
	ConstOverload(int a, int b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	ConstOverload(int a, float b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {

		ConstOverload c = new ConstOverload(30);
		ConstOverload c1 = new ConstOverload(30, 40);
		ConstOverload c2 = new ConstOverload(30, 45.5f);
		
	}

}
