package Believe;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/index.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> row = driver.findElements(By.xpath("//div[@class='hmbseindicestable show']//ul"));
		List<WebElement> col = driver.findElements(By.xpath("//div[@class='hmbseindicestable show']//ul//li"));
		//IMP = driver.findElements(By.xpath(""));
		System.out.println(row.size());
		System.out.println(col.size());
		
		for(int i=0; i<row.size();i++)
		{
			System.out.println(row.get(i).getText());
		}
		
		driver.close();
		
	}

}
