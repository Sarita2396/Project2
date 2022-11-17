package Handling_Cutomize_Listbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Base3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium26Feb\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//      WebElement login = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
//		login.click();
		WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		close.click();
		
		Actions a = new Actions(driver);
		
		WebElement mouseHover = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		a.moveToElement(mouseHover).build().perform();
		Thread.sleep(2000);
		
		WebElement value = driver.findElement(By.xpath("//div[text()='Gift Cards']"));
		value.click();
		Thread.sleep(3000);
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//a[text()='Contact Us']")));		
		Thread.sleep(3000);
		driver.close();
	}


}
