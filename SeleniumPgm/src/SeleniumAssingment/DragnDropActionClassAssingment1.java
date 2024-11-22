package SeleniumAssingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDropActionClassAssingment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); //rtp
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		WebElement target=driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement targetamount=driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement destination=driver.findElement(By.id("bank"));
		WebElement destAmount=driver.findElement(By.id("amt7"));
		
		WebElement sales=driver.findElement(By.xpath("//a[text()=' SALES ']"));
		
		WebElement Sdestination =driver.findElement(By.id("loan"));
		WebElement Saleseamount=driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement Samountdest=driver.findElement(By.id("amt8"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(target, destination).perform();
		act.dragAndDrop(targetamount, destAmount).perform();
		
		
		 String act_amount=driver.findElement(By.id("t7")).getText();
			
			if(act_amount.equals("5000"))
			{
			
			System.out.println("Bank Amount Dragged succesfully");
			}
			else 
			{
				System.out.println("Bank Amount  NOT Dragged ");
			}
		act.dragAndDrop(sales, Sdestination).perform();
		act.dragAndDrop(Saleseamount,Samountdest).perform();
		 String act_amounts=driver.findElement(By.id("t8")).getText();
		
		if(act_amounts.equals("5000"))
		{
		
		System.out.println("Sales Amount Dragged succesfully");
		}
		else 
		{
			System.out.println("Salse Amount  NOT Dragged ");
		}
		
		Thread.sleep(2000);
		String result=driver.findElement(By.xpath("//a[text()='Perfect!']")).getText();
		if(result.equals("Perfect!"))
		{
			System.out.println("Dragged and Droped succesfully....."+result);
		}
		else {
			System.out.println("Dragged and Droped Failed"+result);
		}
		
		driver.quit();
		
	}

}
