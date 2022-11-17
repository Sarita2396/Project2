package NewFileSeleniumPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Arr {

	public static void main(String[] args) {

		ArrayList <String> a = new ArrayList<String>();
		a.add("s");
		a.add("a");
		a.add("r");
		a.add("u");
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		Collections.sort(a, Collections.reverseOrder());
		System.out.println(a);
		Collections.reverse(a);
		System.out.println(a);
		a.remove("u");
		System.out.println(a);
		
		int a1[] = new int[5];
		a1[0] = 6;
		a1[1] = 4;
		for(int i=0; i<2; i++)
		{
			System.out.println(a1[i]);
		}
		
		String s[] = {"Sarita", "Sayali"};
		
		for(int i=0; i<2; i++)
		{
			Arrays.sort(s);
			System.out.println(s[i]);
		}
	}

}
