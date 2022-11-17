package Practice__Program;

import java.util.Arrays;

public class arrayProgram {

	public static void main(String[] args) {
 
		int a[] = new int[3];
		a[0] = 20;
		a[1] =10;
		a[2] =5;
		
		for(int i=0; i<=2; i++)
		{
			Arrays.sort(a);
			System.out.println(a[i]);

		}
	}

}
