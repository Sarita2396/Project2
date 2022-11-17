package Array_String;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {

//		int a[] = new int[5];
//		a[0]=1;
//		a[1]=2;
//		a[2]=5;
//		a[3]=6;
//		a[4]=8;
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter elements");
		size = sc.nextInt();
		System.out.println(size);
		int a[] = new int[size];
		
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(int i=0; i<size; i++)
		{
			System.out.println(a[i]);
		}
		

	}

}
