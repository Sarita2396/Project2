package Headless_Browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_Browser {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		ChromeOptions a = new ChromeOptions();
		a.addArguments("headless");
		WebDriver driver = new ChromeDriver(a);
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/index.html");
		List<WebElement> row = driver.findElements(By.xpath("//div[@class='hmbseindicestable show']//ul"));
		List<WebElement> column = driver.findElements(By.xpath("//div[@class='hmbseindicestable show']//ul[1]//li"));
		Thread.sleep(5000);
		System.out.println("row size = " +row.size());
		System.out.println("column size = " +column.size());
		for(int i=0; i<row.size();i++)
		{	
			System.out.println(row.get(i).getText());
			
		}
		driver.close();
		
	}

}

