package Interview_Practice_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload_Download {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		WebElement fileUpload = driver.findElement(By.xpath("//input[@type = 'file']"));
		fileUpload.sendKeys("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\Excel\\Excel_Data.xlsx");
		Thread.sleep(2000);
		WebElement press = driver.findElement(By.xpath("//input[@type = 'submit']"));
		press.click();

	}

}
