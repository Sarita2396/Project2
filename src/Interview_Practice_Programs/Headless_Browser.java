package Interview_Practice_Programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_Browser {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions p = new ChromeOptions();
		p.addArguments("headless");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(p);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("gmai");
		Thread.sleep(2000);
	   List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
	   
	   for(int i =0;i<list.size();i++)
	   {
		   System.out.println(list.get(i).getText());
	   }
	   
	   for(int i =0;i<list.size();i++)
	   {
		   String expectedResult="gmail create";
		   String actualResult = list.get(i).getText();
		   
		   if(expectedResult.equals(actualResult))
		   {
			  Thread.sleep(2000);
			   list.get(i).click();
			   break;
		   }
	   }

		driver.close();
	}

}
