package Logical_Programs;

public class Star_space {

	public static void main(String[] args) {

		int space=1, star=1;
		for(int i=1; i<=10; i++)//row
		{

		 for(int j=1; j<=star; j++)//column j=star
		{
			 System.out.print("*");
		}
//		 for(int k=1; k<=space; k++) //k=space
//		 {
//			System.out.print(" "); 
//		 }
		 
		 System.out.println();
		 star++;
		// space++;
		}
	}

}
