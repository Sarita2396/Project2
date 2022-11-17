package Overall_Practice_Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String actualurl= "https://www.amazon.in/";
		String currenturl= driver.getCurrentUrl();
		
		if(actualurl.equals(currenturl))
		{
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("test case fail");
		}
		System.out.println(driver.getTitle());
		String actualtitle= "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String currentitle= driver.getTitle();
		
		if(actualtitle.equals(currentitle))
		{
			System.out.println("Correct title");
		}
		else
		{
			System.out.println("Incorrect title");
		}
		
		driver.close();
	
	}

}
