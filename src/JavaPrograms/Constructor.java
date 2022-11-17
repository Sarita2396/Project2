package JavaPrograms;

public class Constructor {

	int x,y;
	public Constructor()
	{
		x=20; y=70; 
		System.out.println("This is constructor");
		System.out.println(x +" " +y);
	}
	
	public Constructor(int a)
	{
	      System.out.println(a);
	}
	
	public Constructor(int b, float c)
	{
		System.out.println(b +" " +c);
	}
	
	public static void main(String[] args) {
		
		Constructor con = new Constructor();
		
		Constructor con1 = new Constructor(10);
		
		Constructor con2 = new Constructor(30, 34.5f);
		
		
		
	}

	

}
