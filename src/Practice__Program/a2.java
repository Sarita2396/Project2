package Practice__Program;

public class a2 extends a1{
	
	@Override
	public void sub() {

		System.out.println("sub");
	}

	public static void main(String[] args) {

		a2 o = new a2();
		o.add();
		o.sub();
	}



}
