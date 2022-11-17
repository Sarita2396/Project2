package Multiple_Elements_Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Auto_Suggest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement searchbar = driver.findElement(By.xpath("//input[@name='q']"));
		searchbar.sendKeys("Seleni");
		
		Thread.sleep(2000);
		
		List<WebElement> autosuggest = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		for(int i=0; i<autosuggest.size();i++)
		{
			System.out.println(autosuggest.get(i).getText());
		}
		
		for(int i=0; i<autosuggest.size();i++)
		{
			String expected="selenium webdriver";
			
			String actual= autosuggest.get(i).getText();
			
			if(expected.equals(actual))
			{
				autosuggest.get(i).click();
				break;
			}
		}
		
		System.out.println("Desc title " +driver.getTitle());
		Thread.sleep(2000);
		driver.close();
	}
}
	



