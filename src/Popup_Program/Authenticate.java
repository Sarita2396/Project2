package Popup_Program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticate {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/digest_auth");
		driver.manage().window().maximize();
		
		//   https://username:password@URL
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
		Thread.sleep(2000);
		
		driver.close();
	}

}
