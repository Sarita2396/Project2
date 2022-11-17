package Practice_Program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Permission_Popups {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
	}

}
