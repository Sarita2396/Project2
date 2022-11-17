package JavaPrograms;

public class UpcastingImplements {

	public static void main(String[] args) {

//		UpcastingP p = new UpcastingC(); //Upcasting
//	    p.parent();
//	    
//	    UpcastingC c = (UpcastingC) new UpcastingP();
//	    
//	    c.child();
//	    c.parent(); //DownCasting
		
		UpcastingP p = new UpcastingC();
		p.parent();
		p.parent2();
	}

}
