package AllInOnePrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class AllInOneProgram1 {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("");
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Alter
		
		WebElement click = driver.findElement(By.xpath("//input[@id ='login1']"));
		WebElement submit = driver.findElement(By.xpath("//input[@value ='Sign in']"));
		
		Alert a = driver.switchTo().alert();
		a.accept();
		a.dismiss();
		
		//Authentication
		
		driver.get("https://the-internet.herokuapp.com/digest_auth");
		driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
		
		//ChildBrowser
		
		WebElement v1 = driver.findElement(By.xpath("//input[@id ='login1']"));
		v1.click();
		Set<String> add = driver.getWindowHandles();
		
		//iterator
		
		Iterator<String> it = add.iterator();
		
		//StringArray
		
		String s[] = new String[10];
		for(int i=0; i<add.size(); i++)
		{
			s[i] = it.next();
			System.out.println(add);
		}
		
		driver.switchTo().window(s[0]);
		driver.getTitle();
		
		driver.switchTo().window(s[1]);
		driver.getTitle();
		
		//driver.quit();
		
		//CutomizeListBox
		WebElement v2 = driver.findElement(By.xpath("//input[@id ='login1']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(v2).click().build().perform();
		for(int i=0; i<4; i++)
		{
			a1.sendKeys(Keys.DOWN);
		}
		
		a1.sendKeys(Keys.ENTER);
		
		//SelectClasss
		WebElement v3 = driver.findElement(By.xpath("//input[@id ='login1']"));
		Select s1 = new Select(v3);
		s1.selectByVisibleText("");
		s1.selectByValue("");
		s1.selectByValue(null);
		s1.deselectByVisibleText("");
		System.out.println(s1.isMultiple());
		
		//getAllElements
		
		List <WebElement> options = s1.getOptions();
		for(int i=0; i<options.size(); i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		//		
		WebElement drop1 = driver.findElement(By.xpath("//input[@id ='login1']"));
		WebElement drop2 = driver.findElement(By.xpath("//input[@id ='login1']"));
		WebElement trash = driver.findElement(By.xpath("//input[@id ='login1']"));
		
		Actions d = new Actions(driver);
		d.dragAndDrop(drop1, trash).build().perform();
		d.dragAndDrop(drop2, trash).build().perform();
		Thread.sleep(2000);
		
		//HandlingMultipleElements
		List<WebElement> row = driver.findElements(By.xpath("//input[@id ='login1']"));
		List<WebElement> columns = driver.findElements(By.xpath("//input[@id ='login1']"));
		System.out.println(row.size());
		System.out.println(columns.size());
		for(int i=0; i<row.size(); i++)
		{
			System.out.println(row.get(i).getText());
		}
		
		//GoogleSuggetion
		WebElement search = driver.findElement(By.xpath("//input[@id ='login1']"));
		search.sendKeys("Seleni");
		
		List<WebElement> list = driver.findElements(By.xpath(""));
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i).getText());
		}

		for(int i=0; i<list.size(); i++)
		{
			String expectedResult = "Testing";
		    String actualResult = list.get(i).getText();;
			
			if(expectedResult.equals(actualResult))
			{
				list.get(i).click();
				break;
			}
			
			Thread.sleep(2000);
		}
		
		//ScreenShot
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		File dest = new File("Folder Path");
		FileHandler.copy(source, dest);
		
		
		//Parameterization
		FileInputStream file = new FileInputStream("File Path");
		Sheet data = WorkbookFactory.create(file).getSheet("Sheet Name");
		WebElement old = driver.findElement(By.xpath("//input[@id ='login1']"));
		old.sendKeys(data.getRow(0).getCell(0).getStringCellValue());
		
		//Frames
		
		driver.switchTo().frame("Frame Name");
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		WebElement frmaes = driver.findElement(By.xpath(""));
		driver.switchTo().frame(frmaes);
		
		//FileUpload
		
		WebElement upload = driver.findElement(By.xpath("//input[@id ='login1']"));
		upload.sendKeys("File Path you want upload");
		WebElement press = driver.findElement(By.xpath("//input[@id ='login1']"));
		press.click();
		
	}

}
