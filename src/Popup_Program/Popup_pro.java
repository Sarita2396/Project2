package Popup_Program;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_pro {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.chorme.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement signInBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		signInBtn.click();
		Alert pop = driver.switchTo().alert();
		String value = pop.getText();
		System.out.println(value);
		pop.accept();
		Thread.sleep(2000);
		driver.close();

		
	}

}
