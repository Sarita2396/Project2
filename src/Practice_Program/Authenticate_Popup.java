package Practice_Program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticate_Popup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/digest_auth");
		driver.manage().window().maximize();
		
		//driver.get("https://the-internet.herokuapp.com/digest_auth");
		//  https://username:password@URL
		//  https://admin:admin@the-internet.herokuapp.com/digest_auth
		driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
		Thread.sleep(2000);
		driver.close();
	}

}
