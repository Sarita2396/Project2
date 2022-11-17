package AllInOnePrograms;

public class New {

	public static void main(String[] args) {

		String str = "sarita";
		String str1 = "sarita";
		
		String str2 = new String("sayali");
		String str3 = new String("Sayali");
		
		System.out.println(str.concat(str1));
		System.out.println(str.equals(str1));
		System.out.println(str==str1);
		System.out.println(str2.equals(str3));
		System.out.println(str2==str3);
		
	}

}
