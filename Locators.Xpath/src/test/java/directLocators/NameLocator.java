package directLocators;
import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class NameLocator {
		WebDriver driver;

		@BeforeTest
		public void openBrowser() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.wichita.edu/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}

		@Test
		public void classLocators() throws InterruptedException {
			driver.findElement(By.cssSelector(".utility-button")).click();
			driver.findElement(By.name("q")).sendKeys("Academic");
			Thread.sleep(3000L);
		}

		@AfterTest
		public void closeBrowser() {
			driver.close();
		}
	}


