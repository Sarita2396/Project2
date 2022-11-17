package JavaPrograms;

/*static variable - access in static as well in non static method & to call this we don't need to
create an object we can call it directly by the method name only. but when we use static variable
in non static method to call this variable we need to create an object*/

//non static variable - is access only in non static method & to call this we have to create an object.

public class StaticVar {
	static int d=60;
	int e =67;
	public static void call()
	{
//		int a=10,b=30;
//		int c = a + b;
//		System.out.println(c);
		
		int a=10;
		a++;
		d++;
		System.out.println(a);
		System.out.println(d);
	}

	public static void main(String[] args) {
		
		call();
	}

}
