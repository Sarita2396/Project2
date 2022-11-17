package Selenim_Programs;

import java.util.LinkedList;

public class LinkedList_Program {

	public static void main(String[] args) {

		//nodefault size we can keep on add elements as many as we want it will keep on increasing
		//INSERTION ORDER IS PRESERVED
		//duplicate data is allowed
		LinkedList l1 = new LinkedList();
		//LinkedList <Integer> l1 = new LinkedList <Integer> ();
		
		l1.add('Z');
		l1.add(10);
		l1.add("saru");
		l1.add(12.4);
		l1.add(null);
		System.out.println("LinkedList elements" +l1);
		
		System.out.println(l1.size());
		//we cannot remove element by using value need to pass index
		l1.remove(0);
		System.out.println(l1);
		l1.add(2, "Akku");
		System.out.println("After inserting elements " +l1);
		
		System.out.println(l1.get(3));
		l1.set(4, "Hello");
		System.out.println(l1);
		
		System.out.println(l1.contains("saru"));
		
		l1.addFirst("mangu");
		l1.addLast(13);
		System.out.println(l1);
		l1.removeFirst();
		l1.removeLast();
		System.out.println(l1);
		
		
		
	}

}
