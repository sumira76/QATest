package session4;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIframe {
	@Test
	public void handleiframe() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\wp20\\w2020\\MavenProject1\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("java.applet")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		
		driver.findElement(By.linkText("AppletStub")).click();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		

		
		
	}

}
