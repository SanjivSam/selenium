package practiceSteps;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		for(Iterator<WebElement> i = glcp.getLangName().iterator();i.hasNext();) {
			System.out.println("Language Name :" + i.next());
		}
		glcp.getLangName();
		for(Iterator<WebElement> i = glcp.getLangName().iterator();i.hasNext();) {
			System.out.println("Language Name :" + i.next());
		}
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
