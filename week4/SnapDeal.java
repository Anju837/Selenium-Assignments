package week4.day1;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.internal.runners.model.EachTestNotifier;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.Ordering;

import io.cucumber.messages.internal.com.google.protobuf.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
public class SnapDeal {
	private static RemoteWebDriver javascript;

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com");
		driver.manage().window().maximize();
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement mensfashion = driver.findElement(By.xpath("(//span[@class='catText'])[6]"));
		Actions action = new Actions(driver);
		action.moveToElement(mensfashion).perform();
		Thread.sleep(2000);
		// Go to Sports Shoes
				WebElement sportsShoes = driver.findElement(By.xpath("(//div[@id='category6Data']//p[2]/a/span)[1]"));
				action.moveToElement(sportsShoes).click().perform();

				// Get the count of the sports shoes
				WebElement count = driver.findElement(By.xpath("//h1[@class='category-name']/span"));
				Thread.sleep(3000);
				String sportshoesCount = count.getText();
				sportshoesCount = sportshoesCount.replace("(", "");
				sportshoesCount = sportshoesCount.replace("Items)", "");
				System.out.println("Sports shoes count: " + sportshoesCount);

				// Click Training shoes
				driver.findElement(
						By.xpath("(//ul[@class='child-cat-wrapper  cat-wrapper'])[1]/li//div[text()='Training Shoes']"))
						.click();
				Thread.sleep(5000);

				// Sort by Low to High
				driver.findElement(By.xpath("//div[@class='sorting-sec animBounce']")).click();
				driver.findElement(By.xpath("//ul[@class='sort-value']/li[2]")).click();
				Thread.sleep(2000);

				// verify if the order properly displayed
				wait.until(ExpectedConditions
						.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='product-desc-rating ']//div//span[2]")));
				List<WebElement> sorted = driver.findElements(By.xpath("//div[@class='product-desc-rating ']//div//span[2]"));
				System.out.println("Total training shoes present in the page: " + sorted.size());
				WebElement firstPrice = driver.findElement(By.xpath("(//div[@class='product-desc-rating ']//div//span[2])[1]"));
				String firstPriceText = firstPrice.getText();
				firstPriceText = firstPriceText.replaceAll("[^0-9]", "").replaceAll("\\s", "");
				int firstValue = Integer.parseInt(firstPriceText);

				for (int i = 0; i < sorted.size(); i++) {

					String text = sorted.get(i).getText();
					text = text.replaceAll("[^0-9]", "").replaceAll("\\s", "");
					int text1 = Integer.parseInt(text);
					if (text1 < firstValue) {
						System.out.println("The items not sorted Correctly: " + i);
					} else {
						System.out.println(text1 + "--->" + i);
					}
				}

				// select the brand Puma
				driver.findElement(By.xpath("//input[@class='sd-input js-searchable-box']")).click();
				WebElement puma = driver.findElement(By.xpath("//div[@class='brand-filter-columns']//input[@id='Brand-Puma']"));
				javascript.executeScript("arguments[0].click();", puma);
				WebElement applyButton = driver.findElement(By.xpath("//div[text()='APPLY']"));
				javascript.executeScript("arguments[0].click();", applyButton);

				// Check if the items displayed are sorted correctly
				System.out.println("---------------------------------------------------");
				try {
					wait.until(ExpectedConditions
							.visibilityOfAllElementsLocatedBy(By.xpath("//span[@class='lfloat product-price']")));
				} catch (Exception e) {
					driver.findElement(By.xpath("//span[@class='lfloat product-price']"));
				}
				List<WebElement> sortedPuma = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
				System.out.println("Total Puma shoes present in the page: " + sortedPuma.size());
				WebElement firstPricePuma = driver.findElement(By.xpath("(//span[@class='lfloat product-price'])[1]"));
				String firstPumaPriceText = firstPricePuma.getText();
				firstPumaPriceText = firstPumaPriceText.replaceAll("[^0-9]", "").replaceAll("\\s", "");
				int pumaFirstValue = Integer.parseInt(firstPumaPriceText);
		try
		{
				for (int i = 0; i < sortedPuma.size(); i++) {

					String textPuma = sortedPuma.get(i).getText();
					textPuma = textPuma.replaceAll("[^0-9]", "").replaceAll("\\s", "");
					int pumaText1 = Integer.parseInt(textPuma);
					if (pumaText1 < firstValue) {
						System.out.println("The items not sorted Correctly: " + i);
					} else {
						System.out.println(pumaText1 + "--->" + i);
					}
				}
		}
		catch(Exception e)
		{
			driver.findElements(By.xpath("//span[@class='lfloat product-price']"));	
		}

				// Mouse Hover on puma Blue Training shoes
				WebElement pumaTraining = driver.findElement(By.xpath("(//img[@title='Puma Blue Training Shoes'])[1]"));
				Actions action1 = new Actions(driver);
				action.moveToElement(pumaTraining).perform();

				// click QuickView button
				WebElement QuickView = driver
						.findElement(By.xpath("((//a[contains(@href,'puma-blue-training-shoes')])[1]/..//div)[3]"));
				javascript.executeScript("arguments[0].click();", QuickView);

				// Print the cost and the discount percentage
				System.out.println("Cost of PUMA Training shoe: " + driver
						.findElement(By.xpath("(//div[@class='product-price pdp-e-i-PAY-l clearfix']/span)[1]")).getText());
				System.out.println("Discount percentage of PUMA Training shoe: " + driver
						.findElement(By.xpath("(//div[@class='product-price pdp-e-i-PAY-l clearfix']/span)[2]")).getText());

				// Take the snapshot of the shoes.
				File source = driver.getScreenshotAs(OutputType.FILE);
				File destination = new File("PUMA shoe.png");
				FileUtils.copyFile(source, destination);

				// Close the current window
				driver.findElement(By.xpath("//div[@class='close close1 marR10']/i")).click();

				// Close the main window
				driver.close();

			}

		}


