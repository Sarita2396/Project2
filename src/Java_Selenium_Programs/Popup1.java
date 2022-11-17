package Java_Selenium_Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium26Feb\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		WebElement var1 = driver.findElement(By.xpath("//a[@class='signin']"));
		var1.click();
		Thread.sleep(2000);
		WebElement var2 = driver.findElement(By.xpath("//input[@type='submit']"));
		var2.click();
		Alert a = driver.switchTo().alert();
		a.accept();
		driver.close();
	}

}
