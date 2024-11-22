package SeleniumAssingment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
	
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("333223");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		 Alert alert=driver.switchTo().alert();
		    System.out.println(alert.getText());
		    alert.accept();
		    System.out.println(alert.getText());
		    alert.accept();
		    driver.quit();
		    
	}

}
