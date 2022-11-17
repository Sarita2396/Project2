package Selenim_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frame {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		WebElement value = driver.findElement(By.xpath("//select[@name='cars']"));
		
       Select s = new Select(value);
		
		System.out.println(s.isMultiple());
		
		s.selectByVisibleText("Volvo");
		s.selectByVisibleText("Saab");
		s.deselectByVisibleText("Volvo");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		WebElement value1 = driver.findElement(By.xpath("//a[@id='tryhome']"));
		value1.click();
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
