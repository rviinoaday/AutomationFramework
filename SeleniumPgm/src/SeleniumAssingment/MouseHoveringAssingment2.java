package SeleniumAssingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoveringAssingment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver(); //rtp
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		String ptiltle=driver.getTitle();
		
		Thread.sleep(6000);
		System.out.println(ptiltle);
		
		//driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.xpath("//span[text()='Fashion']")).click();
		WebElement ele=driver.findElement(By.xpath("//span[text()='Men']"));
		Actions act= new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[text()='T-Shirts']")).click();
		Thread.sleep(6000);
		System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Men')]")).getText());
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Showing')]")).getText());
		System.out.println(driver.getTitle());
		driver.navigate().back();
		WebElement ele1=driver.findElement(By.xpath("//div[text()='More']"));
		act.moveToElement(ele1).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Advertise']")).click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
