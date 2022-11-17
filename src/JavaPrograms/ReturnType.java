package JavaPrograms;

public class ReturnType {
	
	int a=10,b=20,mul,add;
	
	public int call()
	{
		return mul=a*b;
	}
	
	public String display(String name)
	{
		return name;
	}
	
	public int add()
	{
		return add = a+b;
		
	}

	public static void main(String[] args) {

		ReturnType obj = new ReturnType();
		int var = obj.call();
		System.out.println(var);
		
		String var2 = obj.display("Sarita");
		System.out.println(var2);
		
		int var3 = obj.add();
		System.out.println(var3);
		
	}

}
