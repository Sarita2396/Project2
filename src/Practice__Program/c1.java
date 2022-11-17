package Practice__Program;

public class c1 implements i2,i3{
	

	@Override
	public void add() {
System.out.println("add");		
	}

	@Override
	public void mul() {
System.out.println("mul");		
	}

	@Override
	public void div() {

		System.out.println("div");
	}
	
	@Override
	public void sub() {

		System.out.println("sub");
	}
	
     public static void main(String[] args) {

    	 c1 c = new c1();
    	 c.add();
    	 c.sub();
    	 c.mul();
    	 c.div();
	}


}
