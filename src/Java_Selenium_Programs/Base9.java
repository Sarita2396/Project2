package Java_Selenium_Programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base9 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/index.html");
		List<WebElement> var = driver.findElements(By.xpath("//div[@class='hmbseindicestable show']//ul"));
		List<WebElement> var1 = driver.findElements(By.xpath("//div[@class='hmbseindicestable show']//ul[1]//li"));

		System.out.println(var.size());
		System.out.println(var1.size());
		
		for(int i=0; i<var.size();i++)
		{
			Thread.sleep(2000);
			System.out.println(var.get(i).getText());
		}
		
		driver.close();
	}

}
