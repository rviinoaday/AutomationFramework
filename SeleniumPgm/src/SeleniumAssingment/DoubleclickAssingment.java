package SeleniumAssingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleclickAssingment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver(); //rtp
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		WebElement rt=driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement dc=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions act=new Actions(driver);
		act.contextClick(rt).perform();
		act.doubleClick(dc).perform();
		

	}

}
