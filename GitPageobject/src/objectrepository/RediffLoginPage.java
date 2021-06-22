package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {

	WebDriver driver;

	public RediffLoginPage(WebDriver driver) {

		this.driver = driver;
	}

	By username = By.xpath("//input[@name='login']");

	By password = By.xpath("//input[@name='passwd']");

	By signin = By.xpath("//input[@value='Sign in']");

	By Home = By.linkText("rediff.com");

	public WebElement EmailId() {

		return driver.findElement(username);
	}

	public WebElement Password() {

		return driver.findElement(password);
	}

	public WebElement SignIn() {

		return driver.findElement(signin);
	}

	public WebElement Home() {

		return driver.findElement(Home);
	}

}