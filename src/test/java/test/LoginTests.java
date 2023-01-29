package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

	@Test
	public void loginWithInvalidEmailInvalidPassword() {
				
		LoginPage loginPage = new LoginPage();
		loginPage.login();
	}
	
}


