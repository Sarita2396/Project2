package Selenim_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Program {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
			
			driver.manage().window().maximize();
			
			driver.switchTo().frame("globalSqa");
			
			WebElement v1 = driver.findElement(By.id("s"));
			v1.sendKeys("ebooks");
			WebElement v3 = driver.findElement(By.xpath("//button[@class='button_search']"));
			v3.click();
			Thread.sleep(3000);
			
			driver.switchTo().defaultContent();
			WebElement v2 = driver.findElement(By.id("s"));
			v2.sendKeys("ebooks");
			WebElement v4 = driver.findElement(By.xpath("//button[@class='button_search']"));
			v4.click();
			
			Thread.sleep(3000);
			driver.quit();
			
	}

}





