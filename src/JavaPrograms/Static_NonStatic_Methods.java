package JavaPrograms;

public class Static_NonStatic_Methods {

		static int c =40;
		int b=20;
		public void call()
		{
			int a=10;
			a++;
			b++;
			c++;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}

		public static void main(String[] args) {

			NonStaticVar a = new NonStaticVar();
			a.call();
			a.call();
			a.call();
		
		}

}
