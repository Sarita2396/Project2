package AllInOnePrograms;

public class JProgram2 extends JProgram1{
	int a = 30;
	public void call()
	{
		super.call();
		System.out.println("Hello");
		System.out.println(super.a);
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		JProgram2 j = new JProgram2();
		j.call();

	}

}
