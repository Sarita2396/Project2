package Compatability_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Opera_Mini {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.opera.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\operadriver.exe");
		WebDriver driver = new OperaDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
	}

}
