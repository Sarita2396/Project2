package SeleniumProgrmmes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlindCutomizeListBox {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement var = driver.findElement(By.xpath(""));
		
		Actions a = new Actions(driver);
		a.moveToElement(var).click().build().perform();
		for(int i=1; i<4; i++)
		{
		      a.sendKeys(Keys.DOWN).build().perform();
		}
		a.sendKeys(Keys.ENTER).build().perform();
	}

}
