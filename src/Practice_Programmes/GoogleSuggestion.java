package Practice_Programmes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSuggestion {

	public static void main(String[] args) {

		System.setProperty("wedriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("Testi");
		List<WebElement> sugg = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		for(int i=0; i<sugg.size(); i++)
		{
			System.out.println(sugg.get(i).getText());
		}
		
		for(int i=0; i<sugg.size(); i++)
		{
			String expectedResult = "testicles";
			String actualResult = sugg.get(i).getText();
			if(expectedResult.equalsIgnoreCase(actualResult))
			{
				sugg.get(i).click();
				break;
			}
		}
		
		driver.close();
		
	}

}
