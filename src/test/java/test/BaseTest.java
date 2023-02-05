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
		
	public static String baseURL = "https://nktechsolutions.com/membership-login/";
	
	public static WebDriverWait wait = null;
			
	@BeforeMethod
	public void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get(baseURL);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		wait = new WebDriverWait(driver, 10);
		
		try {
			Thread.sleep(10000);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
//	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	

}
