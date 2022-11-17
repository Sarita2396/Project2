package Practice_Programmes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Logical4 {

	public static void main(String[] args) {

		ArrayList <Integer> a1 = new ArrayList <Integer>();
		a1.add(2);
		a1.add(5);
		a1.add(1);
		a1.add(9);
		a1.add(7);
		System.out.println(a1);
		Collections.reverse(a1);
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println("Ascending" +a1);
		Collections.sort(a1, Collections.reverseOrder());
		System.out.println("Desending" +a1);
		
	}
}


