package AllInOnePrograms;

public class JProgram3 {
	
	public JProgram3()
	{
		System.out.println("Hi");
	}
	
	public JProgram3(int a)
	{
		System.out.println(a);
		System.out.println("Hello");
	}
	
	public JProgram3(int b, float c)
	{
		System.out.println(b);
		System.out.println(c);
		System.out.println("Hello");
	}

	public static void main(String[] args) {

		JProgram3 j = new JProgram3();
		JProgram3 j1 = new JProgram3(20);
		JProgram3 j2 = new JProgram3(40, 45.6f);
	}

}
