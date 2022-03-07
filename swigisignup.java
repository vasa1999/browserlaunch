package org.adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swigisignup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VASANTH\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.swiggy.com/");
	//	driver.manage().window().maximize();
		WebElement button = driver.findElement(By.xpath("//a[@class=\"r2iyh\"]"));
	button.click();
	
	WebElement phonenumber= driver.findElement(By.id("mobile"));
	phonenumber.sendKeys("9768116100");
	

	WebElement name = driver.findElement(By.name("name"));
	name.sendKeys("vasanth");
	
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("divasavasa@gmial.co");
	
	WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("221601276");
		
		WebElement clickbutton = driver.findElement(By.className("_3GOZo"));
		clickbutton.click();
		
		WebElement referalcode = driver.findElement(By.id("referral"));
		referalcode.sendKeys("121wE");
		
		WebElement clickcountinue = driver.findElement(By.className("a-ayg"));clickbutton.click();
		
		driver.quit();
		
		
	}

}
