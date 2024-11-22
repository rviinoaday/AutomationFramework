package SeleniumAssingment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class StealExceptionAssingment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); //rtp
		
		driver.get("http://www.amazon.com/");
		
		driver.manage().window().maximize();
		String ptitle=driver.getTitle();
		System.out.println(ptitle);
		
		Thread.sleep(8000);
		//driver.getTitle();
		
		List<WebElement> options = driver.findElements(By.xpath("//div[div[h2[text()='Gaming accessories']]]//a[@aria-label]"));
		//Select sel = new Select((WebElement) options);
		//List<WebElement> li = sel.getOptions();
		System.out.println(options.size());
		
		for(int i=0;i<options.size();i++) 
		{
			options = driver.findElements(By.xpath("//div[div[h2[text()='Gaming accessories']]]//a[@aria-label]"));
			options.get(i).click(); //dom structure
			Thread.sleep(2000);
			driver.navigate().back(); //revert Refresh dom structur
			
			Thread.sleep(4000);
		}
		
		
		//driver.quit();
	}

}
