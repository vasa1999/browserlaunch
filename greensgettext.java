package org.adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class greensgettext {
		
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\VASANTH\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver ();
	driver.get("http://greenstech.in/selenium-course-content.html");


	WebElement clickbutton = driver.findElement(By.id("overview-tab"));
	clickbutton.click();

	WebElement printtext = driver.findElement(By.xpath("//p[contains(text(),'Greens Technologies Selenium training class will make you an expert i')] "));
	String String = printtext.getText();
	System.out.println(String);

driver.quit();
	}
	}

	
	
	

