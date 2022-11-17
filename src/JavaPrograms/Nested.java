package JavaPrograms;

public class Nested {

	public static void main(String[] args) {

		String pin ="12345";
		double accamt=2000;
		double withdrawl =3000;
		
		if(pin=="1234")
		{
			if(withdrawl<=accamt)
			{
			System.out.println("debit cash");	
			}
			else
			{
				System.out.println("insufficient amt");
			}
		}
		else
		{
			System.out.println("invalid id");
		}
	  }
	}

