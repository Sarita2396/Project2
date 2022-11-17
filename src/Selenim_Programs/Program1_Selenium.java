package Selenim_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1_Selenium {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.chorme.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium_Project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://is.rediff.com/signup/register");
		
		System.out.println("Title is = " +driver.getTitle());
					     
	    WebElement imgLink = driver.findElement(By.xpath("//img[@src = 'https://ishare.rediff.com/worldrediff/pix/blank.gif']"));
	   
	    int count = 0;
		
		   if(imgLink.isDisplayed())
		   {
			   count++;
			   System.out.println("ImgLink is available");
		   }
			
		   else
		   {
			   System.out.println("Element is not available");
		   }
		   
	   
		WebElement newUserLabel = driver.findElement(By.xpath("//b[text()='New User? Register here']"));
		 
		if(newUserLabel.isDisplayed())
		   {
			   count++;
			   System.out.println(newUserLabel.getText());
		   }
			
		   else
		   {
			   System.out.println("Element is not available");
		   }

		
		WebElement paraText = driver.findElement(By.xpath("//p[@class = 'grey1']"));
		if(paraText.isDisplayed())
		   {
			   count++;
			   System.out.println(paraText.getText());
		   }
			
		   else
		   {
			   System.out.println("Element is not available");
		   }
		
	   WebElement fullNameLabel = driver.findElement(By.xpath("//div[text() ='Your Full name']"));
	   if(fullNameLabel.isDisplayed())
	   {
		   count++;
		   System.out.println(fullNameLabel.getText());
	   }
		
	   else
	   {
		   System.out.println("Element is not available");
	   }
	   
	   WebElement emailLabel = driver.findElement(By.xpath("//div[text() = 'Your current email ID']"));
	   if(emailLabel.isDisplayed())
	   {
		   count++;
		   System.out.println(emailLabel.getText());
	   }
		
	   else
	   {
		   System.out.println("Element is not available");
	   }
	   
	   WebElement exampleLabel = driver.findElement(By.xpath("//p[@class= 'sm1 grey1']"));
	   if(exampleLabel.isDisplayed())
	   {
		   count++;
		   System.out.println(exampleLabel.getText());
	   }
		
	   else
	   {
		   System.out.println("Element is not available");
	   }
	   
	   WebElement newPassLabel = driver.findElement(By.xpath("//div[text()='New password']"));
	   if(newPassLabel.isDisplayed())
	   {
		   count++;
		   System.out.println(newPassLabel.getText());
	   }
		
	   else
	   {
		   System.out.println("Element is not available");
	   }
	   
	   WebElement RetypePassLabel = driver.findElement(By.xpath("//div[text() = 'Retype password']"));
	   if(RetypePassLabel.isDisplayed())
	   {
		   count++;
		   System.out.println(RetypePassLabel.getText());
	   }
		
	   else
	   {
		   System.out.println("Element is not available");
	   }
	   	   
	   WebElement genderLabel = driver.findElement(By.xpath("//div[text() = 'Gender:']"));
	   if(genderLabel.isDisplayed())
	   {
		   count++;
		   System.out.println(genderLabel.getText());
	   }
		
	   else
	   {
		   System.out.println("Element is not available");
	   }
	   
	   WebElement maleLabel = driver.findElement(By.xpath("//input[@value= 'f']"));
	   if(maleLabel.isDisplayed())
	   {
		   count++;
		   System.out.println(maleLabel.getText());
	   }
		
	   else
	   {
		   System.out.println("Element is not available");
	   }
	   
	   WebElement femaleLabel = driver.findElement(By.xpath("//input[@value='m']"));
	   if(femaleLabel.isDisplayed())
	   {
		   count++;
		   System.out.println(femaleLabel.getText());
	   }
		
	   else
	   {
		   System.out.println("Element is not available");
	   }
	   		   
      WebElement dateOfBirthLabel = driver.findElement(By.xpath("//select[@name = 'date_day']"));
      if(dateOfBirthLabel.isDisplayed())
	   {
		   count++;
		   System.out.println(dateOfBirthLabel.getText());
	   }
		
	   else
	   {
		   System.out.println("Element is not available");
	   }
	   
	  WebElement dateListBox = driver.findElement(By.xpath("//select[@name = 'date_mon']"));
	  if(dateListBox.isDisplayed())
	   {
		   count++;
		   System.out.println(dateListBox.getText());
	   }
		
	   else
	   {
		   System.out.println("Element is not available");
	   }
	   
       
	  WebElement dayListBox = driver.findElement(By.xpath("//select[@name = 'Date_Year']"));
	  if(dayListBox.isDisplayed())
	   {
		   count++;
		   System.out.println(dayListBox.getText());
	   }
		
	   else
	   {
		   System.out.println("Element is not available");
	   }
	  

	   WebElement locationLabel = driver.findElement(By.xpath("//div[text() = 'Location']"));
	   if(locationLabel.isDisplayed())
	   {
		   count++;
		   System.out.println(locationLabel.getText());
	   }
		
	   else
	   {
		   System.out.println("Element is not available");
	   }
	   

	   WebElement schoolLabel = driver.findElement(By.xpath("//div[text() = 'School']"));
	   if(schoolLabel.isDisplayed())
	   {
		   count++;
		   System.out.println(schoolLabel.getText());
	   }
		
	   else
	   {
		   System.out.println("Element is not available");
	   }
	   

	   WebElement collegeLabel = driver.findElement(By.xpath("//div[text() = 'College']"));
	   if(collegeLabel.isDisplayed())
	   {
		   count++;
		   System.out.println(collegeLabel.getText());
	   }
		
	   else
	   {
		   System.out.println("Element is not available");
	   }
	   
	   
	   WebElement captchaLabel = driver.findElement(By.xpath("//div[text() = 'Enter the code given in the above image']"));
	   if(captchaLabel.isDisplayed())
	   {
		   count++;
		   System.out.println(captchaLabel.getText());
	   }
		
	   else
	   {
		   System.out.println("Element is not available");
	   }
	   
	    System.out.println("Total Elements count" +count);
	   driver.close();
		
      
	}


}
