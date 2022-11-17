package Selenim_Programs;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist_Program {
	
	//default size is 10

	public static void main(String[] args) {

		//insertion order is preserved & duplicate data is allowed
		ArrayList a1 = new ArrayList();
		ArrayList a2 = new ArrayList();
		ArrayList a3 = new ArrayList();
		

		//ArrayList<Integer> a2 = new ArrayList<Integer>();
		
		//Add Elements to the arraylist
		a1.add(16);
		a1.add("sarita");
		a1.add(15.5);
		a1.add('S');
		a1.add(true);
		System.out.println(a1);
		System.out.println("arraylist size: " +a1.size());
		a1.remove(3);
		a1.remove("sarita");
		System.out.println("after removing element" +a1);//still insertion order is preserved
		a1.add(2, 'A');  //to add the elements in between arraylist
		a1.add(3, "Hi");
		System.out.println("after adding elements using index" +a1);
		
		//get() to retrive specific element
		System.out.println(a1.get(2));	
		
		//set() to change/replace element
		a1.set(2, 'S');
		System.out.println("Afetr replacing with new element" +a1);
		
		//searching element in the arraylist
		System.out.println(a1.contains('A'));
		System.out.println(a1.contains(15.5));
		
		//to check arraylist is empty or not
		System.out.println(a1.isEmpty());
		System.out.println("reading elements using for loop");
		
		for(int i=0; i<a1.size(); i++)
		{
			System.out.println(a1.get(i));
		}
		
		System.out.println("reading elements using for each loop");
		
		for(Object a : a1)
		{
			System.out.println(a);
		}
		
		a2.addAll(a1);
		System.out.println("after adding elements from a1 to a2" +a2);
		
		a2.removeAll(a1);
		System.out.println("afetr removing elements from a2 " +a2);
		
		//sort an arraylist
		System.out.println("elements in the arraylist " +a1);
		
		a3.add('Z');
		a3.add('W');
		a3.add('R');
		a3.add('P');
		a3.add('A');
		Collections.sort(a3);
		System.out.println("Elements after sorting" +a3);
		
		Collections.sort(a3, Collections.reverseOrder());
		System.out.println("elements in the reverse order" +a3);
		
		Collections.shuffle(a3);
		System.out.println("after shuffling elements" +a3);
			
	}

}
