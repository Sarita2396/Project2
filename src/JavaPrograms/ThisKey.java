package JavaPrograms;
 //this key pointing to the global version of the variable
public class ThisKey {
	int no=10;
	public ThisKey(int no)
	{
		System.out.println(this.no);
		System.out.println(no);
		
	}
	
	public void show(int no)
	{
	 System.out.println(this.no);
	  System.out.println(no);	
	}
	
	public void dis()
	{
		System.out.println(this.no);
	}

	public static void main(String[] args) {
		
		ThisKey a = new ThisKey(20);
		a.show(40);
		a.dis();
	}

}
