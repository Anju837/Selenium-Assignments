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
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.messages.internal.com.google.protobuf.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
public class pepperfry {
	private static final String Selenium = null;
	private static RemoteWebDriver javascript;
	private static RemoteWebDriver js;

	public static void main(String[] args) throws IOException, InterruptedException {
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		//options.addArguments("--disable-popup-blocking");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);	
		driver.get("https://www.pepperfry.com/");
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@id='reg_login_box']//a[@class='popup-close'])[1]")));
		driver.findElementByXPath("(//div[@id='reg_login_box']//a[@class='popup-close'])[1]").click();
		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
		driver.findElementById("webklipper-publisher-widget-container-notification-close-div").click();
		driver.switchTo().defaultContent();
	
		Actions action1 = new Actions(driver);
		WebElement we1 = driver.findElement(By.xpath("//a[text()='Furniture']"));
		action1.moveToElement(we1).build().perform();
		driver.findElement(By.linkText("Office Chairs")).click();
		driver.findElement(By.xpath("(//h5[contains(@class,'clip-maincat-ttl pf-margin-0')])[2]")).click();
		driver.findElement(By.xpath("//input[@class='clipFilterDimensionHeightValue']")).clear();
	driver.findElement(By.xpath("//input[@class='clipFilterDimensionHeightValue']")).sendKeys("50", Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@data-productname='Galician High Back Executive Chair in Black Colour']")).click();
	Thread.sleep(2000);
	Actions action2 = new Actions(driver);
	WebElement we2 = driver.findElement(By.linkText("Bedroom"));
	action1.moveToElement(we2).build().perform();
	driver.findElement(By.xpath("//div[@id='meta-bedroom']/div[1]/div[4]/div[2]/div[3]/a[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//label[@for='brandsnameSpacewood']")).click();
	Thread.sleep(1000);
	WebElement pricecost = driver.findElement(By.xpath("//label[@for='price7000-8000']"));
	Actions amount = new Actions(driver);
	amount.moveToElement(pricecost).click().perform();
	 driver.findElement(By.xpath("//a[@data-productname='SOS Carter Study Table in Lorraine walnut & silver grey Finish']")).click();
	 driver.findElement(By.xpath("(//span[@class='header-nav-cnt count_alert']")).getText();
	 driver.findElement(By.xpath("//a[@class='wishlist_bar']")).click();
	 driver.findElement(By.xpath("(//div[@class='mini_cart capitalize active']//div[@class='item_details_holder']//a[@data-tooltip='Add to Cart'])[1]")).click();
	 driver.findElement(By.xpath("//a[text()='Proceed to pay securely ']")).click();
	 driver.findElement(By.id("pin_code")).sendKeys("600028");
	 driver.findElement(By.id("pin_check")).click();
	 driver.findElement(By.xpath("(//a[text()='PLACE ORDER'])[1]")).click();
	 File source= driver.getScreenshotAs(OutputType.FILE);
	    File dest= new File("Pepperfry.png");
	    FileUtils.copyFile(source, dest);
	    driver.close();
	
	}
}