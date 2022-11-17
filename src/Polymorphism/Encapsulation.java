package Polymorphism;

public class Encapsulation {
	
	private double sal=4000;
	
	public void get()
	{
		System.out.println(sal);
	}
	

	public static void main(String[] args) {

		Encapsulation e = new Encapsulation();
		e.get();
		
	}

}
