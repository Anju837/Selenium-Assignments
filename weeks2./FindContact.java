package week2.day2;


import java.io.IOException;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class FindContact {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@type='text'][@name='emailAddress']")).sendKeys("ann@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
		WebElement firstname = driver.findElement(By.id("viewContact_firstName_sp"));
		System.out.println("The first name is: " + firstname.getText());
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		WebElement marketingDropDown = driver.findElement(By.id("addMarketingCampaignForm_marketingCampaignId"));
		Select dd1 = new Select(marketingDropDown);
		dd1.selectByValue("9000");
		driver.findElement(By.xpath("//input[@class='smallSubmit'][@value='Add']")).click();
		driver.findElement(By.id("updateContactForm_departmentName")).sendKeys("Selenium Automation Testing");
		driver.findElement(By.xpath("//input[@class='smallSubmit'][@value='Update']")).click();
		System.out.println(driver.findElement(By.xpath("//a[text()='eCommerce Site Internal Campaign (9000)']")).getText());
		String title1 = driver.getTitle();
		System.out.println("The title of the page is : " + title1);

	
}}
