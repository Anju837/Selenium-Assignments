package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		WebElement index=driver.findElement(By.id("dropdown1")); 
		Select a= new Select(index); 
		a.selectByIndex(2); 
		WebElement text=driver.findElement(By.name("dropdown2")); 
		Select b= new Select(text); 
		b.selectByVisibleText("Loadrunner"); 
		
		WebElement value=driver.findElement(By.name("dropdown3"));
		Select c= new Select(value);
		c.selectByValue("2");
		c.selectByValue("3"); 
		WebElement option=driver.findElement(By.className("dropdown")); 
		Select d=new Select(option);
		java.util.List<WebElement> optin = d.getOptions();
		System.out.println(" options present " +optin.size());
		WebElement sele= driver.findElement(By.xpath("//option[text()='You can also use sendKeys to select']/following-sibling::option[3]"));
		sele.click();
		driver.findElement(By.xpath("//option[text()='Select your programs']/following-sibling::option[3]")).click();
	}}
