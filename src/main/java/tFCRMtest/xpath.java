package tFCRMtest;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	@Test
	public void validUserswillbeabletoadddeposit() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\wp20\\w2020\\MavenProject1\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("http://techfios.com/test/billing/?ng=admin");

		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("techfiosdemo@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("abc123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		//or
//		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("techfiosdemo@gmail.com");
//		driver.findElement(By.xpath("//input[contains(@placeholder,'assword')]")).sendKeys("abc123");
//		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
//		
		
	}
	}	
