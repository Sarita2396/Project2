package Java_Selenium_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base4 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium26Feb\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		WebElement upload = driver.findElement(By.xpath("//input[@type='file']"));
		upload.sendKeys("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\Excel\\New Text Document (4).txt");
		Thread.sleep(2000);
		
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		Thread.sleep(2000);

		driver.close();
	}

}
