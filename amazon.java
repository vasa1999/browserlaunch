package org.adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VASANTH\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\VASANTH\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		//33WebElement clickbutton = driver.findElement(By.xpath(" //div[@id=\"heading20\"] "));
//		clickbutton.click();
		
		WebElement gettext = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
		 String text = gettext.getText();
		 
	    System.out.println(text);
	}

	
	
}
