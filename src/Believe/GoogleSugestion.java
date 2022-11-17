package Believe;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSugestion {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("automa");
		Thread.sleep(2000);
		List<WebElement> getOPtions = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		for(int i=0; i<getOPtions.size();i++)
		{
			System.out.println(getOPtions.get(i).getText());
		}
		
		for(int i=0; i<getOPtions.size();i++)
		{
		
			String actual = getOPtions.get(i).getText();
			String expected = "automation testing tools";
			
			if(actual.equalsIgnoreCase(expected))
			{
				getOPtions.get(i).click();
				break;
			}
			
			Thread.sleep(2000);
		}
		
		
		driver.close();
	}

}
