package Array_String;

public class String1 {

	public static void main(String[] args) {

		String str = "sarita machutre";
		String str1 = new String("SARITA");
		String str2 = "Sayali";
		String a = "abc";
		String b = "ABC";
		String c = "";
		
		System.out.println(str.concat(str1));
		System.out.println(str.equals(str1)); //compare values
		System.out.println(str==str1); //compare address
		System.out.println(str.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str.concat("Saru"));
		System.out.println(str.startsWith("saru"));
		System.out.println(str.endsWith("tre"));
		System.out.println(str.length());
		System.out.println(str.indexOf('e'));
		System.out.println(str2.lastIndexOf('h'));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(str.substring(8));
		System.out.println(str.contains("sar"));
		System.out.println(str.charAt(7));
		System.out.println(a.charAt(2));
		System.out.println(str.substring(7, 14));
		System.out.println(str.isEmpty());
		System.out.println(c.isEmpty());
		System.out.println(str.replace("sarita", "was"));
	}

}
