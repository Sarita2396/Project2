package Overall_Practice_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_Listbox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/signup/register");
		
		WebElement var = driver.findElement(By.xpath("//input[@name='emailid']"));
		System.out.println("isDisplayed = " +var.isDisplayed());
		System.out.println("isEnabled = " +var.isEnabled());
		System.out.println("isSelected = " +var.isSelected());
		WebElement var1 = driver.findElement(By.xpath("//input[@value='f']"));
		var1.click();
		System.out.println("isSelected = " +var1.isSelected());
		
		WebElement date_Day = driver.findElement(By.xpath("//select[@name='date_day']"));
		Select s = new Select(date_Day);
		s.selectByVisibleText("01");
		
		WebElement date_mon = driver.findElement(By.xpath("//select[@name='date_mon']"));
		Select r = new Select(date_mon);
		r.selectByVisibleText("JUL");
		
		WebElement Date_Year = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		Select t = new Select(Date_Year);
		t.selectByVisibleText("1996");
		
		System.out.println("isMultiple" +t.isMultiple());
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
