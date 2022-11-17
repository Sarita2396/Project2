package Practice_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Attribute {

	public static void main(String[] args) {

		//tagName[@attributeName ='attributeValue']
		//getText will returns = innerText/label
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();
		
		WebElement var = driver.findElement(By.xpath("//input[@name='fullname']"));
		//attribute method will return the value of the attribute
		System.out.println(var.getAttribute("name"));
		var.sendKeys("Sarita");
		
		//getText method will return innerText/label of the field
		WebElement var1 = driver.findElement(By.xpath("//div[text()='Your Full name']"));
		System.out.println(var1.getText());
		
		WebElement var2 = driver.findElement(By.xpath("//input[@name='emailid']"));
		System.out.println(var2.getAttribute("id"));
		var2.sendKeys("Sarita123@gmail.com");
		driver.close();
		
	}

}
