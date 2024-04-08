package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFileDownloads {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MOHAN CHOWDARY\\Documents\\0_SeleniumFiles\\2_Eclipseworkpath\\Seleniumproject\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();


        driver.navigate().to("https://the-internet.herokuapp.com/download");

		

		driver.findElement(By.xpath("//a[text()='sample-zip-file.zip']")).click();

		Thread.sleep(20000);

		

		driver.findElement(By.xpath("//a[text()='sample-zip-file.zip']")).click();

		

		// Here we will use the robot class to handle the desktop screens

		Robot rb = new Robot();

		Thread.sleep(3000);

		

		// to change the file name 

		rb.keyPress(KeyEvent.VK_A);

		Thread.sleep(2000);

		rb.keyPress(KeyEvent.VK_D);

		rb.keyPress(KeyEvent.VK_M);

		rb.keyPress(KeyEvent.VK_I);

		rb.keyPress(KeyEvent.VK_N);

		

		// to move to the save button in the popup

		rb.keyPress(KeyEvent.VK_TAB);

		rb.keyPress(KeyEvent.VK_TAB);

		

		// we need to click on save button

		rb.keyPress(KeyEvent.VK_ENTER);

	}

}
