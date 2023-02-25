package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.LoginPage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
	
	
	@DataProvider(name="invalidLoginData")
	public static Object[][] invalidData() {
		
		return new Object [][] { {"#3$6aks", "#3ajk"}, {"invalid", "123"} };
	}
	
	@Test(groups= {"regression"}, dataProvider = "invalidLoginData")
	public void loginWithInvalidEmailInvalidPassword(String username, String password) {
				
		LoginPage loginPage = new LoginPage();
		loginPage.login(username, password);		
	}
	
	@Test(groups = {"smoke", "regression"})
	public void selectMenuOptionTest() {
		
		HomePage homePage = new HomePage();
		homePage.selectMenuOption("Contact Us");
	}
	
}


