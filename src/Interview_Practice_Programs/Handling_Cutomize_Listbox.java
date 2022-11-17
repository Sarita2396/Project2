package Interview_Practice_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Cutomize_Listbox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
		WebElement select = driver.findElement(By.xpath("//button[@class = 'btn dropdown-toggle']"));
		Actions a = new Actions(driver);
		a.moveToElement(select).click().build().perform();
		Thread.sleep(2000);
		for(int i=0;i<4;i++)
		{
			a.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(2000);
		}
		
		a.sendKeys(Keys.ENTER).build().perform();
		System.out.println(select.getText());
		
		driver.close();
		
		//a.sendKeys(Keys.DOWN.ENTER).build().perform();
	}

}
