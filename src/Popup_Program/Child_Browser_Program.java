package Popup_Program;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser_Program {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aspsnippets.com/demos/1102/");
		driver.manage().window().maximize();
		
		WebElement popUp = driver.findElement(By.xpath("//input[@value='Open Popup']"));
		popUp.click();
		
		//it stores the windows in collection
		Set<String> var = driver.getWindowHandles();
		//Use of universal cursor
		
		Iterator<String> itr = var.iterator();
		
		//Use of array to get the count of windows
		
		String a[] = new String[10];
		
		System.out.println("Total windows = " +var.size());
		
		for(int i=0; i<var.size();i++)
		{
			a[i]=itr.next();
			System.out.println(a[i]);
		}
		Thread.sleep(3000);

		driver.switchTo().window(a[0]);
		System.out.println("Title of Window 0 = " + driver.getTitle());
		Thread.sleep(4000);
		driver.close();
		
		driver.switchTo().window(a[1]);
		System.out.println("Title of Window 1 = " + driver.getTitle());
		Thread.sleep(4000);
		driver.quit();
		
	}


}
