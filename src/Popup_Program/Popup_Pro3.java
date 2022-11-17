package Popup_Program;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_Pro3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.chorme.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://demo.automationtesting.in/Alerts.html");
		WebElement var = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		var.click();
		WebElement var1 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		var1.click();
		Alert pop = driver.switchTo().alert();
		String var2 = pop.getText();
		System.out.println(var2);
		pop.accept();
        Thread.sleep(3000);
        driver.close();
	}

}
