package Selenim_Programs;
//    *
//   ***
//  ******
// ********
//**********
// ********
//  ******
//   ***
//    *

public class newstar {

	public static void main(String[] args) {

		int star=0;
		
		for(int i=0; i<=9; i++)
		{
			for(int space=7; space>=0; space--)
			{
			
				System.out.print(" ");
			}
		
		for(int j=0; j<=star; j++)
		{
			System.out.print("*");
		}
		
		star++;
		System.out.println();
		}
	}

}
