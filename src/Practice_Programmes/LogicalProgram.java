package Practice_Programmes;

import java.util.Arrays;

import net.bytebuddy.description.annotation.AnnotationValue.Sort;

public class LogicalProgram {

	public static void main(String[] args) {
		
		int a[] = new int[5];
		a[0] = 3;
		a[1] = 8;
		a[2] =1;
		a[3] =7;
		a[4] =6;
		for(int i=4; i>=0; i--)
		{
			Arrays.sort(a);
			System.out.println(a[i]);
		}
		
	}

}
