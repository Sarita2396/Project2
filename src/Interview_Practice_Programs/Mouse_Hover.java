package Interview_Practice_Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement hiddenPopup = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		hiddenPopup.click();
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		Actions a = new Actions(driver);
		a.moveToElement(login).build().perform();
		Thread.sleep(2000);
		WebElement giftCard = driver.findElement(By.xpath("//div[text()='Gift Cards']"));
		a.moveToElement(giftCard).click().build().perform();
		Thread.sleep(2000);
		//a.sendKeys(Keys.DOWN.ENTER).build().perform();
		Thread.sleep(2000);
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		//js.executeScript("window.scrollBy(0, 500)");
		//js.executeScript("arguments[0].window.scollIntoView();", "topStories");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		Thread.sleep(2000);
		driver.close();
		//JavaScriptExecutor js = ((JavaScriptExecutor)driver);
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		//js.executeScript("arguments[0].window.scrollIntoView();","Element");
	}

}
