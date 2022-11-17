package Selenim_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_Handling {

public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("Webdriver.chorme.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	
	
	
 }
}
