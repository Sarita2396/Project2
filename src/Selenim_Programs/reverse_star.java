package Selenim_Programs;

public class reverse_star {

	public static void main(String[] args) {

		int star=10;
				
		System.out.println(" ");
		
		for(int i=1; i<=10; i++)
		{
			for(int j=1; j<=star; j++)
			{
				System.out.print(" " +"//*");
			}	
			star--;
			System.out.println();
		}
	}

}
