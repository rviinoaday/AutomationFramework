package SeleniumAssingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatorsPradctice2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.apple.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("ac-ls-continue")).click();
        String act_title=driver.getTitle();
        if(act_title.equals("Apple"))
        {
            System.out.println("Test Passed Actual title is ...."      +act_title);
        }
        else
        {
            System.out.println("Test Failed ..... Actual title is different than Expected "+act_title);
        }
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//span[@class='globalnav-link-text-container'])[2]")).click();
        System.out.println(driver.getTitle());
     
        driver.findElement(By.xpath("(//span[@class='globalnav-link-text-container'])[5]")).click();
        System.out.println(driver.getTitle());

        driver.quit();
    }



	}


