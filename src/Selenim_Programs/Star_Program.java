package Selenim_Programs;

public class Star_Program {

	public static void main(String[] args) {

		int star = 1; int space = 4;
		for(int row=5; row>=1; row--)
		{
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			
			for(int i=0; i<=space; i++)
			{
				System.out.print(" ");
			}
			System.out.println();
			star++;
			space--;
		}
	}

}
