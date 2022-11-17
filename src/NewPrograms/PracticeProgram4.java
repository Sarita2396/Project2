package NewPrograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeProgram4 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aspsnippets.com/demos/1102/");
		WebElement popup = driver.findElement(By.xpath(""));
		Set<String> address = driver.getWindowHandles();
		Iterator<String> it = address.iterator();
		String a1[] = new String[10];
		for(int i=0; i<address.size(); i++)
		{
			a1[i] = it.next();
			System.out.println(address);
		}
		
		driver.switchTo().window(a1[0]);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(a1[1]);
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		driver.quit();
	}
	
	
	

}
