package session4;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BeforeTestAfter {
	WebDriver driver;
     @Before
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\wp20\\w2020\\MavenProject1\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();
		driver.get("https://www.dell.com/en-us");
		driver.manage().window().maximize();
     }
		

     
     @Test
     public void hoveroverTest() throws InterruptedException {;
     WebElement support_menu_element=driver.findElement(By.xpath("//button[@id='l5']"));
		By server_deals_LOCATOR=By.linkText("Server Deals");
		
		Actions action=new Actions(driver);
		action.moveToElement(support_menu_element).build().perform();
		
		driver.findElement(server_deals_LOCATOR).click();
		
		Thread.sleep(2000);
     }
     @Test
     public void hoveroverTest1() throws InterruptedException{;
     WebElement support_menu_element=driver.findElement(By.xpath("//button[@id='l5']"));
		By server_deals_LOCATOR=By.linkText("Server Deals");
		
		Actions action=new Actions(driver);
		action.moveToElement(support_menu_element).build().perform();
		
		driver.findElement(server_deals_LOCATOR).click();
		
		Thread.sleep(2000);
     }
     
     @After
     public void closeeverything() {
    	 driver.close();
    	 driver.quit();
     }
     
}
        
     
     
     
     
     
     
     
     
