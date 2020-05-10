package session5;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {;
WebDriver driver;
	@Test
	public void handleiframe() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\wp20\\w2020\\MavenProject1\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();
		driver.get(" https://www.yahoo.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.xpath("//input[@id='header-search-input']")).sendKeys("xpath");
		driver.findElement(By.xpath("//button[@id='header-desktop-search-button']")).click();
		driver.findElement(By.linkText("XPath Tutorial - W3Schools")).click();
		
		
		
		for(String i: driver.getWindowHandles()) {
			System.out.println(i);
			driver.switchTo().window(i);
		}
		
		driver.findElement(By.linkText("CSS")).click();
		for(String i: driver.getWindowHandles()) {
			System.out.println(i);
			driver.switchTo().window(i);
		}
		
		
		
		
}
}