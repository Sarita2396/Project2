package Interview_Practice_Programs;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPractice {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.aspsnippets.com/demos/1102/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement popUp = driver.findElement(By.xpath("//input[@value='Open Popup']"));
		popUp.click();
		
		Set<String> windowAdd = driver.getWindowHandles();
		
		Iterator<String> itr = windowAdd.iterator();
		
		String a[] = new String[10];
		for(int i=0; i<windowAdd.size(); i++)
		{
			a[i]=itr.next();
			System.out.println(a[i]);
		}
		
		driver.switchTo().window(a[0]);
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(a[1]);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();

    }
}
