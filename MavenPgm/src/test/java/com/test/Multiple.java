package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Multiple {

	WebDriver driver;

	@BeforeClass
	public void Initalization() {
		driver = new ChromeDriver();

		driver.get("https://www.amazon.in");

		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void DropDown() {

		WebElement dropdownfield = driver.findElement(By.id("searchDropdownBox"));

		Select sel = new Select(dropdownfield);

		sel.selectByIndex(4);

		sel.selectByValue("search-alias=audible");

		sel.selectByVisibleText("Car & Motorbike");

	}

	@Test(priority = 2)
	public void AdvanceDropDown() {

		WebElement dropdownfield = driver.findElement(By.id("searchDropdownBox"));

		Select sel = new Select(dropdownfield);

		List<WebElement> li = sel.getOptions(); // all option tag stor into the list

		System.out.println(li.size());

		for (int i = 0; i < li.size(); i++) {
			li.get(i).click();
			System.out.println(li.get(i).getText());
		}

	}

	@AfterClass
	public void CleanUp() {
		driver.quit();
	}

}
