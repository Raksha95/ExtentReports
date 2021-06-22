package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffHomepage;
import objectrepository.RediffLoginPage;

public class Loginapplication {
	// Login page class- Normal page object pattern , Homepage- PageFactory method
	@Test

	public void Login() {

		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver4.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		RediffLoginPage rd = new RediffLoginPage(driver);

		rd.EmailId().sendKeys("rediffuser@mailinator.com");

		rd.Password().sendKeys("1234");

		rd.SignIn().click();

		rd.Home().click();

		RediffHomepage rp = new RediffHomepage(driver);

		rp.search().sendKeys("Movies");

		rp.Submit().click();
	}
}
