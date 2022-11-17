package Selenim_Programs;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Cursor_Programs {

	public static void main(String[] args) {

		Vector v1 = new Vector();
		
		for(int i=0; i<10; i++)
		{

			v1.add(i);
		}
		System.out.println(v1);

	    //Cursor usage
		//Enumeration is interface
//		System.out.println("Enumeration cursor");
//		
//		Enumeration ref = v1.elements();
//		while(ref.hasMoreElements())
//		{
//			System.out.println(ref.nextElement());
//		}
//		
//		//Iterator Usage
//		System.out.println("Iterator cursor");
//	    Iterator ref1 = v1.iterator();
//	    while(ref1.hasNext())
//	    {
//	    	int num = (int) ref1.next();
//	    	if(num%2==0)
//	    	{
//	    		System.out.println(num);
//	    	}
//	    	else 
//	    	{
//	    		ref1.remove();
//	    	}
//
//	    }
//		
		//ListIterator Usage
	    System.out.println("ListIterator Cursor");
	    
	    ListIterator l1 = v1.listIterator();
	    while(l1.hasNext())
	    {
	    	int num = (int) l1.next();
	    	
	    	if(num==5)
	    	{

	    		l1.remove();
	    	}
	    	
//	    	else if(num==2)
//	    	{
//	    		l1.add(44);
//	    	}
	    	
	    	else if(num==3)
	    	{
	    		l1.set(99);
	    	}
	    	
	    	else if(num==2)
	    	{
	    		l1.remove();
	    	}
	    }
	    
	    System.out.println(v1);
	    
	}
}
