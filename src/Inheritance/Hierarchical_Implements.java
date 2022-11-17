package Inheritance;

public class Hierarchical_Implements {

	public static void main(String[] args) {

		HeirachicalC2 c2 = new HeirachicalC2();
		c2.mobile();
		c2.bunglow();
		c2.car();
		
		System.out.println("*********************");
		HirarchicalC1 c1 = new HirarchicalC1();
		c1.lappy();
		c1.bunglow();
		c1.car();
		
	}

}
