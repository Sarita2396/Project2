package NewPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeProgram8 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("Selen");
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i).getText());
		}
		
		for(int i=0; i<list.size(); i++)
		{
			String expectedResult = "selena gomez age";
			String actualResult = list.get(i).getText();
			if(expectedResult.equals(actualResult))
			{
				list.get(i).click();
				break;
			}
		}
		
		
		driver.close();
	}

}
