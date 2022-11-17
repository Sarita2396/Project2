package Overall_Practice_Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Methods {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
//		driver.navigate().to("https://www.rediff.com/");
//		driver.manage().window().maximize();
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String actualTitle="Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		String exceptedTitle=driver.getTitle();
		
		if(actualTitle.equals(exceptedTitle))
		{
			System.out.println("Title is equal");
		}
		else
		{
			System.out.println("Title is not not equal");
		}
		String actualUrl="https://www.rediff.com/";
		String currentUrl=driver.getCurrentUrl();
		if(actualUrl.equals(currentUrl))
		{
			System.out.println("URL is equal");
		}
		else
		{
			System.out.println("URL is not equal");
		}
		
		driver.close();
	}

}
