package Popup_Program;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		
		WebElement var1 = driver.findElement(By.xpath("//input[@name='NewWindow']"));
		var1.click();
		
		Set<String> var2 = driver.getWindowHandles();
		
		Iterator<String> itr = var2.iterator();
		
		String str[]=new String[10];
		
		System.out.println(var2.size());
		
		for(int i=0;i<var2.size();i++)
		{
			str[i]=itr.next();
			System.out.println(str[i]);
		}
		
		driver.switchTo().window(str[0]);
		System.out.println("Window 0 = " + driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		
		driver.switchTo().window(str[1]);
		System.out.println("Window 1 = " + driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		
	}

}
