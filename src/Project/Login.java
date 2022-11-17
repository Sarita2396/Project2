package Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		ChromeOptions o = new ChromeOptions();
		o.addArguments("--disable notification--");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement userName = driver.findElement(By.xpath("//input[@id='userid']"));
		userName.sendKeys("MHZ358");
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("Mangu71@05");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		WebElement pin = driver.findElement(By.xpath("//input[@id='pin']"));
		pin.sendKeys("140877");
		WebElement btn = driver.findElement(By.xpath("//button[@type='submit']"));
		btn.click();
		
		WebElement customerDetails = driver.findElement(By.xpath("//div[@class='avatar']"));
		customerDetails.click();
		Thread.sleep(2000);
		WebElement invest = driver.findElement(By.xpath("//button[@class='button-blue']"));
		invest.click();
		Thread.sleep(1000);
		
		driver.close();
	}

}
