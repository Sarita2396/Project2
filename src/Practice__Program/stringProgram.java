package Practice__Program;

public class stringProgram {

	public static void main(String[] args) {
		
		String str = new String("saru");
		String str1 = new String("saru");
		
		String str2 ="saru";
		String str3 ="Saru";

		System.out.println(str==str1);
		System.out.println(str.equals(str1));
		
		System.out.println(str2==str3);
		System.out.println(str2.equals(str3));
		
		System.out.println(str.concat(str3));
		System.out.println(str.length());
		
		System.out.println(str2.equalsIgnoreCase(str3));
		System.out.println(str.startsWith("p"));
		System.out.println(str1.endsWith("u"));
		
		System.out.println(str.indexOf("u"));
		
		System.out.println(str.isEmpty());
		
		System.out.println(str1.contains("ru"));

	}

}
