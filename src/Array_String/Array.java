package Array_String;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		int a[] = new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=5;
		a[3]=6;
		a[4]=8;
		
		//System.out.println(a[4]);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		//Arrays.sort(a);
		
		System.out.println("Afetr sorting");
		for(int i=0; i<a.length;i++)
		{
			Arrays.sort(a);
			System.out.println(a[i]);
		}
		
		
		System.out.println("*****************");
		
		String str[] = {"abc", "def", "xyz"};
		System.out.println(str[2]);
	}

}
