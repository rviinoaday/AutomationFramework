package SeleniumAssingment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortlistDropdownAssingment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		String ptitle = driver.getTitle();
		System.out.println(ptitle);
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='country']"));
		Select sel = new Select(dropdown);
		List<WebElement> li = sel.getOptions();
		System.out.println("Size of Country List is ..."+li.size());
		String ctry="INDIA"; //Declare the variable which we need to print until 
		for (int i = 0 ; i<li.size();i++) 
		{
			System.out.println("Printing Country name till India "+li.get(i).getText());
		
			if(li.get(i).getText().equalsIgnoreCase(ctry))
			{
				li.get(i).click();
				
				break;
			}
		
		}
		System.out.println("Selecting dropdown value as India ");
			
		//dropdown.click();
		//sel.selectByValue(ctry);
		//Thread.sleep(3000);
		//System.out.println(dropdown); // 
		driver.quit();

	}

}
