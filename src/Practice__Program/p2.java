package Practice__Program;

public class p2 extends p1{
	
	public void add()
	{
		super.add();
		System.out.println("add1");
	}

	public static void main(String[] args) {
		
		p1 p = new p2();
		p.add();

	}

}