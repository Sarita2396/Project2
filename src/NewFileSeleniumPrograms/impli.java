package NewFileSeleniumPrograms;

public class impli implements iter1, inter2{


	@Override
	public void no() {

		System.out.println("no");
	}

	@Override
	public void bye() {

		System.out.println("bye");
	}

	@Override
	public void call() {

		System.out.println("call");
	}

	@Override
	public void dis() {
		
		System.out.println("dis");
		
	}

	@Override
	public void hi() {
		
		System.out.println("hi");
		
	}
	
	public static void main(String[] args) {

		impli i = new impli();
		i.bye();
		i.call();
		i.dis();
		i.hi();
		
	}

}
