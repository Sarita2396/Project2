package Believe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKartMouseHover {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		WebElement hiddenPop = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		hiddenPop.click();
		WebElement login = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(login).build().perform();
		Thread.sleep(2000);
		
		WebElement giftCart = driver.findElement(By.xpath("//div[text()='Gift Cards']"));
		a.moveToElement(giftCart).click().build().perform();
		Thread.sleep(2000);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		//js.executeScript("window.scrollTo(0, document.body.ScrollHeight)");
		js.executeScript("arguments[0].window.scrollIntoView();", driver.findElement(By.xpath("//a[text()='Contact Us']")));
		Thread.sleep(2000);

		driver.close();
		
	}

}
