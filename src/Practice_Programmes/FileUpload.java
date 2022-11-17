package Practice_Programmes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("wedriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		WebElement upload = driver.findElement(By.xpath("//input[@type='file']"));
		upload.sendKeys("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\src\\Practice_Programmes\\newFile");
		WebElement press = driver.findElement(By.xpath("//input[@type='submit']"));
		Thread.sleep(2000);
		press.click();
		driver.close();
	}

}
