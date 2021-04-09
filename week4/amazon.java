package week4.day2;


import java.awt.Desktop.Action;
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
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.messages.internal.com.google.protobuf.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
public class amazon {
	private static final String Selenium = null;

	public static void main(String[] args) throws IOException, InterruptedException {
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);	
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("one plus 7 pro mobiles",Keys.ENTER);
		System.out.println("Price of first resulting mobile: " + driver.findElement(By.xpath("(//span[@class='a-price-whole'])")).getText());
driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height']/img)[1]")).click();
		Set allWindow=driver.getWindowHandles();
		List<String> windowSwitch = new ArrayList<String>(allWindow);
		driver.switchTo().window(windowSwitch.get(1));
				System.out.println("Customer Rating: "+ driver.findElement(By.xpath("(//a[@id='acrCustomerReviewLink']/span)[1]")).getText());
				
				driver.findElement(By.id("add-to-cart-button")).click();
				
				String getext = driver.findElement(By.xpath("//h4[text()='Added to Cart'][1]")).getText();
				if(getext.equals("Added to Cart"))
				
				{
					System.out.println("Item added successfully");
				}
			
				driver.findElement(By.xpath("//span[@id='attach-sidesheet-checkout-button']//input")).click();
				
				if(driver.getTitle().equals("Amazon Sign In"))
				{
					System.out.println("The Title is successfully verified");
				}
				
				driver.findElement(By.xpath("//input[@id='continue']")).click();
				String enterYourEmail = driver.findElement(By.xpath("//div[text()[normalize-space()='Enter your email or mobile phone number']]")).getText();
				System.out.println("After click on continue button,the following message is displayed: "+enterYourEmail);
	
				
				// Close both browsers
				driver.quit();
				
				

			}

}