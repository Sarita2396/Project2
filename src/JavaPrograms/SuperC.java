package JavaPrograms;

public class SuperC extends SuperP{
	
	int a =20;
	
	public void dis()
	{
		int a =50;
		System.out.println(super.a);
		System.out.println(a);
		System.out.println(b);
		System.out.println(this.a);
	}

	public static void main(String[] args) {

		SuperC obj = new SuperC();
		obj.dis();
		
	}

}
