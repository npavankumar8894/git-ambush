package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCheckBoxs {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MOHAN CHOWDARY\\Documents\\0_SeleniumFiles\\2_Eclipseworkpath\\Seleniumproject\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		

		driver.navigate().to("https://demo.guru99.com/test/radio.html");

		

		// To select first checkbox

		driver.findElement(By.xpath("//input[@value='checkbox1']")).click();

		

		// To select second checkbox

		driver.findElement(By.xpath("//input[@value='checkbox2']")).click();

		

		// To select third checkbox

		driver.findElement(By.xpath("//input[@value='checkbox3']")).click();



		driver.quit();



	}



}
		
		
		
		




