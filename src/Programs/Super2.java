package Programs;

public class Super2 extends super1{
	
	public void call()
	{
		super.call();
		System.out.println("hiiii");
	}


	public static void main(String[] args) {

		Super2 s1 = new Super2();
		s1.call();
		
	}

}
