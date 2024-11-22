import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver(); //rtp
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(6000);
		
		System.out.println(driver.getTitle());
		
		//driver.findElement(By.name("q")).sendKeys("Testing");
		
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
