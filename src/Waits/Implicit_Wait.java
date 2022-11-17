package Waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Implicit_Wait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement var = driver.findElement(By.xpath("//button[@class='btn dropdown-toggle']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(var).click().build().perform();
		for(int i=0;i<7;i++)
		{
			//Thread.sleep(1000);
			a.sendKeys(Keys.DOWN).build().perform();
		}
		
		a.sendKeys(Keys.ENTER).build().perform();
		System.out.println(var.getText());
		//Thread.sleep(1000);
		driver.close();
	}

}
