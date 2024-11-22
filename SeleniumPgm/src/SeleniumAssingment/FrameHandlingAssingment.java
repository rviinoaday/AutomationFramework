package SeleniumAssingment;
import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FrameHandlingAssingment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.guru99.com/live-selenium-project.html");
		driver.manage().window().maximize();
	
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.switchTo().frame("sp_message_iframe_1200865");
		String TextValue = driver.findElement(By.xpath("//div[@id='notice']")).getText();
		
		System.out.println(TextValue);
					
		//Thread.sleep(3000);
		//System.out.println(driver.findElement(By.xpath("We value your privacy")).getText());
		driver.findElement(By.xpath("//button[@title='Accept']")).click();
		driver.quit();
	}

}
