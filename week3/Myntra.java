package week3.day2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.xpath("(//a[@class='desktop-main'])[2]"));
		action.moveToElement(we).build().perform();
		driver.findElement(By.linkText("Jackets & Coats")).click();
		String items = driver.findElement(By.xpath("//h1[text()='Coats & Jackets For Women']/following-sibling::span")).getText();
		System.out.println("Total count of Jackets & Coats " + items);
		List<WebElement> sumofcat = driver.findElements(By.xpath("//ul[@class='categories-list']/li/label"));
		List<Integer> number = new ArrayList<Integer>();
		int count = 2; 
		for(WebElement name : sumofcat)
		{
			String categories= name.getText().replaceAll("\\D", "");
			number.add(Integer.parseInt(categories));
		}
		if(number.size()==count)
		{
			System.out.println("The sum of categories count is matched successfully");
			driver.findElementByXPath("(//div[@class='common-checkboxIndicator'])[2]").click();
			driver.findElementByXPath("//div[@class='brand-more']").click();
			driver.findElement(By.className("FilterDirectory-searchInput")).sendKeys("MANGO");
			driver.findElement(By.xpath("//span[@class='FilterDirectory-count']/following-sibling::div[1]")).click();
			driver.findElement(By.xpath("//ul[@class='FilterDirectory-indices']/following-sibling::span[1]")).click();
			WebElement element = driver.findElementByXPath("//div[contains(text(),'MANGO')]");
			Boolean a = element.isDisplayed();
			System.out.println("All coats are of Mango brand " +a);
			driver.findElement(By.xpath("(//label[@class='sort-label '])[3]")).click();
			String rs = driver.findElement(By.xpath("//span[@class='product-discountedPrice']/following-sibling::span")).getText();
			System.out.println("Price of first displayed item " + rs);
			Actions action1 = new Actions(driver);
			WebElement we1 = driver.findElement(By.xpath("(//h4[@class='product-sizes']"));
			action.moveToElement(we1).build().perform();
			driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
			driver.close();
		}
		}
	}
