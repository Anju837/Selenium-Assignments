package week4.day1;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.internal.runners.model.EachTestNotifier;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.messages.internal.com.google.protobuf.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
public class MergeLead {
	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//label[@for='username']/following-sibling::input")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//label[@for='password']/following-sibling::input")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElementByXPath("//a[contains(text(),'Leads')]").click();
		driver.findElementByXPath("//a[contains(text(),'Merge Leads')]").click();
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		Set allwindow =driver.getWindowHandles();
		List<String> win=new ArrayList<String>(allwindow);
		driver.switchTo().window(win.get(1));
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10143");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']/tbody/tr/td/div/a[@class='linktext'])[1]")).click();
		driver.switchTo().window(win.get(0));
driver.findElement(By.xpath("(//span[text()='From Lead']/following::img[@alt='Lookup'])[2]")).click();
		Set<String> newwindow = driver.getWindowHandles();
		List<String> newlistwindow = new ArrayList<String>(newwindow);
		driver.switchTo().window(newlistwindow.get(1));
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10150");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']/tbody/tr/td/div/a[@class='linktext'])[1]")).click();
		driver.switchTo().window(win.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("10143");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String recordsPerPage = driver.findElement(By.xpath("//span[text()='records per page.']")).getText();
		driver.quit();
	}}