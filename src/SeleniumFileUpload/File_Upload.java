package SeleniumFileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		WebElement uploadBtn = driver.findElement(By.xpath("//input[@type='file']"));
		
		uploadBtn.sendKeys("C:\\Users\\Admin\\Desktop\\New Text Document.txt");
		Thread.sleep(2000);
		WebElement pressBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		pressBtn.click();
	}

}
