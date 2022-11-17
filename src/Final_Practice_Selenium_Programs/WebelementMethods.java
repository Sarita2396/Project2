package Final_Practice_Selenium_Programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebelementMethods {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.rediff.com/signup/register");
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//		driver.findElement(By.tagName(""));
//		driver.findElement(By.id(""));
//		driver.findElement(By.className(""));
//		driver.findElement(By.name(""));
//		driver.findElement(By.linkText(null));
//		driver.findElement(By.partialLinkText(null));
//		driver.findElement(By.cssSelector(""));
//		WebElement fullname = driver.findElement(By.xpath("//input[@name='fullname']"));
//		WebElement label = driver.findElement(By.xpath("//div[text()='Your Full name']"));
//		WebElement select = driver.findElement(By.xpath("//select[@name='date_day']"));

		driver.switchTo().frame("iframeResult");
		WebElement var = driver.findElement(By.xpath("//select[@name = 'cars']"));

//		fullname.sendKeys("SARITA");
//		fullname.clear();
//		System.out.println(label.getText());
//		System.out.println(fullname.isDisplayed());
//		System.out.println(fullname.isEnabled());
//		System.out.println(fullname.isSelected());
//		System.out.println(select.isSelected());
//		
		Select s = new Select(var);
		System.out.println(s.isMultiple());
//		s.selectByIndex(1);
//		Thread.sleep(1000);
//		s.selectByVisibleText("Day");
//		Thread.sleep(1000);
//		s.selectByValue("04");
		//Thread.sleep(3000);
		
		s.selectByVisibleText("Volvo");
		s.selectByVisibleText("Saab");
		s.selectByVisibleText("Opel");
		s.selectByVisibleText("Audi");
		List <WebElement> options = s.getAllSelectedOptions();
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		driver.close();
		
	}

}
