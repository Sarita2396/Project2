package Programs;

public class Star {

	public static void main(String[] args) {

		int star=1;
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			star++;
			System.out.println();
		}
	}
	
}
