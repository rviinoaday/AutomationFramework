package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AdvanceDropDownAssingment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver(); 

		driver.get("https://www.amazon.in");

		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement accountlist = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		Actions act = new Actions(driver);
		act.moveToElement(accountlist).perform();
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='nav-title']|//a[@class='nav-link nav-item']"));// use findElements for multiple webelement capture

		System.out.println(options.size());
		for(int i = 0 ; i<options.size() ;i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		driver.quit();
// Printing Your list options here 

		
		
	}
}
		