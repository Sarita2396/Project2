package Polymorphism;

public class Method_OverLoading {
	
	public void add(int a)
	{
		System.out.println(a);
	}
	
	public void add(int b, float c)
	{
		System.out.println(b+c);
	}
	
	public void add(double a,double b, double c)
	{
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		
		Method_OverLoading obj = new Method_OverLoading();
		obj.add(10);
		obj.add(30, 40.6f);
		obj.add(345, 230, 987);

	}
	
}