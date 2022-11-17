package Interview_Practice_Programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base5 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium26Feb\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement var1 = driver.findElement(By.xpath("//input[@name='q']"));
		var1.sendKeys("Seleni");
		
		List<WebElement> var2 = driver.findElements(By.xpath(""));
		for(int i=0; i<var2.size();i++)
		{
			System.out.println(var2.get(i).getText());
		}
		
		for(int i=0; i<var2.size();i++)
		{
			String actualResult = var2.get(i).getText();
			String expectedResult = "Testing";
			
			if(actualResult.equalsIgnoreCase(expectedResult))
			{
				var2.get(i).click();
				break;
			}
		}
	}

}
