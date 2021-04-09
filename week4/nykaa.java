package week4.day2;


import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
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
public class nykaa {
	//private static final String Selenium = null;

	public static void main(String[] args) throws IOException, InterruptedException {
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);	
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Perfumes",Keys.ENTER);
		List<WebElement> perfumeName= driver.findElements(By.xpath("/div[@class='main-product-listing-page']"));
		System.out.println("Total Number of Perfume Name: " +perfumeName.size() );
		for(int i=0;i<perfumeName.size();i++)
		{
			String name= perfumeName.get(i).getText();
			System.out.println("Perfume Name: " + i+ ": " + name);
		}
		List<WebElement> perfumeprice= driver.findElements(By.xpath("//span[@class='post-card__content-price-offer']"));
		System.out.println("Total Number of Perfume Price available: " +perfumeprice.size() );
		for(int i=0;i<perfumeprice.size();i++)
		{
			String PP= perfumeprice.get(i).getText();
			PP=PP.replaceAll("[^0-9]","");
			System.out.println("Perfume Price of " + i + "th perfume: " +PP);
		
		}
		List<WebElement> perfumeprice1= driver.findElements(By.xpath("//span[@class='post-card__content-price-offer']"));
		int a=0;
		WebElement ele = null;
		for(int i=0;i<perfumeprice.size();i++)
		{
			String PP= perfumeprice.get(i).getText();
			PP=PP.replaceAll("[^0-9]","");
			int maxValue= Integer.parseInt(PP);
			if(maxValue>a)
			{
				a=maxValue;
				int val = i+1;
				ele= driver.findElement(By.xpath("(//span[@class='post-card__content-price-offer'])["+ val +"]"));
				
			}
			
		}
		System.out.println("Highest perfume price: " +a);
		ele.click();
			//6. Click on Add To Bag
			Set allWindow= driver.getWindowHandles();
			List<String> l = new ArrayList<String>(allWindow);
			driver.switchTo().window(l.get(1));
			WebElement addToBag= driver.findElement(By.xpath("(//button[@class='combo-add-to-btn prdt-des-btn js--toggle-sbag nk-btn nk-btn-rnd atc-simple m-content__product-list__cart-btn  '])[1]"));
			addToBag.click();
			Thread.sleep(3000);
			System.out.println("product Added to bag is successfully verified: " + driver.findElement(By.xpath("(//div[@class='add-to-bag-message']/div)[1]")).getText());
			driver.findElement(By.xpath("//div[@class='cursor-hand arrowup-tooltip']")).click();
			WebElement grandTotal= driver.findElement(By.xpath("//div[@class='first-col']//div[@class='value']"));
		    Thread.sleep(3000);
		    String text=grandTotal.getText();
		    text=text.replaceAll("[^0-9]","");
			System.out.println("Grand Total: "+ text);
			driver.findElement(By.xpath("//button[@class='btn full fill no-radius proceed ']")).click();
			driver.findElement(By.xpath("//button[@class='btn full big']")).click();
			driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Anju");
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ann@gmail.com");
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9952504424");
			driver.findElement(By.xpath("//input[@name='pinCode']")).sendKeys("600028");
			driver.findElement(By.xpath("(//legend[text()='Address']/following::textarea)[1]")).sendKeys("Triplicane");
			driver.findElement(By.xpath("//button[@class='btn full fill no-radius proceed big']")).click();
			System.out.println("card number not entered the following message is displayed: "+ driver.findElement(By.xpath("(//span[@class='field-error']")).getText());
			System.out.println("card number expiry year not entered the following message is displayed: "+ driver.findElement(By.xpath("(//span[@class='field-error'])[2]")).getText());
			System.out.println("card CVV not entered the following message is displayed: "+ driver.findElement(By.xpath("(//span[@class='field-error'])[2]")).getText());
			Thread.sleep(3000);
	
		driver.close();
			
	}}