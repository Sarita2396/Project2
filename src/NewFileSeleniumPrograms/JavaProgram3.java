package NewFileSeleniumPrograms;

public class JavaProgram3 extends JavaProgram2{

	@Override
	public void call() {
		
		System.out.println("call");
		
	}

	@Override
	public void flat() {
		
		System.out.println("flat");
		
	}
	
  public static void main(String[] args) {
		
		
		JavaProgram3 j = new JavaProgram3();
		j.flat();
		j.call();
  }

}
