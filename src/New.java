import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.aspsnippets.com/demos/1102/");
			WebElement openPopUpBtn =
			driver.findElement(By.xpath("//input[@value='Open Popup']"));
			openPopUpBtn.click();
			//Storing the windows in collection
			Set<String> windows = driver.getWindowHandles();
			//Use of cursor
			Iterator<String> itr = windows.iterator();
			String win[] = new String[10];
			System.out.println("Total Windows = " + windows.size()); //2
			for(int i=0;i<windows.size();i++) //i=0 i<2 Windows = > 0 1
			{
			win[i] = itr.next();
			System.out.println(win[i]);
			}
			// driver.quit();
			driver.switchTo().window(win[0]);
			System.out.println("Title of Window 0 = " + driver.getTitle());
			Thread.sleep(4000);
			driver.close();
			driver.switchTo().window(win[1]);
			System.out.println("Title of Window 1 = " + driver.getTitle());
			WebElement FN = driver.findElement(By.xpath("//td[contains(text(),'Fir')]"));
			WebElement LN =
			driver.findElement(By.xpath("//td[contains(text(),'Las')]"));
			System.out.println("FN = " + FN.getText());
			System.out.println("LN = " + LN.getText());
			Thread.sleep(4000);
			driver.close();
			}
	}

