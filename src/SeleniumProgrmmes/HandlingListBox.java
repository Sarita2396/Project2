package SeleniumProgrmmes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().frame("iframeResult");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement select = driver.findElement(By.xpath("//select[@name='cars']"));
		Select s = new Select(select);
		s.selectByVisibleText("Volvo");
		s.selectByIndex(3);
		System.out.println(s.isMultiple());
//		s.deselectByValue("volvo");
		
		List <WebElement> options= s.getAllSelectedOptions();
		Thread.sleep(2000);
		for(int i=0; i<options.size(); i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
