package week2.day1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeAssignment1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Anju");
		driver.findElement(By.name("parentPartyId")).sendKeys("democlass1");
		driver.findElement(By.id("groupNameLocal")).sendKeys("liya");
		driver.findElement(By.id("officeSiteName")).sendKeys("Testleaf");
		driver.findElement(By.id("annualRevenue")).sendKeys("5");
		WebElement ele = driver.findElement(By.id("currencyUomId"));
		Select dd = new Select(ele);
				dd.selectByVisibleText("AOK - Angolan Kwanza");
				WebElement ele1 = driver.findElement(By.name("industryEnumId"));
				Select dd1 = new Select(ele1);
				dd1.selectByValue("IND_SOFTWARE");
				driver.findElement(By.id("numberEmployees")).sendKeys("5235425");
		 WebElement ele11 = driver.findElement(By.name("ownershipEnumId"));
		 Select dd11 = new Select(ele11);
		 dd11.selectByVisibleText("Partnership");
		 driver.findElement(By.id("sicCode")).sendKeys("abc");
		 driver.findElement(By.id("tickerSymbol")).sendKeys("yes");
			WebElement ele12 = driver.findElement(By.name("dataSourceId"));
			Select dd2 = new Select(ele12);
			dd2.selectByValue("LEAD_COLDCALL");

			WebElement ele13 = driver.findElement(By.name("marketingCampaignId"));
			Select dd3 = new Select(ele13);
			dd3.selectByValue("9002");
			WebElement ele14 = driver.findElement(By.name("initialTeamPartyId"));
			Select dd4 = new Select(ele14);
			dd4.selectByValue("DemoSalesTeam1");
			driver.findElement(By.name("description")).sendKeys("Hi testleaf");
			 driver.findElement(By.name("importantNote")).sendKeys("useful fro career");
			 System.out.println("Contact Information");
			 driver.findElement(By.id("primaryPhoneCountryCode")).sendKeys("91");
			 driver.findElement(By.id("primaryPhoneAreaCode")).sendKeys("910");
			 driver.findElement(By.id("primaryPhoneNumber")).sendKeys("1234567890");
			 driver.findElement(By.id("primaryPhoneExtension")).sendKeys("044");
			 driver.findElement(By.name("primaryPhoneAskForName")).sendKeys("saran");
			 driver.findElement(By.id("primaryEmail")).sendKeys("ann@gmail.com");
			 driver.findElement(By.name("primaryWebUrl")).sendKeys("http://chrome.com");
			 driver.findElement(By.name("generalToName")).sendKeys("anjuk");
			 driver.findElement(By.name("generalAttnName")).sendKeys("liyana");
			 driver.findElement(By.name("generalAddress1")).sendKeys("roya");
			 driver.findElement(By.name("generalAddress2")).sendKeys("guindy");
			 driver.findElement(By.name("generalCity")).sendKeys("chennai");
			 WebElement ele15 = driver.findElement(By.name("generalCountryGeoId"));
				Select dd5 = new Select(ele15);
				dd5.selectByValue("ALB");
				 driver.findElement(By.id("generalPostalCode")).sendKeys("600017");
				// WebElement ele16 = driver.findElement(By.id("generalStateProvinceGeoId"));
					////Select dd6 = new Select(ele16);
				//	dd6.selectByVisibleText("Tennessee");
					// driver.findElement(By.id("generalPostalCodeExt")).sendKeys("def");
					 
		driver.findElement(By.className("smallSubmit")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		//title = driver.getTitle();
		//sSystem.out.println(title);	*/
	}

}
