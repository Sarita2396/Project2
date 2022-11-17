package Overall_Practice_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements_Methods {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/signup/register");
		
		WebElement var2 = driver.findElement(By.xpath("//div[text()='Your Full name']"));
		System.out.println(var2.getText());
		
		WebElement var = driver.findElement(By.xpath("//input[@name='fullname']"));
		var.sendKeys("Sarita Machutre");
		
		WebElement var1 = driver.findElement(By.xpath("//input[@value='f']"));
		var1.click();
		
		WebElement var3 = driver.findElement(By.xpath("//input[@name='emailid']"));
		System.out.println(var3.getAttribute("type"));
		
		WebElement var4 = driver.findElement(By.xpath("//input[@name='city']"));
		System.out.println(var4.getAttribute("name"));
		

		Thread.sleep(2000);
		driver.close();
	}

}
