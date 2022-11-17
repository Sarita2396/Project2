package NewPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeProgram3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		WebElement f1 = driver.findElement(By.xpath("//input[@type='file']"));
		f1.sendKeys("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\src\\NewPrograms\\file");
		WebElement f2 = driver.findElement(By.xpath("//input[@type='submit']"));
		f2.submit();
		Thread.sleep(1000);
		driver.close();
	}

}
