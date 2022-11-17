package NewFileSeleniumPrograms;

public class LogicalPrograms {

	public static void main(String[] args) {

		//star
		int star=1, space=9;
		for(int i=1; i<=10; i++)
		{
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			for(int k=1; k<=space; k++)
			{
				System.out.print(" ");
			}
			System.out.println();
			star++;
			space--;
		}
		
	}

}
