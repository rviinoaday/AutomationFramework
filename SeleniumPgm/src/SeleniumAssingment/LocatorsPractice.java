package SeleniumAssingment;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.co.uk/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	
		// XPath by using text  //tagname[text()='text value'][1]
		driver.findElement(By.xpath("//a[text()='Best Sellers'][1]")).click();
		System.out.println(driver.findElement(By.xpath(" //span[text()='Amazon Best Sellers']")).getText());
		driver.navigate().back();
		//tagname[@attribute= 'value']
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Macbook");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	
		//tagname[contains(text(),'search value')]
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'results')]")).getText());
		driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
		driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).click();
		System.out.println(driver.getTitle());
	WebElement element=	driver.findElement(By.xpath("//i[@class='a-icon a-icon-next-rounded']"));
	for (int i=0;i<5;i++)
	{
		element.click();
		
	}
		driver.quit();
		
	
	}

}
