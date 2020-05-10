package tFCRMtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\wp20\\w2020\\MavenProject1\\Drivers\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		//implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)	;
		
		//delete cookies and history
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
	    driver.manage().window().maximize();
	    
		
		driver.findElement(By.linkText("SIGN-ON")).click();
		
         driver.findElement(By.name("userName")).sendKeys("mercury");
          
		driver.findElement(By.name("password")).sendKeys("mercury");
		
		driver.findElement(By.name("login")).click();
		
		
		
		
	}

}
