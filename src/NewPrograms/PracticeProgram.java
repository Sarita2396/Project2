package NewPrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeProgram {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement v1 = driver.findElement(By.xpath("//input[@type='text']"));
//		v1.sendKeys("a1");
//		WebElement v2 = driver.findElement(By.xpath("//input[@type='password']"));
//		v2.sendKeys("a2");
		WebElement v3 = driver.findElement(By.xpath("//input[@type='submit']"));
		v3.click();
		Alert a1 = driver.switchTo().alert();
		Thread.sleep(2000);
		a1.accept();
		driver.close();
	}

}
