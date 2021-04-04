package week3.day2;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.internal.runners.model.EachTestNotifier;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.messages.internal.com.google.protobuf.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
public class Diappear {
	public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//("http://leafground.com/pages/disapper.html");
		driver.get("http://leafground.com/pages/disapper.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement disappear =driver.findElement(By.id("btn"));
		wait.until(ExpectedConditions.invisibilityOf(disappear));
		System.out.println(disappear.isDisplayed());
		
	}

	}


