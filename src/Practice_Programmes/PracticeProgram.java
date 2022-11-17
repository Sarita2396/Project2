package Practice_Programmes;

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

public class PracticeProgram {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Alert
		WebElement a = driver.findElement(By.xpath(""));
		a.click();
		Alert a1 = driver.switchTo().alert();
		a1.accept();
		a1.dismiss();
		
		//Authentication
		driver.get("https://the-internet.herokuapp.com/digest_auth");
		driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
		
		//ChildBrowser
		WebElement var1 = driver.findElement(By.xpath(""));
		var1.click();
		Set<String> add = driver.getWindowHandles();
		Iterator<String> i1 = add.iterator();
		String s[] = new String[10];
		for(int i=0; i<add.size(); i++)
		{
			s[i] = i1.next();
			System.out.println(add);
		}
		driver.switchTo().window(s[0]);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(s[1]);
		System.out.println(driver.getTitle());
		
		//FileUpload
		WebElement upload = driver.findElement(By.xpath(""));
		upload.sendKeys("File Name");
		WebElement submit = driver.findElement(By.xpath(""));
		submit.click();
		
		//LisBtox
		WebElement s1 = driver.findElement(By.xpath(""));
		driver.switchTo().frame("iframeResult");
		Select s2 = new Select(s1);
		s2.selectByVisibleText("");
		s2.selectByIndex(0);
		s2.selectByValue("");
		s2.deselectByVisibleText("");
		
		System.out.println(s2.isMultiple());
		
		List <WebElement> options = s2.getOptions();
		for(int i=0; i<options.size(); i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		//frame
		driver.switchTo().frame("");
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		//ActionClass
		WebElement a2 = driver.findElement(By.xpath(""));
		Actions a3 = new Actions(driver);
		a3.moveToElement(a2).click().build().perform();
		for(int i=0; i<4; i++)
		{
			a3.sendKeys(Keys.DOWN);
		}
		
		a3.sendKeys(Keys.ENTER);
		
		//DragNDrop
		WebElement d1 = driver.findElement(By.xpath(""));
		WebElement d2 = driver.findElement(By.xpath(""));
		WebElement trash = driver.findElement(By.xpath(""));
		
		Actions d = new Actions(driver);
		d.dragAndDrop(d1, trash).build().perform();
		d.dragAndDrop(d2, trash).build().perform();
		
		//MultipleElementHandle
		List<WebElement> row = driver.findElements(By.xpath(""));
		List<WebElement> col = driver.findElements(By.xpath(""));
		System.out.println(row.size());
		System.out.println(col.size());
		for(int i=0; i<row.size(); i++)
		{
			System.out.println(row.get(i).getText());
		}
		
		//ScreenShot
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		File dest = new File("Folder Path");
		FileHandler.copy(source, dest);
		
		//Paramerization
		
		FileInputStream file = new FileInputStream("File Path");
		Sheet data = WorkbookFactory.create(file).getSheet("Sheet Name");
		WebElement ele = driver.findElement(By.xpath(""));
		ele.sendKeys(data.getRow(0).getCell(0).getStringCellValue());
//		ele.sendKeys(data.getRow(0).getCell(0).getNumericCellValue());
//		ele.sendKeys(data.getRow(0).getCell(0).getBooleanCellValue());
		
		//GoogleSugg
		WebElement search = driver.findElement(By.xpath(""));
		search.sendKeys("Testi");
		List<WebElement> l1 = driver.findElements(By.xpath(""));
		for(int i=0; i<l1.size(); i++)
		{
			System.out.println(l1.get(i).getText());
		}
		
		for(int i=0; i<l1.size(); i++)
		{
			String actualResult = l1.get(i).getText();
			String expectedResult = "Manual Testing";
			if(actualResult.equals(expectedResult))
			{
				l1.get(i).click();
				break;
			}
		}
		
		//Logical Program
		//EvenOdd
		
		for(int i=2; i<=5; i=i+2)
		{
			System.out.println(i);
		}
		
		for(int i=1; i<=5; i=i+2)
		{
			System.out.println(i);
		}
		
		//Fact
		long fact =1;
		for(int i=0; i<=5; i++)
		{
			fact = fact*i;
		}
		   System.out.println(fact);
		
	    //ReverseNo
		 
	     int no=321;
	     int rev = 0;
	     while(no!=0)
	     {
	    	rev = rev*10 + no%10;
	    	no=no/10;
	     }
		  System.out.println(rev);
		  
		  //Palindrome/no
		  
		     int no1=321;
		     int rev1 = 0;
		     int newNo = no1;
		     while(no!=0)
		     {
		    	rev = rev*10 + no%10;
		    	no=no/10;
		     }
			 if(newNo==rev)
			 {
				System.out.println("Palindrome No"); 
			 }
			 else
			 {
				 System.out.println("Not Palindrome No");
			 }
			 
			 //ReverseString
			 String str = "Sarita";
			 String revNew = "";
			 int len = str.length();
			 for(int i=len-1; i>=0; i--)
			 {
				 revNew = revNew + str.charAt(i);
			 }
			 
			 System.out.println(revNew);
			 
			 //PalindromeString
			 
			 String str1 = "Sarita";
			 String revNew1 = "";
			 String newStr = str1;
			 int len1 = str1.length();
			 for(int i=len1-1; i>=0; i--)
			 {
				 revNew1 = revNew1 + str1.charAt(i);
			 }
			 
			 if(newStr.equals(revNew1))
			 {
				 System.out.println("Palindrome String");
			 }
			 else
			 {
				 System.out.println("not a Palindrome String");
			 }
		   
		   //Armstrong No
			 int num = 341, sum=0, rem;
			 int newNum = num;
			 while(num!=0)
			 {
				 rem = num%10;
				 sum = sum + rem*rem*rem;
				 num = num/10;
			 }
			 
			 if(newNum==sum)
			 {
				 System.out.println("ArmStrong no");
			 }
			 else
			 {
				 System.out.println("Not an ArmStrong no");

			 }
			 
			 
			 
		
	}

}
