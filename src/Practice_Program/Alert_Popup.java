package Practice_Program;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.chorme.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://demo.automationtesting.in/Alerts.html");
		WebElement var = driver.findElement(By.xpath("//a[text()='Alert with OK ']"));
		var.click();
		WebElement var1 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		var1.click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		String v1 = alt.getText();
		System.out.println(v1);
		alt.accept();
		Thread.sleep(2000);
		driver.close();
	}

}
