import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver(); //rtp
		
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
		
		Thread.sleep(6000);
		
		System.out.println(driver.getTitle());
		
	WebElement accountlist = 	driver.findElement(By.xpath("//span[text()='Account & Lists']"));
	
	Actions act = new Actions(driver);
	
	act.moveToElement(accountlist).perform();
	
	driver.findElement(By.xpath("//span[text()='Your Account']")).click();
	
}
}
