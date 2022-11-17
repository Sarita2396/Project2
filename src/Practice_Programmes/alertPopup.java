package Practice_Programmes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertPopup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("wedriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement uName = driver.findElement(By.xpath("//input[@name='login']"));
		WebElement pass = driver.findElement(By.xpath("//input[@name='passwd']"));
		WebElement submit = driver.findElement(By.xpath("//input[@value='Sign in']"));
		submit.click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		a.accept();
		driver.close();
		
	}

}
