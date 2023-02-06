package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver = null;
		
//	public static String baseURL = "https://nktechsolutions.com/membership-login/";
	public static String baseURL = "file:///C:/Users/khale/OneDrive/Desktop/Misc/NK%20TECH%20Solutions/Automation/WebPage/2ndPage.html";
	
	public static WebDriverWait wait = null;
			
	@BeforeMethod
	public void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get(baseURL);
		
		wait = new WebDriverWait(driver, 10);
		
	}
	
//	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	

}
