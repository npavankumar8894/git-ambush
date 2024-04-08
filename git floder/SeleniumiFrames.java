package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class SeleniumiFrames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MOHAN CHOWDARY\\Documents\\0_SeleniumFiles\\2_Eclipseworkpath\\Seleniumproject\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://demoqa.com/frames");


		//iFrames are nothing but different sections on the web page 

		// These are identified using the tagname "iframe"

		// Before performing any action on element present in a different frame then you need to switch to the frame first and then do the required action on the element

		// driver.switchTo().frame(id or index or class or element locator);



		// To switch to frame1

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame1']")));

		String heading =driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();

		System.out.println(heading);
		

		// To come out from all the frames

		driver.switchTo().defaultContent();

		String parentElementText=driver.findElement(By.xpath("//h1[@class='text-center']")).getText();

		System.out.println(parentElementText);


		// To switch to frame2

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame2']")));

		String heading2 =driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();

		System.out.println(heading2);

		// To switch to the parent frame

		driver.switchTo().parentFrame();

		driver.quit();

	}

}
