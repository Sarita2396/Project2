package P_Program;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practice_Programmes {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement w1 = driver.findElement(By.xpath("//input[@id='user-number']"));
		w1.sendKeys("7873274246");
		WebElement w2 = driver.findElement(By.xpath("//input[@id='email_id']"));
		w2.sendKeys("sjdsjdjdsjdjsdjjdsdskskskdsk@gmail.com");
		WebElement w3 = driver.findElement(By.xpath("//button[@id='irtct-acc-detail']"));
		w3.click();
		WebElement a = driver.findElement(By.xpath("//button[normalize-space(text())='What is your pet name?']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(a).click().build().perform();
		for(int i=0; i<4; i++)
		{
			a1.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(2000);
		}
		
		a1.sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(1000);
		driver.close();

	}

}
