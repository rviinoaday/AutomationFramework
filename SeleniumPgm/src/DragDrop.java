import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver(); //rtp
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(6000);
		
		System.out.println(driver.getTitle());
		
		WebElement sp = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		WebElement target = driver.findElement(By.id("bank"));
		
		
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(sp, target).perform();
		
		//act.contextClick() //righ click 

	}

}
