package Believe;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class bbb {

	public static void main(String[] args) {

		String str = "My Name is Sarita";
		String[] words = str.split(" ");
		List<String> list = Arrays.asList(words);
		Collections.reverse(list);
		for(String word : words)
		{
			System.out.print(word+ " ");
		}
	}

}
