package Selenim_Programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Hash_Map {

	//initial capacity-16
	//load factor-0.75
	//we cannot apply cursor on hashmap 
	public static void main(String[] args) {

		HashMap h1 = new HashMap();
		
		h1.put(2, "Saru");
		h1.put(4, "Sayalu");
		h1.put(5, "Mangu");
		h1.put(6, "Master");
		System.out.println(h1);
		h1.put(4, "Hello");
		System.out.println(h1);
		h1.put(2, "Shivbro");
		System.out.println(h1);
		System.out.println(h1.keySet());
		System.out.println(h1.values());
		System.out.println(h1.entrySet());
		
		System.out.println("\ncursor");
		Set s1 = h1.entrySet();
		Iterator itr = s1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}


	}

