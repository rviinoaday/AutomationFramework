package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DoubleclickAssingment {

	WebDriver driver;

	@BeforeClass //Run before class
	public void MouseAction() {
		
		driver = new ChromeDriver(); //rtp
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
	}
		@Test (priority=1)
		public void DoubleClick() throws InterruptedException
		{
			Thread.sleep(3000);
			
			System.out.println(driver.getTitle());
			WebElement rt=driver.findElement(By.xpath("//span[text()='right click me']"));
			WebElement dc=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
			Actions act=new Actions(driver);
			act.contextClick(rt).perform();
			Thread.sleep(2000);
			act.doubleClick(dc).perform();
			
		}
		
		
		@Test (priority=2)
		public void AlertText() throws InterruptedException
		{
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
			WebElement rt=driver.findElement(By.xpath("//span[text()='right click me']"));
			WebElement dc=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
			Actions act=new Actions(driver);
			//act.contextClick(rt).perform();
			act.doubleClick(dc).perform();
			Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
		}
		
		
		
		
		@AfterClass //Run after class
		public void CleanUp() 
		{
			driver.quit();
		
		}

}
