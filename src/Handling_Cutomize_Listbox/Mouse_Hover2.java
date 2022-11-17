package Handling_Cutomize_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.americangolf.com/");
		driver.manage().window().maximize();
		
		/*WebElement aboutUsLink = driver.findElement(By.xpath("//a[text()='About Us']"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(aboutUsLink).build().perform();
		
		WebElement careerLink = driver.findElement(By.xpath("//li[@class='leaf']//a[text()='Careers']"));
		careerLink.click();
		driver.close(); */
		
		driver.get("https://www.amazon.in/");
		
		WebElement primeLink = driver.findElement(By.xpath("//span[text()='Prime']"));
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		a.moveToElement(primeLink).build().perform(); //Don't perform click here just hover on PrimeDropDown
		Thread.sleep(2000);
		WebElement joinPrime = driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
		joinPrime.click();
		driver.close();
	}

}
