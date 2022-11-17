package Selenim_Programs;

import java.util.TreeSet;
//Homogeneous in nature, duplicate elements are not allowed
//In whichever order you insert the elements it will by default sort them
public class Treeset_Program {

	public static void main(String[] args) {

		TreeSet t1 = new TreeSet();
		
		t1.add(20);
		//t1.add(20);
		t1.add(10);
		t1.add(70);
		t1.add(5);
		System.out.println(t1);
		
		t1.remove(5);
		System.out.println(t1);
	}

}
