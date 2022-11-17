package Java__Programs;

public class AllInOneLogical {

	public static void main(String[] args) {

		//Arm
		int no=371, sum=0, rem;
		int newNo=no;
		while(no!=0)
		{
			rem = no%10;
			sum = sum + rem*rem*rem;
			no=no/10;
			
		}
		
	}

}
