package Interview_Practice_Programs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		WebElement signIn = driver.findElement(By.xpath("//a[@class='signin']"));
		signIn.click();
		//WebElement signIn = driver.findElement(By.xpath("//a[@class='signin']"));
		WebElement signInBtn = driver.findElement(By.xpath("//input[@value='Sign in']"));
		signInBtn.click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		a.accept();
		Thread.sleep(2000);
		driver.close();
	}

}
