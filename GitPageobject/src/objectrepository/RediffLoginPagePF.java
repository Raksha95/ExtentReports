package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagePF {

	WebDriver driver;

	public RediffLoginPagePF(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	/*
	 * By username = By.xpath("//input[@name='login']");
	 * 
	 * By password = By.xpath("//input[@name='passwd']");
	 * 
	 * By signin = By.xpath("//input[@value='Sign in']");
	 * 
	 * By Home = By.linkText("rediff.com");
	 */

	@FindBy(xpath = "//input[@name='login']")

	WebElement username;

	@FindBy(xpath = "//input[@name='passwd']")

	WebElement password;

	@FindBy(xpath = "//input[@value='Sign in']")

	WebElement signin;

	@FindBy(linkText = "rediff.com")
	WebElement Home;

	public WebElement EmailId() {

		return username;
	}

	public WebElement Password() {

		return password;
	}

	public WebElement SignIn() {

		return signin;
	}

	public WebElement Home() {

		return Home;
	}

}