package Practice_Programmes;

import java.util.Arrays;

public class Logical2 {

	public static void main(String[] args) {
		
		String a[] = {"S", "A", "R", "I", "T", "A"};
		
		for(int i=5; i>=0; i--)
		{
			Arrays.sort(a);
			System.out.println(a[i]);
		}
	}

}
