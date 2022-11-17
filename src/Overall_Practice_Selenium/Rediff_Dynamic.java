package Overall_Practice_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_Dynamic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		
		WebElement fullName = driver.findElement(By.xpath("//input[@maxlength='61']"));
		fullName.sendKeys("sarita machutre");
		WebElement rediffMail = driver.findElement(By.xpath("//input[@maxlength='30']"));
		rediffMail.sendKeys("Sarita@gmail.com");
		WebElement checkBTN = driver.findElement(By.xpath("//input[@name='btnchkavaila043fbc9']"));
		checkBTN.click();
		WebElement password = driver.findElement(By.xpath("//input[@name='passwda043fbc9']"));
		password.sendKeys("Sarita@123");
		WebElement rePassword = driver.findElement(By.xpath("//input[@name='confirm_passwda043fbc9']"));
		rePassword.sendKeys("Sarita@123");
//		WebElement alterEmail = driver.findElement(By.xpath(""));
//		WebElement mob = driver.findElement(By.xpath(""));
//		WebElement dob = driver.findElement(By.xpath(""));
//		WebElement gender = driver.findElement(By.xpath(""));
//		WebElement countrySelect = driver.findElement(By.xpath(""));
//		WebElement citySelect = driver.findElement(By.xpath(""));
//		WebElement captcha = driver.findElement(By.xpath(""));
//		WebElement createBtn = driver.findElement(By.xpath(""));

	
	}

}
