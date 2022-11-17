package JavaPrograms;

public class NestedIf {

	public static void main(String[] args) {

		String id = "Velocity";
		String pass = "Admin@123";
		
		if(id=="Velocity")
		{
			if(pass=="Admin@123")
			{
			System.out.println("Login successful");	
			}
			else
			{
				System.out.println("pass incorrect");
			}
		}
		else
		{
			System.out.println("invalid id");
		}
	}

}
