package JavaPrograms;

public class NonStaticVar {

	//global allocates different memory for different object hence it's not increased
	/*static memory common for each object hence it's increased & static allocates
	   memory once throughout the class..hence it used for memory management*/
	static int c =40;
	int b=20;
	public void call()
	{
		int a=10;
		a++;
		b++;
		c++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public static void main(String[] args) {

		NonStaticVar a = new NonStaticVar();
		a.call();
		
		NonStaticVar b = new NonStaticVar();
		b.call();
		
		NonStaticVar c = new NonStaticVar();
		c.call();
	}

}
