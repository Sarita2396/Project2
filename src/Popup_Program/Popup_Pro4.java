package Popup_Program;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_Pro4 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.chorme.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement var = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		var.click();
		WebElement var1 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		var1.click();
		Alert pop = driver.switchTo().alert();
		String var2 = pop.getText();
		pop.sendKeys("Hi sarita here");
		Thread.sleep(2000);
		System.out.println(var2);
		pop.accept();
		WebElement var3 = driver.findElement(By.xpath("//p[@id='demo1']"));
		System.out.println(var3.getText());
		Thread.sleep(2000);
		driver.close();
		
	}

}
