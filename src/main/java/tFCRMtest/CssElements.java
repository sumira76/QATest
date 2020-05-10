package tFCRMtest;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssElements {

	@Test
	public void handleCssElements() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\wp20\\w2020\\MavenProject1\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();

		driver.get("http://objectspy.space");

		driver.manage().window().maximize();
		//tag#id
		driver.findElement(By.cssSelector("input#sex-0")).click();;
		Thread.sleep(3000);
		//tag [attribute='value']
		driver.findElement(By.cssSelector("input[value='Female'")).click();
		//tag.class[attribute='value']
		driver.findElement(By.cssSelector("label.radio[for='sex-1']")).click();

//		driver.findElement(By.id("sex-1")).click();
//
//		Thread.sleep(3000);
//
//		driver.findElement(By.name("firstname")).sendKeys("sumira");
//
//		driver.findElement(By.partialLinkText("OS-API Product FrontEnd")).click();

	}

}
