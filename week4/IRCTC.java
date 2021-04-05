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
public class IRCTC {
	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.linkText("FLIGHTS")).click();
		Set allwindow =driver.getWindowHandles();
		List<String> l=new ArrayList<String>(allwindow);
		driver.switchTo().window(l.get(1));
		System.out.println("Customer Email ID: " + driver.findElement(By.xpath("//div[@class='navbar-nav-right text-center text-sm-center text-md-right ']/div[2]/a")).getText());
		driver.switchTo().window(l.get(0));
		driver.close();
		
		
		
	}}