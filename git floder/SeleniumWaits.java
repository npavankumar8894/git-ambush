package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaits {

	public static void main(String[] args) {
		
					
	System.setProperty("webdriver.chrome.driver",
							"C:\\Users\\MOHAN CHOWDARY\\Documents\\0_SeleniumFiles\\2_Eclipseworkpath\\Seleniumproject\\drivers\\chromedriver.exe");
								
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.amazon.in/");

		

		// In Selenium we have 3 different wait implementations.

		// Implicit Wait , Explicit Wait , Fluent wait

		// Implicit Wait - It will be common for all the commands in the class - Once defined each command execution will take the defined implicit wait

		// By default implicit wait is set to 0 .

		// Syntax

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		

		// Explicit wait - This kind of wait will be added for any specific element

		// we also give condition for explicit wait to check

		// syntax

		

		WebDriverWait wait = new WebDriverWait(driver, 60);

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//li[@class='a-carousel-card'])[4]"))));

		

		//wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("(//li[@class='a-carousel-card'])[4]"))));

		//wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("(//li[@class='a-carousel-card'])[4]"))));

		//wait.until(ExpectedConditions.attributeContains(driver.findElement(By.xpath("(//li[@class='a-carousel-card'])[4]")),"AttributeName","AttributeValue"));

		

		//Fluent wait - This kind of wait will be added for any specific element

		// we also give condition for explicit wait to check

		// We need to pass the polling time along with the max wait time

		// Polling time is the time interval given for the script to check for the condition status.

		

		FluentWait<WebDriver> fWait=new FluentWait<WebDriver>(driver);

		fWait.withTimeout (60,TimeUnit.SECONDS);

		fWait.pollingEvery (1, TimeUnit.SECONDS);

		fWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//li[@class='a-carousel-card'])[4]"))));

	}
}

