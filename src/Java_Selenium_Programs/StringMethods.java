package Java_Selenium_Programs;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {

		int a[] = new int[10];
		a[0]=2;
		a[1]=3;
		a[2]=9;
		a[3]=8;
		a[4]=9;
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		Arrays.sort(a);
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		for(int i=0; i<5; i++)
		{
			
		}
		
		int i=5;
		while(i<=5)
		{
			System.out.println();
			i++;
		}
		
		int j=5;
		do
		{
			System.out.println();
			i++;
		}while(i<=5);
		
	}
	
	
	int i=5;
	do
	{
		System.out.println();
		i++;
	}while(i<=5);

}
