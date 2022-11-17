package Interview_Practice_Programs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserNew {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("wedriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.aspsnippets.com/demos/1102/");
		WebElement popUp = driver.findElement(By.xpath("//input[@value='Open Popup']"));
		popUp.click();
		
		Set<String> window = driver.getWindowHandles();
		
		Iterator<String> itr = window.iterator();
		
		String s[] = new String[10];
		for(int i=0;i<window.size();i++)
		{
			s[i]=itr.next();
			System.out.println(s[i]);
		}
		
		driver.switchTo().window(s[0]);
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(s[1]);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}

}
