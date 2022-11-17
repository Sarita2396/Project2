package Believe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		WebElement signIn = driver.findElement(By.xpath("//a[@class='signin']"));
//		signIn.click();
//		Thread.sleep(2000);
		WebElement submit = driver.findElement(By.xpath("//input[@value='Sign in']"));
		submit.click();
		Alert a = driver.switchTo().alert();
		a.accept();
		Thread.sleep(2000);
		driver.close();
		
	}

}
