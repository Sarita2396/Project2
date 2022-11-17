package Selenim_Programs;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program_2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.chorme.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://is.rediff.com/signup/register");
		Thread.sleep(2000);
		
		System.out.println("Title = " +driver.getTitle());

		driver.findElement(By.xpath("//input[@value= 'f']")).click();
		
		Thread.sleep(2000);
		
		WebElement Name = driver.findElement(By.xpath("//input[@name= 'fullname']"));
		Name.sendKeys("Sarita");
		Thread.sleep(2000);
		
		WebElement listDayBox = driver.findElement(By.xpath("//select[@name= 'date_day']"));
		
		Select s = new Select(listDayBox);
		
		List<WebElement> name = s.getOptions();
		
		for(int i=0; i<name.size(); i++)
		{
			System.out.println(name.get(i).getText());
		}
		
		WebElement yearListBox = driver.findElement(By.xpath("//select[@name= 'Date_Year']"));

		Select p = new Select(yearListBox);
		
		List<WebElement> display = p.getOptions();
		
		for(int i=0; i<display.size(); i++)
		{
			System.out.println(display.get(i).getText());
		}
		
		WebElement monthListBox = driver.findElement(By.xpath("//select[@name= 'date_mon']"));

		Select r = new Select(monthListBox);
		
		List<WebElement> call = r.getOptions();

		for(int i=0; i<call.size();i++)
	
		{
			System.out.println(call.get(i).getText());
		}
		
		
		driver.close();
		
	}

}
