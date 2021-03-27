package week2.day2;


import java.io.IOException;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class CreateContact {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Anju");
		driver.findElement(By.id("lastNameField")).sendKeys("kv");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("liya");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("ann");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("cs");
		driver.findElement(By.name("description")).sendKeys("comp");
		driver.findElement(By.name("primaryEmail")).sendKeys("an@gmail.com");
		WebElement ele = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select dd = new Select(ele);
				dd.selectByVisibleText("Alaska");
					 
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("imp");
		WebElement El6 = driver.findElement(By.xpath("//input[@value='Update']"));
		El6.click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		
	}

}
