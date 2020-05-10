package homework4;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationAndAdd {
	@Test
	public void handleiframe() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\wp20\\w2020\\MavenProject1\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();
		driver.get(" http://techfios.com/test/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("techfiosdemo@gmail.com");
		driver.findElement(By.name("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		
		By CRM_link_LOCATOR=By.linkText("CRM");
		By ADD_CONTACT_LINK_LOCATOR=By.linkText("Add Contact");
		By FULL_NAME__LOCATOR=By.xpath("//input[@name='account']");
		By SUBMIT_LOCATOR=By.xpath("//button[@id='submit']");
		By List_Contacts_link_LOCATOR=By.linkText("List Contacts");
		
		driver.findElement(CRM_link_LOCATOR).click();
		driver.findElement(ADD_CONTACT_LINK_LOCATOR).click();
		Thread.sleep(2000);
		driver.findElement(FULL_NAME__LOCATOR).sendKeys("SMITI GHIMIRE");
		driver.findElement(SUBMIT_LOCATOR).click();
		
		Thread.sleep(2000);
		
		By CRM_link_LOCATOR1=By.linkText("CRM");
		driver.findElement(CRM_link_LOCATOR1).click();
		
		driver.findElement(List_Contacts_link_LOCATOR).click();
		
		
		
		Thread.sleep(2000);
		//driver.findElement(by)

}
}