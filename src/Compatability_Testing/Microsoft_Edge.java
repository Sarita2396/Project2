package Compatability_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Microsoft_Edge {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\msedgedriver.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.amazon.in/");
		driver.close();
	}

}
