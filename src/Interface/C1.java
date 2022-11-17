package Interface;
//different entity = implements
//similar entity = class
//Child can access the properties of both super class at a same time
public class C1 implements P1, P2{

	@Override
	public void add() 
	{
		
		System.out.println("add");
	}

	@Override
	public void sub() 
	{
		System.out.println("sub");
	}

	@Override
	public void call() 
	{
		System.out.println("call");
	}

}
