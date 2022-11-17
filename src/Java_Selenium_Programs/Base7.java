package Java_Selenium_Programs;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base7 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium26Feb\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.aspsnippets.com/demos/1102/");
		WebElement popUp = driver.findElement(By.xpath("//input[@value='Open Popup']"));
		popUp.click();
		
		Set<String> var = driver.getWindowHandles();
		
		Iterator<String> var2 = var.iterator();
		
		String s[] = new String[10];
		
		for(int i=0; i<var.size(); i++)
		{
			s[i]=var2.next();
			System.out.println(s[i]);

		}
		
		    driver.switchTo().window(s[0]);
		    System.out.println(driver.getTitle());
		    Thread.sleep(2000);
		 
		    
		    driver.switchTo().window(s[1]);
		    System.out.println(driver.getTitle());
		    driver.manage().window().maximize();
		    Thread.sleep(2000);
		    driver.quit();
		
	}

}
