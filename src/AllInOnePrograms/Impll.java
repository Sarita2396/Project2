package AllInOnePrograms;

public class Impll extends Abstract2{

	@Override
	public void dis() {

		System.out.println("Disss");
	}
	
	public static void main(String[] args)
	{
		Impll i = new Impll();
		i.call();
		i.dis();
	}

}
