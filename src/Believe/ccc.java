package Believe;

public class ccc {

	public static void main(String[] args) {

		String str = "my name is sarita";
		int totalCount = str.length();
		int countAfterRemove = str.replace("a","").length();
		int count = totalCount-countAfterRemove;
		
		System.out.println("a = " + count);
		
		
	}

}
