package Practice_Programmes;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("wedriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.aspsnippets.com/demos/1102/");
		WebElement popup = driver.findElement(By.xpath("//input[@value='Open Popup']"));
		popup.click();
		Set<String> add = driver.getWindowHandles();
		Iterator<String> it = add.iterator();
		String s[] = new String[10];
		for(int i=0; i<add.size(); i++)
		{
			s[i]=it.next();
			System.out.println(add);
		}
		
		driver.switchTo().window(s[0]);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(s[1]);
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();
	}

}
