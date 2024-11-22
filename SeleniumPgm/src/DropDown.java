import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver(); //rtp
		
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
		
		WebElement dropdownfield = driver.findElement(By.id("searchDropdownBox"));
		
		Select sel = new Select(dropdownfield);
		
		sel.selectByIndex(4);
		
		sel.selectByValue("search-alias=audible");
		
		sel.selectByVisibleText("Car & Motorbike");
		
		

	}

}
