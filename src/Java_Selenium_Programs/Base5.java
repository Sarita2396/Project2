package Java_Selenium_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base5 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium26Feb\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().frame("iframeResult");
		WebElement var1 = driver.findElement(By.xpath("//select[@name='cars']"));
		
		Select s = new Select(var1);
		System.out.println(s.isMultiple());
		
		List <WebElement> options = s.getOptions();
		
		for(int i=0; i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		driver.close();
	}

}
