package Practice_Programmes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("wedriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame("iframeResult");
		WebElement listBox = driver.findElement(By.xpath("//select[@name='cars']"));
		Select s = new Select(listBox);
		s.selectByVisibleText("Volvo");
		s.selectByVisibleText("Audi");
		Thread.sleep(2000);
		System.out.println(s.isMultiple());
		List <WebElement> options = s.getOptions();
		
		for(int i=0; i<options.size(); i++)
		{
			System.out.println(options.get(i).getText());
			Thread.sleep(2000);
		}
		
		driver.close();
	}

}
