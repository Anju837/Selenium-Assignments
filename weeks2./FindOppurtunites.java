package week2.day2;


import java.io.IOException;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindOppurtunites {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Opportunities")).click();
		driver.findElement(By.xpath("//a[text()='Find Opportunities']")).click();
		
		//java.util.List<WebElement> opp= driver.findElements(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-salesOpportunityId']"));
		java.util.List<WebElement> opp= driver.findElements(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-salesOpportunityId']"));
		for(WebElement oppurtunites : opp)
		{
			System.out.println(oppurtunites.getText());
		}
		String title1 = driver.getTitle();
		System.out.println(title1);
		
	}
}
