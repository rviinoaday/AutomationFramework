import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdvanceDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver(); //rtp
		
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
		
		WebElement dropdownfield = driver.findElement(By.id("searchDropdownBox"));
		
		Select sel = new Select(dropdownfield);
		
		List<WebElement> li = sel.getOptions(); //all option tag store into the list
		
		System.out.println(li.size());
		
		for(int i = 0 ; i<li.size() ; i++)
		{
			li.get(i).click();
			System.out.println(li.get(i).getText());
		}
		
		//driver.findElements(null)

	}

}
