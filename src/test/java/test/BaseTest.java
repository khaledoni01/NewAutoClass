package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver = null;
	public static String baseURL = "https://nktechsolutions.com/membership-login/";

	
	
	@BeforeMethod()
	public void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get(baseURL);
	}
	
	

}
