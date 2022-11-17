package SeleniumProgrmmes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame1);
		WebElement img1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement img2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement img3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement img4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(img1, trash).build().perform();
		a.dragAndDrop(img2, trash).build().perform();
		a.dragAndDrop(img3, trash).build().perform();
		a.dragAndDrop(img4, trash).build().perform();
		Thread.sleep(3000);
		driver.close();
	}

}
