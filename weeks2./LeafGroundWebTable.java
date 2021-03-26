package week2.day2;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class LeafGroundWebTable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
ChromeDriver driver =new ChromeDriver();
driver.get("http://www.leafground.com/pages/table.html");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

java.util.List<WebElement> Rows = driver.findElements(By.tagName("tr"));
	
	System.out.println("The size of the row:" +Rows.size());	
java.util.List<WebElement> colu = driver.findElements(By.tagName("th"));
	
	System.out.println("The size of the colm:"+colu.size());	
	java.util.List<WebElement> prog = driver.findElements(By.xpath("//table[@id='table_id']//tr[3]/td[2]"));
	for(WebElement inter : prog)
			 System.out.println("The progress value of Learn to interact with Elements:" +inter.getText());
	WebElement vital = driver.findElement(By.xpath("//table[@id='table_id']//tr[4]/td[3]/input"));
	vital.click();
	System.out.println("Checkbox:" +vital.isSelected());


}}
