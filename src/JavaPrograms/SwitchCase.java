package JavaPrograms;

public class SwitchCase {

	public static void main(String[] args) {

		String day = "wednesday";
		
		switch(day)
		{
		case "Monday":
			System.out.println("monday");
			
		case "Tuesday":
			System.out.println("tuesday");
			break;
		case "thrusday":
			System.out.println("monday");
			
		case "friday":
			System.out.println("tuesday");
		default:
			System.out.println("weekend");	
			
		}
	}

}
