package Practice__Program;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practice__Pro {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//alert
		
		WebElement var = driver.findElement(By.xpath("//input[@id='login1']"));
		var.sendKeys("");
		WebElement var1 = driver.findElement(By.xpath("//input[@value='Sign in']"));
		var1.sendKeys("");
		WebElement submit = driver.findElement(By.xpath("//input[@value='Sign in']"));
		submit.click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		a.accept();
		a.dismiss();
		
		//authentication
		
		driver.get("https://the-internet.herokuapp.com/digest_auth\"");
		driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth\\");
		
		//ChildBrowerPopup
		
		WebElement identify = driver.findElement(By.xpath(""));
		identify.click();
		
		//getwindowhandle()
		Set<String> address = driver.getWindowHandles();
		
		//iterator
		
		Iterator<String> it = address.iterator();
		
		//String array
		
		String a1[] = new String[10];
		for(int i=0; i<address.size(); i++)
		{
			a1[i] = it.next();
			System.out.println(address);
		}
		
		driver.switchTo().window(a1[0]);
		Thread.sleep(2000);
		
		driver.switchTo().window(a1[1]);
		driver.quit();
		
		//CustomizeListBox
		
		WebElement web = driver.findElement(By.xpath(""));
		
		Actions s = new Actions(driver);
		s.moveToElement(web).click().build().perform();
		
		for(int i=1; i<4; i++)
		{
			s.sendKeys(Keys.DOWN);
		}
		
		s.sendKeys(Keys.ENTER);
		
		driver.close();
		
		//dragAnddrop
		
		WebElement web1 = driver.findElement(By.xpath(""));
		WebElement web2 = driver.findElement(By.xpath(""));
		
		Actions n = new Actions(driver);
		n.dragAndDrop(web1, var);
		n.dragAndDrop(web2, var);
		driver.close();
		
		//MultipleElements
		List<WebElement> row = driver.findElements(By.xpath(""));
		List<WebElement> col = driver.findElements(By.xpath(""));
		System.out.println(row.size());
		System.out.println(col.size());
		for(int i=0; i<col.size(); i++)
		{
			System.out.println(col.get(i).getText());
			Thread.sleep(2000);
		}
		
		driver.close();
		
		//ListBox
		
		WebElement list = driver.findElement(By.xpath(""));
		
		Select x = new Select(list);
		x.selectByVisibleText("");
		x.selectByIndex(0);
		x.selectByValue("");
		x.deselectByVisibleText("");
		
		System.out.println(x.isMultiple());
		
		List <WebElement> options = x.getOptions();
		List <WebElement> options1 = x.getAllSelectedOptions();
		for(int i=0; i<options.size(); i++)
		{
			System.out.println(options.get(i).getText());
			Thread.sleep(2000);
		}
		
		driver.close();
		
		//FileUpload
		WebElement browse = driver.findElement(By.xpath(""));
		browse.sendKeys("File Path");
		Thread.sleep(2000);
		WebElement submit1 = driver.findElement(By.xpath(""));
		submit1.click();
		driver.close();
		
		//GoogleSuggestion
		WebElement s1 = driver.findElement(By.xpath("//input[@name='q']"));
		s1.click();
		List<WebElement> g1 = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		for(int i=0; i<g1.size(); i++)
		{
			System.out.println(g1.get(i).getText());
			Thread.sleep(2000);
		}
		
		for(int i=0; i<g1.size(); i++)
		{
			
		String actualResult = g1.get(i).getText();
		String expectedResult= "testting";
		
		if(expectedResult.equals(actualResult))
		{
			g1.get(i).click();
			break;
		}
		
		Thread.sleep(2000);
		
		}
		
		driver.close();
	}

}
