package Handling_Cutomize_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		
		driver.switchTo().frame(frame);

		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		
		WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(image1, trash).build().perform();
		a.dragAndDrop(image2, trash).build().perform();
		Thread.sleep(2000);
		driver.close();
				
	}

}
