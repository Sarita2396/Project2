package Selenim_Programs;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashset_Program {
//insertion order is preserved and duplicate elements are not allowed
	public static void main(String[] args) {

		//HashSet H1 = new HashSet();
		LinkedHashSet<Integer> h1 = new LinkedHashSet<Integer>();
		
		h1.add(12);
		h1.add(13);
		h1.add(14);
		h1.add(15);
		System.out.println(h1);
		h1.add(10);
		System.out.println(h1);
		
		
		
		
		

	}

}
