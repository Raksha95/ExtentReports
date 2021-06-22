package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomepage {

	WebDriver driver;

	public RediffHomepage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='srchword']")
	WebElement Search;

	@FindBy(xpath = "//input[@class='newsrchbtn']")

	WebElement submit;

	public WebElement search() {

		return Search;
	}

	public WebElement Submit() {

		return submit;
	}
}