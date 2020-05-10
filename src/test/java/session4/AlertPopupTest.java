package session4;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupTest {
	@Test
	public void handlePopUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\wp20\\w2020\\MavenProject1\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@name='FormName']/following-sibling::div/descendant::input[@value='Go']")).click();
  
		
		
		
	}

}
