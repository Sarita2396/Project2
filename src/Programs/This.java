package Programs;

public class This {
	
	int a =10;
	 
	public void call()
	{
		int b=30, a=50;
		System.out.println(b);
		System.out.println(a);
		System.out.println(this.a);
	}

	public static void main(String[] args) {

		This t = new This();
		t.call();
	}

}
