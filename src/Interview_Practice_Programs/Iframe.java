package Interview_Practice_Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
//		driver.switchTo().frame("index"); //To switch to iframe  //int index, string name, string id
//		
//		driver.switchTo().parentFrame(); //To switch to child frame to immediate parent frame
//		
//		driver.switchTo().defaultContent(); // To come out from rame to the main page
		driver.switchTo().frame("iframeResult");
		
		WebElement car = driver.findElement(By.xpath("//select[@name = 'cars']"));
		Select s = new Select(car);
		s.selectByVisibleText("Volvo");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		WebElement home = driver.findElement(By.xpath("//a[@id = 'tryhome']"));
		home.click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
