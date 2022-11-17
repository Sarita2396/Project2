package Practice_Program;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		WebElement var = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		var.click();
		WebElement var2 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		var2.click();
		Thread.sleep(2000);
		Alert pop = driver.switchTo().alert();
		String var3 = pop.getText();
        pop.sendKeys("Hi it's sarita");
        System.out.println(var3);
		pop.accept();
		WebElement var4 = driver.findElement(By.xpath("//p[@id='demo1']"));
		System.out.println(var4.getText());
		driver.close();
	}

}
