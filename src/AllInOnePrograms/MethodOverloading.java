package AllInOnePrograms;

public class MethodOverloading {

		public void add(int a)
		{
			System.out.println(a);
		}
		
		public void add(int b, float c)
		{
			System.out.println(b);
			System.out.println(c);
		}
		
		public void add(float d, int e)
		{
			System.out.println(d);
			System.out.println(e);
		}
		
		
		public static void main(String[] args) {
			
			MethodOverloading a = new MethodOverloading();
			a.add(90);
			a.add(40, 7.8f);
			a.add(30, 4.5f);
			
	}

}
