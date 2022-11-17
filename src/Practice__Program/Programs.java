package Practice__Program;

public class Programs {
	
	public void add(int a, int b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	public void add(int c, float d)
	{
		System.out.println(c);
		System.out.println(d);
	}

	public static void main(String[] args) {
		
		Programs p = new Programs();
		p.add(10, 20);
		p.add(30, 40.5f);

	}

}
