package Popup_Program;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_Pro2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.chorme.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://demo.automationtesting.in/Alerts.html");
		WebElement pop = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		pop.click();
		Alert var = driver.switchTo().alert();
		String variable = var.getText();
		System.out.println(variable);
		var.accept(); //Ok
		//var.dismiss(); //Cancel
		Thread.sleep(2000);
		driver.close();
		
	}

}
