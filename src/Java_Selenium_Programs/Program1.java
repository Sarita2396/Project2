package Java_Selenium_Programs;

public class Program1{
	
	int a;
	int b;
	public Program1(int c)
	{
		a=40; b=90;
		System.out.println(c);
	}
	
	public void call()
	{
		System.out.println(+a +" " +b);
	}
	
	public static void main(String[] args)
	{
		Program1 obj = new Program1(60);
		obj.call();
	}


}
