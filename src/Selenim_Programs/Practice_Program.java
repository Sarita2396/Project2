package Selenim_Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_Program {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='fullname']")).sendKeys("sayali salunkhe");
		Thread.sleep(2000); //xpath by attribute
		
		driver.findElement(By.xpath("//input[contains(@name, 'em')]")).sendKeys("saylu@gmail.com");
		Thread.sleep(2000); //xpath by contains it can accept even half attribute value as well.
		
		driver.findElement(By.xpath("//input[contains(@name,'pa')]")).sendKeys("Sayali@123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='radio'][2]")).click();
		Thread.sleep(2000);  //xpath by index it is used in case of we have multiple matchings
		//but it is used in worst scenarios.
		
		WebElement value = driver.findElement(By.xpath("//div[text()='Gender:']"));
		System.out.println(value.getText()); //xpath by text with help of this attribute we can find the text on the label.
		//And get that text with the help of gettext method.

		driver.findElement(By.tagName("input")).sendKeys("Hi");
		Thread.sleep(2000);   //to find element with the help of tagname.
		//tagname should be present & must not be duplicate.
		
		
		driver.findElement(By.name("city")).sendKeys("pune");
		Thread.sleep(2000);//to find element with the help of name attribute name.
		//name should be present & must not be duplicate.
		
		driver.findElement(By.id("school")).sendKeys("Y.M");
		Thread.sleep(2000);//to find element with the help of id attribute name.
		//tagname should be present & must not be duplicate.
		
		//Class name is present but it is duplicate so we cannot used it.
		//driver.findElement(By.className("")).sendKeys("");
		
//		driver.findElement(By.linkText("rediff.com")).click();  //We have to provide full link text to redirect
//		Thread.sleep(2000);
		
//		driver.findElement(By.partialLinkText("Privacy")).click(); //We redirect with the help of half text within link text
//		Thread.sleep(2000);

		//sendkeys, click & gettext are the WebElemnet methods used to perform action on elements on the web page
		
		WebElement var = driver.findElement(By.xpath("//select[@name='date_day']"));
		 Select s = new Select(var);
		 
//		 s.selectByVisibleText("12");      //webelement method use to select visible text.
//		 s.selectByValue("15");         //webelement method use to select visible value.
//		 s.selectByIndex(9);        //webelement method use to select visible index value.
		 
//			System.out.println(s.isMultiple()); 
		   //  Thread.sleep(2000);

			//webelement method use to see if multiple options are selected or not
			//this all returns boolean value i.e, true/false.
		 
		 List<WebElement> dis = s.getOptions();
		 for(int i=0; i<dis.size(); i++)
		 {
			 System.out.println(dis.get(i).getText());
		 }
		 
	     
//	     WebElement ref = driver.findElement(By.xpath("//input[@name = 'city']"));
//	     
//	     System.out.println(ref.isDisplayed()); 
//	     //webelement method use to see whether element is displayed or not.
//	     System.out.println(ref.isSelected()); 
//	     //webelement method use to see whether element(used for list,buttons) is selected or not
//	     
//	     System.out.println("****************************");
//    WebElement faraway = driver.findElement(By.xpath("//input[@name = 'college']"));
//	     
//       faraway.click();
//	     System.out.println(faraway.isDisplayed());
//	     System.out.println(faraway.isSelected());
//	     System.out.println(faraway.isEnabled());
//	     //webelement method use to see whether we are able to insert text or nor means
//	     //specific field is enabled or disabled


	  Thread.sleep(2000);



		driver.close();
	}

}
