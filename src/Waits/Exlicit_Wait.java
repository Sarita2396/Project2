package Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Exlicit_Wait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().window().maximize();
		
		/*WebElement var = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		var.click();
		WebDriverWait w = new WebDriverWait(driver, 120);
		w.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept(); */
		
		/* WebElement var2 = driver.findElement(By.xpath("//button[@id='populate-text']"));
		var2.click();
		WebElement var3 = driver.findElement(By.xpath("//h2[@id='h2']"));
		System.out.println(var2.getText());
		WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.textToBePresentInElement(var3, "Selenium Webdriver")); */
		
		/* WebElement v1 = driver.findElement(By.xpath("//button[@id='display-other-button']"));
		v1.click();
		WebElement v2 = driver.findElement(By.xpath("//button[@id='hidden']"));
		WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.visibilityOfAllElements(v2)); */
		
		WebElement a1 = driver.findElement(By.xpath("//button[@id='checkbox']"));
		a1.click();
		WebElement a2 = driver.findElement(By.xpath("//input[@id='ch']"));
		WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.elementToBeSelected(a2));
		driver.close();
	}

}
