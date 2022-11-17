package interview_progarm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_List_Program {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.chorme.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().frame("iframeResult");
		WebElement cars = driver.findElement(By.xpath("//select[@name='cars']"));
		Select s = new Select(cars);
//		s.selectByVisibleText("Volvo");
//		s.selectByVisibleText("Saab");
		System.out.println(s.isMultiple());
		Thread.sleep(2000);
		driver.close();
	}

}
