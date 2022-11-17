package Final_Practice_Selenium_Programs;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
//		driver.navigate().forward();
//		driver.navigate().to("https://www.flipkart.com/");
//		driver.navigate().back();
//		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		String actualTitle= "gGoogle";
		String expectedTitle= driver.getTitle();
		if(actualTitle.equalsIgnoreCase(expectedTitle))
		{
			System.out.println("correct title");
		}
		else
		{
			System.out.println("wrong Title");
		}
		
		Dimension d = new Dimension(150, 200); //Size
		driver.manage().window().setSize(d);
		
		Point p = new Point(150, 230);          //Position
		driver.manage().window().setPosition(p);
		
		Thread.sleep(2000);
		driver.close();
	}

}
