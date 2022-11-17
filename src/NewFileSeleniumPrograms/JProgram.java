package NewFileSeleniumPrograms;

public class JProgram {

	public static void main(String[] args) {

		String str = "Sarita";
		String str1 ="Sayali";
		String str2 = new String("");
		
		System.out.println(str.equals(str1));
		System.out.println(str.concat(str1));
		System.out.println(str.length());
		System.out.println(str1.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.startsWith("Sa"));
		System.out.println(str1.endsWith("li"));
		System.out.println(str.charAt(3));
		System.out.println(str2.isEmpty());
		System.out.println(str.contains("rita"));
		System.out.println(str.indexOf("a"));
		System.out.println(str.lastIndexOf("a"));
		System.out.println(str2.replace(str2, "Mummy"));
		System.out.println(str.substring(2));
	}

}
