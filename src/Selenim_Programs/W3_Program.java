package Selenim_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class W3_Program {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.chorme.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	   driver.get("https://techcanvass.com/Examples/multi-select.html");
	   		
		WebElement cars = driver.findElement(By.xpath("//select[@id = 'multiselect']"));
		
		Select s = new Select(cars);
       
		System.out.println(s.isMultiple());
		Thread.sleep(2000);
		
		s.selectByVisibleText("Volvo");
		s.selectByVisibleText("Maruti Suzuki");
		s.selectByVisibleText("Opel");
		s.deselectByVisibleText("Volvo");
		Thread.sleep(2000);
		
		driver.close();
	}

}
