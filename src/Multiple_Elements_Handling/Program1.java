package Multiple_Elements_Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println("Title = " +driver.getTitle());
		List<WebElement> var = driver.findElements(By.xpath("//a"));
		
		System.out.println("Link count = " +var.size());
		
		for(int i=0;i<var.size();i++)
		{
			System.out.println(var.get(i).getText());
		}
		
		for(int i=0;i<var.size();i++)
		{
			String expected="Gmail";
			String actual= var.get(i).getText();
			
			if(expected.equals(actual))
			{
				var.get(i).click();
				break;
			}
		}
		
		Thread.sleep(5000);
		System.out.println("title = " +driver.getTitle());
		driver.close();
	}

}
