package practiceSteps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import drivers.BrowserLauncher;
import practicePages.GoogleLangChangePage;

public class GoogleLangChangeSteps {
	WebDriver driver;
	GoogleLangChangePage glcp;
	

	@Test
	public void launchUrl() throws InterruptedException {
		driver.get("http://www.gmail.com");
		Thread.sleep(3000);
		glcp.clickLangChooser();
		glcp.getLangList();
	}

	@BeforeTest
	public void beforeTest() {
		driver = BrowserLauncher.getDriver("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		glcp=PageFactory.initElements(driver,GoogleLangChangePage.class);
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
