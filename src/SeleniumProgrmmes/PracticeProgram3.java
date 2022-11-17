package SeleniumProgrmmes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeProgram3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement local = driver.findElement(By.xpath("//a[@href='/manager/html']"));
		local.click();
		driver.get("http://admin:admin@localhost:8080/manager/html");
		WebElement tarasa = driver.findElement(By.xpath("//a[@href='/Tarasa%20m%2DConnect/']"));
		tarasa.click();
		WebElement loginUsername = driver.findElement(By.xpath("//input[@name='username']"));
		loginUsername.sendKeys("admin");
		WebElement loginPassword = driver.findElement(By.xpath("//input[@name='password']"));
		loginPassword.sendKeys("123456");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.submit();
		Thread.sleep(2000);
	}

}
