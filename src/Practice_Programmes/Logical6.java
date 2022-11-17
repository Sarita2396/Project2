package Practice_Programmes;

import java.util.ArrayList;
import java.util.Collections;

public class Logical6 {

	public static void main(String[] args) {

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
		Collections.sort(a1);
		System.out.println("Asecnding " +a1);
		Collections.sort(a1, Collections.reverseOrder());
		System.out.println("Desending" +a1);
	}

}
