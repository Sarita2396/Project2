package Handling_Cutomize_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement hiddenDivisionPopup = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		hiddenDivisionPopup.click();
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		Actions a = new Actions(driver);
		a.moveToElement(login).build().perform();
		Thread.sleep(2000);
		WebElement giftcard = driver.findElement(By.xpath("//div[text()='Gift Cards']"));
		a.moveToElement(giftcard).click().build().perform();
		for(int i=0;i<20;i++)
		{
			Thread.sleep(1000);
			a.sendKeys(Keys.ARROW_DOWN).build().perform();
			
			Thread.sleep(1000);
		}
		
		for(int i=0;i<20;i++)
		{
			Thread.sleep(1000);
			a.sendKeys(Keys.ARROW_UP).build().perform();
			
			Thread.sleep(1000);
		}
		
		
		driver.close();

	}

}
