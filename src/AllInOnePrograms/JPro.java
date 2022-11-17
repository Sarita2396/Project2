package AllInOnePrograms;

public class JPro {
	
	public int add()
	{
		int a=20,b=40,sum;
		sum = a + b;
		return sum;
	}
	
	public static void main(String[] args) {
	
		JPro j = new JPro();
		int var = j.add();
		System.out.println(var);

	}
}

