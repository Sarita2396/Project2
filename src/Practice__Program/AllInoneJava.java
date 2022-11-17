package Practice__Program;

public class AllInoneJava {
	
	
	int a=10;
	static int b=20;
	
	public void add()
	{
		a++;
		b++;
		int c=5;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public static void main(String[] args) 
	
	{
		
		AllInoneJava o = new AllInoneJava();
		o.add();
		o.add();
		AllInoneJava r = new AllInoneJava();
		r.add();
		
	}

}
