package Interview_Practice_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CompatabilityFireFox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.firefox.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/index.html");
		Thread.sleep(3000);
	}

}
