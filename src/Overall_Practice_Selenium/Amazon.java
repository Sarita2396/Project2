package Overall_Practice_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement selectBtn = driver.findElement(By.xpath("//select[@name='url']"));
		selectBtn.click();
		Select s = new Select(selectBtn);
		s.selectByVisibleText("Beauty");
		System.out.println(s.isMultiple());
		WebElement searchTab = driver.findElement(By.xpath("//input[@type='submit']"));
		searchTab.click();
		WebElement hairCareLink = driver.findElement(By.xpath("//span[text()='Hair Care']"));
		hairCareLink.click();
		
		List<WebElement> getAllLinks = driver.findElements(By.xpath("//a"));
		
		System.out.println(getAllLinks.size());
		
		Thread.sleep(2000);
		
//		for(int i=0; i<getAllLinks.size();i++)
//		{
//			System.out.println(getAllLinks.get(i).getText());
//		}
//		Thread.sleep(2000);
		
		WebElement dropDown = driver.findElement(By.xpath("//span[@class='nav-icon nav-arrow']"));
		dropDown.click();
		
		WebElement radioMarathiBtn = driver.findElement(By.xpath("//input[@value='mr_IN']"));
		radioMarathiBtn.click();

		WebElement saveChanges = driver.findElement(By.xpath("//input[@class='a-button-input']"));
		saveChanges.click();
		Thread.sleep(2000);
		
		driver.close();
		
	}

}
