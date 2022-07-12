package toggleAndBoxes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge {
	static WebDriver driver;
	int count = 0;

	@Before
	public static void launchBrowser() throws InterruptedException {
		System.out.println("before method");
		System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
		// WebDriver
		driver = new EdgeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://techfios.com/test/102/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		// driver.close();
		// driver.findElement(By.xpath("/html/body/div[3]/input[3]")).click();
	}

	@Test
	public void ValidateBoxesAreChecked() throws InterruptedException {
		launchBrowser();
		System.out.println("Check the status");
		WebElement checkBoxSelected = driver.findElement(By.name("allbox"));
		boolean isSelected = checkBoxSelected.isSelected();
		// (By.cssSelector("body > div.controls > input[type=checkbox]:nth-child(3)"));
		// performing click operation if element is not selected
		if (isSelected == false) {
			checkBoxSelected.click();
		}

		/**
		 * Validate isDisplayed and click
		 */
		WebElement checkBoxDisplayed = driver.findElement(By.name("allbox"));
		boolean isDisplayed = checkBoxDisplayed.isDisplayed();

		// performing click operation if element is displayed
		if (isDisplayed == true) {
			checkBoxDisplayed.click();
		} else
			System.out.println("not displayed");

		/**
		 * Validate isEnabled and click
		 */
		WebElement checkBoxEnabled = driver.findElement(By.name("allbox"));
		boolean isEnabled = checkBoxEnabled.isDisplayed();

		// performing click operation if element is enabled
		if (isEnabled == true) {
			checkBoxEnabled.click();
			System.out.println(
					"Thank you, just checking on the status of the automation, if you this message, it means the program is correct");
		}
		//*[@id="todos-content"]/form
		////div[@class='controls']
		//ohash
		List<WebElement> checkbox = driver.findElements(By.xpath("//*[@id=\"todos-content\"]/form"));
		for (int i = 0; i < checkbox.size(); i++) {
			WebElement ele = checkbox.get(i);
			String id = ele.getAttribute("id");
			if (id.equalsIgnoreCase("code")) {
				ele.click();
				break;}}
		System.out.println(checkbox.size());
		System.out.println(checkbox.size());
		System.out.println(checkbox.size());
		System.out.println(checkbox.size());
		System.out.println(checkbox.size());
		System.out.println(checkbox.size());
		System.out.println(checkbox.size());
		System.out.println(checkbox.size());
		System.out.println(checkbox.size());
	}

	public void VerifyIfCheckboxesAreChecked() {
		List<WebElement> checkbox = driver.findElements(By.name("ohash")); // //*[@id="todos-content"]
		for (int i = 0; i < checkbox.size(); i++) {
			count = count+i;
			WebElement ele = checkbox.get(i);
			String id = ele.getAttribute("id");
			if (id.equalsIgnoreCase("code")) {
				ele.click();
				
				break;
			
		}
			
		
		}
		System.out.println(count+5);
		}}
	
