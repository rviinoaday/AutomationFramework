import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver(); //rtp
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().frame("a077aa5e");
		
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("abc@gmail.com");
		
		

	}

}
