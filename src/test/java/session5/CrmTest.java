package session5;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrmTest {
	
		
		@Test
		public void handleiframe() throws InterruptedException{
			System.setProperty("webdriver.chrome.driver", "C:\\wp20\\w2020\\MavenProject1\\Drivers\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			driver.manage().deleteAllCookies();
			driver.get(" http://techfios.com/test/billing/?ng=admin/");
			driver.manage().window().maximize();
//			driver.findElement(By.name("username")).sendKeys("techfiosdemo@gmail.com");
//			driver.findElement(By.name("password")).sendKeys("abc123");
//			driver.findElement(By.name("login")).click();
			
			WebElement usernamefield=driver.findElement(By.xpath("//input[@id='username']"));
			WebElement passwordfield=driver.findElement(By.xpath("//input[@id='password']"));
			WebElement loginfield=driver.findElement(By.xpath("//button[@name='login']"));
		
			By USER_NAME_FIELD=By.xpath("//input[@id='username']");

			By password__FIELD=By.xpath("//input[@id='password']");
			By login_field=By.xpath("//button[@name='login']");
			
			//Data
			
			String logid="techfiosdemo@gmail.com";
			String password="abc123";
			
			driver.findElement(USER_NAME_FIELD).sendKeys(logid);
			driver.findElement(password__FIELD).sendKeys(password);
			//driver.findElement(by)
			
			
			
			
		
		}
	

}
