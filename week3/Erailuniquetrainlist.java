package week3.day2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erailuniquetrainlist {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//("http://leafground.com/pages/disapper.html");
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("Chennai Egmore", Keys.ENTER);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("Vellore Town", Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> trainn = driver
				.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]"));
		
		List<String> s = new ArrayList<String>();
		for (WebElement trainlist : trainn) {

		s.add(trainlist.getText());
		
		}
		System.out.println("total rows: " +trainn.size());
		Set<String> unique = new HashSet<String>();
		unique.addAll(s);
		
//
		System.out.println("The size after adding the list into a new set is : " +unique.size());

		}

	}
	

