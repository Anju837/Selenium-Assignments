package week2.day1;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("an@gmail.com");
		driver.findElement(By.name("username")).getAttribute("value");
		System.out.println(driver.findElementByName("username").isEnabled());
		
		driver.get("http://leafground.com/pages/Link.html");
		System.out.println(driver.findElementByLinkText("Verify am I broken?").getAttribute("href"));
		 driver.get("http://leafground.com/pages/Button.html");
		 System.out.println(driver.findElement(By.id("color")).getLocation());
		 System.out.println(driver.findElement(By.id("color")).getSize());

	}

}
