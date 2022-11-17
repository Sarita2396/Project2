package Selenim_Programs;

import java.util.LinkedList;

public class Collection_Program3 {

	public static void main(String[] args) {

		LinkedList l1 = new LinkedList();
		
		
		for(int i=5; i>=0; i--)
		{
			l1.add(i);
		}
		
		System.out.println("List of elements are:" +l1);
		l1.add(0, "saru");
		l1.addFirst("sau");
		System.out.println(l1);
		l1.remove("sau");
		System.out.println(l1);
		l1.remove(3);
		System.out.println(l1);
		l1.contains(5);
		System.out.println(l1);
		System.out.println("l1 contains = " +l1);
		System.out.println("l1 contains = " +l1.isEmpty());
		l1.removeFirstOccurrence("saru");
		System.out.println(l1);
		l1.removeLastOccurrence(0);
		System.out.println(l1);

	}

}
