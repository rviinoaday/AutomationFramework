package SeleniumAssingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoveringAssingment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); //rtp
		
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();
	
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//button[text()='Accept All']")).click();
		System.out.println(driver.getTitle());
		WebElement ele= driver.findElement(By.xpath("(//a[text()='Electronics'])[2]"));
		Actions act= new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='Apple iPhone'])")).click();
		String Ptitle=driver.getTitle();
		System.out.println(Ptitle);
		driver.findElement(By.xpath("//div[text()='iPhone 15 Pro Max']")).click();
		String iphone=driver.findElement(By.xpath("//h1[text()='iPhone 15 Pro Max']")).getText();
		System.out.println(iphone);
		System.out.println(Ptitle);
		driver.quit();
		
		

	}

}
