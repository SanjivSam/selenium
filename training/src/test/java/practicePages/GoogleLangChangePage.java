package practicePages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class GoogleLangChangePage {
	WebDriver driver;
	@FindBy(id = "lang-chooser")
	WebElement langChooser;
	@FindBys({ @FindBy(xpath = "//*[@class=\"vRMGwf oJeWuf\"]") })
	List<WebElement> langList;
	@FindBys({ @FindBy(tagName = "content") })
	List<WebElement> langName;

	public GoogleLangChangePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getLangChooser() {
		return langChooser;
	}

	public List<WebElement> getLangList() {
		return langList;
	}

	public List<WebElement> getLangName() {
		return langName;
	}

	public void clickLangChooser() {
		getLangChooser().click();
	}
}
