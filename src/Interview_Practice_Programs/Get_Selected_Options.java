package Interview_Practice_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Get_Selected_Options {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome,driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().frame("iframeResult");
		WebElement car = driver.findElement(By.xpath("//select[@name = 'cars']"));
		Select s = new Select(car);
		System.out.println(s.isMultiple());
		s.selectByValue("volvo");
		s.selectByVisibleText("Opel");
		s.selectByIndex(3);
		s.selectByVisibleText("Saab");
		Thread.sleep(2000);
		//s.deselectByIndex(3);
		List <WebElement> options = s.getAllSelectedOptions();
		
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		driver.close();
	}

}
