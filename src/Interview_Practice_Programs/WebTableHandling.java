package Interview_Practice_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/index.html");
		Thread.sleep(3000);
		
		List<WebElement> row = driver.findElements(By.xpath("//div[@class='hmbseindicestable show']//ul"));
		List<WebElement> column = driver.findElements(By.xpath("//div[@class='hmbseindicestable show']//ul[1]//li"));
		Thread.sleep(3000);
		System.out.println("row= " +row.size());
		System.out.println("column = " +column.size());
		
		for(int i=0; i<row.size(); i++)
		{
			System.out.println(row.get(i).getText());
		}
		
		for(int i=0; i<column.size(); i++)
		{
			System.out.println(column.get(i).getText());
		}
		driver.close();

	}
	

}
