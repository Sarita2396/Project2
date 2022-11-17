package Practice_Programmes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Logical3 {

	public static void main(String[] args) {

String a[] = {"S", "A", "R", "I", "T", "A"};
		
		for(int i=0; i<a.length; i++)
		{
			Arrays.sort(a);
			System.out.println(a[i]);
		}
		
		ArrayList <String> a1 = new ArrayList <String>();
		a1.add("s");
		a1.add("a");
		a1.add("y");
		a1.add("a");
		a1.add("l");
		a1.add("i");
		System.out.println(a1);
		Collections.reverse(a1);
		System.out.println(a1);
		Collections.max(a1);
		System.out.println(a1);
	}

}
