package Practice__Program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class CollectionProgram {

	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();
		ArrayList a2 = new ArrayList();
		
		ArrayList <String> a = new ArrayList<String>();
		
		a1.add(20);
		a1.add(10);
		a1.add(40);
		a1.add(50);
		
		System.out.println(a1);
		System.out.println(a1.size());
		System.out.println(a1.isEmpty());
		System.out.println(a1);
		
		a1.addAll(a2);
		System.out.println(a2);
	   Collections.reverse(a1);
	   System.out.println(a1);
	   
	   Collections.reverse(a2);
	   System.out.println(a2);
	   
	   TreeSet t1 = new TreeSet();
	   t1.add(20);
		t1.add(10);
		t1.add(30);
		t1.add(50);
		t1.add(5);
		System.out.println(t1);
		
	}

}
