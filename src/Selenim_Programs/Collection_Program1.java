package Selenim_Programs;

import java.util.ArrayList;

public class Collection_Program1 {

	public static void main(String[] args) {

		ArrayList a1 = new ArrayList();
		ArrayList a3 = new ArrayList(1000);
		ArrayList a2 = new ArrayList(a1);


		System.out.println(a1.size()); //by default value is 0
		System.out.println(a2.size());
		System.out.println(a3.size());
		a1.add("Mummy");
		a1.add(23);
		a1.add("Sarita");
		a1.add(16);
		a1.add("Sir");
		a1.add(8);
		a1.add("sayali");
		a1.add(14);
		a1.add("ShivBro");
		a1.add(23);
		a1.add("ShivBro");
		
		System.out.println("Arraylist is = " +a1);
		System.out.println(a1.contains(16));
		System.out.println(a1.indexOf(14));
		System.out.println(a1.isEmpty());
		System.out.println(a1.remove(2));
		System.out.println(a1);
		System.out.println(a1.remove("ShivBro"));
		System.out.println(a1);
		a1.add(null);
		System.out.println(a1);

	}

}
