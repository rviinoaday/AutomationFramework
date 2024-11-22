package SeleniumAssingment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		// Create a object refrecnce to open Chrome browser
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.co.uk/");
		driver.manage().deleteAllCookies();
		
		Thread.sleep(3000);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.quit();
		

	}

}
