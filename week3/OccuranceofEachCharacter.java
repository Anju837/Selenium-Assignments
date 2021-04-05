package week3.day2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OccuranceofEachCharacter {
	public static void main(String[] args) {
		
		String name = "Anjuvarghese";
		char[] charArray = name.toCharArray();
		Map<Character, Integer> a = new HashMap<Character, Integer>();
		for (int i = 0; i < charArray.length; i++) {
			if (a.containsKey(charArray[i]))
			{
				a.put(charArray[i], a.get(charArray[i]) + 1);
			}
			else {
				a.put(charArray[i], 1);
			}
		}
		
		System.out.println(a);

	}}