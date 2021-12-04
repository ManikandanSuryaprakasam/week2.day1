package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AssignmentTestcase3 {

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
		
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Manikandan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Suryaprakasam");
			
		
		//Select the country by its text
		WebElement objSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select ddlSource = new Select(objSource);
		ddlSource.selectByVisibleText("Direct Mail");
		
		//Select the market Campaign by its text
				WebElement objCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
				Select ddlCampaign = new Select(objCampaign);
				ddlCampaign.selectByVisibleText("Automobile");
				
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Mani");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Surya");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("11/25/1981");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mr");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("10000000");
		
		//Select the Preferred currency 
		WebElement objPCurrency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select ddlCurrency = new Select(objPCurrency);
		ddlCurrency.selectByValue("CAD");
		
		//Select the Industry  
		WebElement objIndustry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select ddlIndustry = new Select(objIndustry);
		ddlIndustry.selectByVisibleText("Computer Software");

		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("500000");

		//Select the Ownership  
		WebElement objOwner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ddlOwner = new Select(objOwner);
		ddlOwner.selectByVisibleText("Corporation");	

		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("T75490");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("SM");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is to enter the description and validate the text in it");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("NA");
			
		 
		
		//Contact Information
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9500077509");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("123");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Srinivasan");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mani.suryaprakash@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://github.com/ManikandanSuryaprakasam");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Manikandan Suryaprakasam");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Mani");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No 54 West Park street");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Northwest Province");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Alberta");
		
		WebElement objCountry2 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select ddlCountry2 = new Select(objCountry2);
		ddlCountry2.selectByVisibleText("Canada");
		
		
		WebElement objState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select ddlState = new Select(objState);
		ddlState.selectByVisibleText("Manitoba");
		
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("85042");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("123");
		
		//Create Lead button click		
		driver.findElement(By.name("submitButton")).click();
		
		//Verify First name
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(text);
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
