package Interview_Practice_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_AutoSugestion {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement searchTab = driver.findElement(By.xpath("//input[@name='q']"));
		searchTab.sendKeys("Seleni");
		Thread.sleep(2000);
		
		List <WebElement> autoSuggest = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		
		for(int i=0; i<autoSuggest.size();i++)
		{
			System.out.println(autoSuggest.get(i).getText());
		}
		
		for(int i=0; i<autoSuggest.size();i++)
		{
			String expctedResult = "selenium webdriver";
			String actualResult= autoSuggest.get(i).getText();
			
			if(expctedResult.equals(actualResult))
			{
				autoSuggest.get(i).click();
				break;
			}
		}
		System.out.println("Title " +driver.getTitle());
		Thread.sleep(2000);
		driver.close();
	}

}
