package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AssignmentTestcase1 {

	public static void main(String[] args) {
		//Setup the Chrome driver
		WebDriverManager.chromedriver().setup();
		
				
		//Initialize chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the url
		driver.get("http://leaftaps.com/opentaps");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//FInd the username and enter the value
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Create Contact
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Manikandan");
		driver.findElement(By.id("lastNameField")).sendKeys("Suryaprakasam");
		driver.findElement(By.name("submitButton")).click();
		
		//Validate the Firstname
		String text = driver.findElement(By.id("viewContact_firstName_sp")).getText();
		if (text.equals("Manikandan"))
		{		
		System.out.println("Validated successfully!!!: "+text);
		}
		else
			System.out.println("Text not matching");
		
		
		System.out.println(driver.getTitle());
		driver.close();
		
			
	}

}
