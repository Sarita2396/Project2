package Selenim_Programs;

public class StarPattern {

	public static void main(String[] args) {

		int star=8;
		for(int i=1; i<=8; i++)
		{
			for(int j=1; j<=star; j++)
			{
				System.out.print(" " +"*");
			}
			
			star--;
			System.out.println();
		}
	}

}
