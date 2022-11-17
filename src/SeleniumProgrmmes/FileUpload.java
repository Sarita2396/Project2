package SeleniumProgrmmes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement var = driver.findElement(By.xpath("//input[@type='file']"));
		var.sendKeys("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\src\\SeleniumProgrmmes\\MyInfo.txt");
		WebElement var1 = driver.findElement(By.xpath("//input[@type='submit']"));
		var1.click();
		Thread.sleep(3000);
		driver.close();
	}

}
