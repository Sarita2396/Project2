package Selenim_Programs;

import java.util.HashSet;

public class Hashset_Program {

	public static void main(String[] args) {

		//HashSet H1 = new HashSet();
				HashSet<Integer> h1 = new HashSet<Integer>();
				
				h1.add(12);
				h1.add(13);
				h1.add(14);
				h1.add(15);
				System.out.println(h1);
				
				HashSet<Integer> h2 = new HashSet<Integer>();
				
				h2.addAll(h1);
				System.out.println(h2);
				h2.add(56);
				System.out.println(h2);
				
				System.out.println(h2.contains(14));
				System.out.println(h2.isEmpty());
				h2.removeAll(h1);
				System.out.println(h2);
				
				HashSet<Integer> h3 = new HashSet<Integer>();

				h3.add(12);
				h3.add(13);
				h3.add(14);
				h3.add(15);
				h3.add(16);
				System.out.println(h3);
				
				HashSet<Integer> h4 = new HashSet<Integer>();

				h4.add(13);
				h4.add(14);
				h4.add(15);
				System.out.println(h4);
				
				//union it will remove common elements between two sets
				h3.addAll(h4);
				System.out.println("union" +h3);
				
				//intersection it will give you common elements between two sets
				
				h3.retainAll(h4);
				System.out.println(h3);
				
				
				
	}

}
