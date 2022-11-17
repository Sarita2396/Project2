package Practice_Programmes;

import java.util.Arrays;

public class Logical1 {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		a[0] = 3;
		a[1] = 8;
		a[2] =1;
		a[3] =7;
		a[4] =6;
		
		for(int i=0; i<a.length; i++)
		{
			Arrays.sort(a);
			System.out.println(a[i]);
		}
		
		
	}

}
