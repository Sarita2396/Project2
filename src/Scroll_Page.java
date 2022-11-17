import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Page {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		WebElement topStories = driver.findElement(By.xpath("//span[text()='Top Stories']"));
		JavascriptExecutor js = ((JavascriptExecutor)driver);
//js.executeScript("arguments[0].scrollIntoView();",topStories);  //Scroll upto elements we provide
//js.executeScript("window.scrollBy(0,2000)");   //Half window scroll
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); //full window scroll
		
		js.executeScript("arguments[0].scrollIntoView();",
		    driver.findElement(By.xpath("//a[text()='Contact Us']")));
		
		Thread.sleep(5000);
		driver.close();
	}

}
