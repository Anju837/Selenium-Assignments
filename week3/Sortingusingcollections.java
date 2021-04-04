package week3.day2;


import java.util.ArrayList;
import java.util.Collections;
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

public class Sortingusingcollections {
	public static void main(String[] args) {
		
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		List<String> companys = new ArrayList<String>();
		companys.add("HCL");
		companys.add("Wipro");
		companys.add("Aspire Systems");
		companys.add("CTS");
		System.out.println("Lenghth of the array :" +companys.size());	
	Collections.sort(companys);
	System.out.println(companys);
	for(int i=companys.size()-1;i>=0;i--)
	{

		System.out.print(companys.get(i) + ",");

	}
	
	
	}}
	