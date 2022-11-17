package Handling_Cutomize_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement ele5000 = driver.findElement(By.xpath("//li[@class='block13 ui-draggable']//a[@class='button button-orange']"));
		WebElement bank = driver.findElement(By.xpath("//li[@class='block14 ui-draggable']//a[@class='button button-orange']"));
		WebElement sales = driver.findElement(By.xpath("//li[@class='block15 ui-draggable']//a[@class='button button-orange']"));
		WebElement debitSideAcc = driver.findElement(By.xpath("//ol[@class='field14 ui-droppable ui-sortable']"));
		WebElement debitSideAmt = driver.findElement(By.xpath("//ol[@class='field13 ui-droppable ui-sortable' and @id = 'amt7']"));
		WebElement creditSideAcc = driver.findElement(By.xpath("//ol[@class='field15 ui-droppable ui-sortable']"));
		WebElement creditSideAmt = driver.findElement(By.xpath("//ol[@class='field13 ui-droppable ui-sortable' and @id='amt8']"));
		
		Actions a = new Actions(driver);
		
		a.dragAndDrop(ele5000, debitSideAmt).build().perform();
		Thread.sleep(2000);
		a.dragAndDrop(ele5000, creditSideAmt).build().perform();
		Thread.sleep(2000);
		a.dragAndDrop(bank, debitSideAcc).build().perform();
		Thread.sleep(2000);
		a.dragAndDrop(sales, creditSideAcc).build().perform();
		
		WebElement resultele = driver.findElement(By.xpath("//div[@class='table4_result']//a[@class='button button-green']"));
		String expectedResult="Perfect!";
		String actualResult= resultele.getText();
		if(expectedResult.equals(actualResult))
		{
			System.out.println("Test Case Pass");
		}
		else
		{
		 	System.out.println("Test Case Fail");
		}
		driver.close();
	
	}

}
