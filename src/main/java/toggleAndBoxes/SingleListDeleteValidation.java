package toggleAndBoxes;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import junit.framework.Assert;

public class SingleListDeleteValidation {
	static WebDriver driver;
	@Before
	public void LaunchBrowser2() throws InterruptedException  {
		//toggleAndBoxes.LaunchEdge.launchBrowser();
		System.out.println("before method");
		System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
		//WebDriver
		driver = new EdgeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://techfios.com/test/102/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
	}
	@Test
	public void ValidateBoxesAreChecked() throws InterruptedException {
		   LaunchBrowser2();
		   System.out.println("Check the status");
		   driver.findElement(By.name("todo[4]")).click();
		   driver.findElement(By.xpath("/html/body/div[3]/input[1]")).click();
		   
		   By DASHBOARD_HEADER_FIELD = By.xpath("//*[@id=\"label-first\"]/b");
		   Assert.assertTrue("wrong page!!!", driver.findElement(DASHBOARD_HEADER_FIELD).isDisplayed());
		   // validation"
		   
		   

	
	}
}
