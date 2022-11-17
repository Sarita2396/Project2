package NewPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PrcticeProgram6 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
		WebElement num = driver.findElement(By.xpath("//input[@id='user-number']"));
		num.sendKeys("7865789745");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email_id']"));
		email.sendKeys("cdjCKscdK@gmail.com");
		
		WebElement sub = driver.findElement(By.xpath("//button[@id='irtct-acc-detail']"));
		sub.click();
		
		WebElement btn = driver.findElement(By.xpath("//button[@class='btn dropdown-toggle']"));

		Actions a = new Actions(driver);
		a.moveToElement(btn).click().build().perform();
		for(int i=0; i<4; i++)
		{
			a.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(1000);
		}
		a.sendKeys(Keys.ENTER).build().perform();
		driver.close();
	}

}
