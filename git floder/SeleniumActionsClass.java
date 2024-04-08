package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumActionsClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MOHAN CHOWDARY\\Documents\\0_SeleniumFiles\\2_Eclipseworkpath\\Seleniumproject\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
driver.navigate().to("https://www.amazon.in/");

		

		

		// To perform mouse related operations - Mouseover , Rightclick 

		// Actions is a class used to perform mouse related operations.

		

		Actions obj = new Actions(driver);

		

		// To move the mouse to the specified element

		obj.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-amazonprime']"))).build().perform();

		

		// To right click on any element

		obj.contextClick(driver.findElement(By.xpath("//a[text()='Best Sellers']"))).build().perform();

		

		

		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");

		

		//To drag and drop and element

		

		WebElement source = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));

		WebElement destination = driver.findElement(By.xpath("//*[@id='bank']"));

		

		obj.dragAndDrop(source, destination).build().perform();

		


	}

}
