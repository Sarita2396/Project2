package Selenim_Programs;

import java.util.LinkedList;
import java.util.Vector;
//legacy class & by default capacity is 10 
public class Vector_Program {

	public static void main(String[] args) {

		Vector v1 = new Vector();
		v1.addElement("Sarita");
		v1.add(16);
		v1.addElement('S');
		v1.add(12.6);
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
//		v1.removeAllElements();
//		System.out.println(v1);
		
	}

}
