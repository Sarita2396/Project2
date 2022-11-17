package Selenim_Programs;

import java.util.Vector;

public class Collection_Program2 {

	public static void main(String[] args) {

		Vector v1 = new Vector();
		
		v1.size();
		System.out.println(v1);
		System.out.println(v1.capacity());
		v1.add("Mummy");
		v1.add(23);
		v1.add("Sarita");
		v1.add(16);
		v1.add("Sir");
		v1.add(8);
		v1.add("sayali");
		v1.add(14);
		v1.add("ShivBro");
		v1.add(23);
		v1.add("ShivBro");
		
		System.out.println("Arraylist is = " +v1);
		System.out.println(v1.contains(16));
		System.out.println(v1.indexOf(14));
		System.out.println(v1.isEmpty());
		System.out.println(v1.remove(2));
		System.out.println(v1);
		System.out.println(v1.remove("ShivBro"));
		System.out.println(v1);
		v1.add(null);
		
		v1.addElement("Sau");
		
		System.out.println(v1);
		
		System.out.println("**********************************");
		
		v1.clear();
		
		for(int i=0; i<5; i++)
		{
			v1.add(i);
		}
		
		System.out.println(v1);

	}
		
		
	}

