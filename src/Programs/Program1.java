package Programs;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction;

public class Program1 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		WebElement value = driver.findElement(By.xpath("xpath"));
		//To handle Alert
		Alert a = driver.switchTo().alert();
		a.accept();
		a.dismiss();
		
		//To handle authentication
		// "https://username:password@URL"
		driver.get("https://admin:admin@URL");
		
		//To handle Child-browser Pop-up
		
		WebElement value2 = driver.findElement(By.xpath("xpath"));
		value2.click();
		
	   Set<String> address = driver.getWindowHandles();
	   
	   Iterator<String> itr = address.iterator();
	   
	   String s[] = new String[10];
	   for(int i=0; i<address.size();i++)
	   {
		   s[i] = itr.next();
		   System.out.println(address);
	   }
	   
		driver.switchTo().window(s[0]);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(s[1]);
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		
		//Handle customize List-box
		
		WebElement list = driver.findElement(By.xpath(""));
		
		Actions b = new Actions(driver);
		b.moveToElement(list).click().build().perform();
		
		for(int i=0; i<7; i++)
		{
			b.sendKeys(Keys.DOWN);
		}
		
		b.sendKeys(Keys.ENTER);
		
		//Handle List-box
		
		WebElement select = driver.findElement(By.xpath(""));
		
		Select r = new Select(select);
		r.selectByVisibleText("");
		r.selectByIndex(0);
		r.selectByValue(null);
		System.out.println(r.isMultiple());
		
		List <WebElement> options = r.getOptions();
		List <WebElement> mOptions = r.getAllSelectedOptions();
		
		for(int i=0; i<options.size();i++) 
		{
			System.out.println(options.get(i).getText());
		}
		
		System.out.println(r.isMultiple());
		
		//GoogleSuggeston
		
		WebElement googleSearch = driver.findElement(By.xpath(""));
		
		googleSearch.sendKeys("");
		
		List<WebElement> multiOpton = driver.findElements(By.xpath(""));
		
		for(int i=0; i<multiOpton.size();i++)
		{
			System.out.println(multiOpton.get(i).getText());
		}
		
		for(int i=0; i<multiOpton.size();i++)
		{
			String expectedResult = "";
		    String actualResult = multiOpton.get(i).getText();
		    
		    if(actualResult.equalsIgnoreCase(expectedResult))
		    {
		    	multiOpton.get(i).click();
		    	break;
		    }
		}
		
		//Handling Multiple Elements
		
		List<WebElement> row = driver.findElements(By.xpath(""));
		List<WebElement> column = driver.findElements(By.xpath(""));
		
		System.out.println(row.size());
		System.out.println(column.size());
		
		for(int i=0; i<row.size();i++)
		{
			System.out.println(row.get(i).getText());
		}
	
	
	       //JS Handling
	
	JavascriptExecutor js = ((JavascriptExecutor)driver);
	
	js.executeScript("window.scrollTo(0, document.body.ScrollHeight)");
	js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("")));
	
	//ScreenShot
	
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(source);
	File dest = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\Screenshot\\final.jpg");
	FileHandler.copy(source, dest);
	
	}
}
