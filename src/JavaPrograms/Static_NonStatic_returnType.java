package JavaPrograms;

public class Static_NonStatic_returnType {
	
	public static int call()
	{
		return 10 + 20;
		
	}
	
	public String display()
	{
		return "Sarita";
	}

	public static void main(String[] args) {
		
		int var = Static_NonStatic_returnType.call();
		System.out.println(var);
		
		Static_NonStatic_returnType o = new Static_NonStatic_returnType();
		String var1 = o.display();
		System.out.println(var1);
		

	}

}
