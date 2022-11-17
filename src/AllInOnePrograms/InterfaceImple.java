package AllInOnePrograms;

public class InterfaceImple implements I1, I2{

	@Override
	public void hi() {

		System.out.println("hi");
	}

	@Override
	public void hello() {
		System.out.println("hello");

	}

	@Override
	public void bye() {

		System.out.println("bye");

	}
	
	
	public static void main(String[] args) {
		
		InterfaceImple i = new InterfaceImple();
		i.hi();
		i.hello();
		i.bye();
	}

}
