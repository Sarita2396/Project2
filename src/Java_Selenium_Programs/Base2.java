package Java_Selenium_Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Base2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium26Feb\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement var = driver.findElement(By.xpath("//button[@data-toggle='dropdown']"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(var).click().build().perform();
		
		for(int i=1; i<6; i++)
		{
			Thread.sleep(2000);
			a.sendKeys(Keys.DOWN).build().perform();
		}
		   
		a.sendKeys(Keys.ENTER).build().perform();
		
		
		Thread.sleep(2000);
		
		driver.close();
		
		
	
	}

}
