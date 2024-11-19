package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StealElementexception {

	@Test(priority = 2)
	public void HomeEssential() throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com");

		driver.manage().window().maximize();

		Thread.sleep(6000);

		List<WebElement> options = driver
				.findElements(By.xpath("//div[div[h666[text()='Shop for your home essentials']]]//a[@aria-label]"));
		System.out.println(options.size());

		for (int i = 0; i < options.size(); i++) {
			options = driver
					.findElements(By.xpath("//div[div[h2[text()='Shop for your home essentials']]]//a[@aria-label]"));
			options.get(i).click();
			System.out.println(driver.getTitle());
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(3000);

		}
		driver.quit();

	}

	@Test(priority = 1)
	public void Fashion() throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com");

		driver.manage().window().maximize();

		Thread.sleep(5000);
		List<WebElement> options = driver
				.findElements(By.xpath("//div[div[h66[text()='Shop deals in Fashion']]]//a[@aria-label]"));
		System.out.println(options.size());

		for (int i = 0; i < options.size(); i++) {
			options = driver.findElements(By.xpath("//div[div[h2[text()='Shop deals in Fashion']]]//a[@aria-label]"));
			options.get(i).click();
			System.out.println(driver.getTitle());
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(3000);

		}

		driver.quit();
	}

}
