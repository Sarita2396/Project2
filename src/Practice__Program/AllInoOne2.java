package Practice__Program;

public class AllInoOne2 {

	int a,b;
	public AllInoOne2(int a, int b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	public AllInoOne2()
	{
		int c=90;
		System.out.println(c);
	}
	

	public static void main(String[] args) {
		
		AllInoOne2 o = new AllInoOne2(10,20);
		AllInoOne2 o1 = new AllInoOne2();
		
	}

}
