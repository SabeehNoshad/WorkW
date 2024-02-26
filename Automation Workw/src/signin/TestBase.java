package signin;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
	protected WebDriver driver;
@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");
//		driver =new ChromeDriver();
		
	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		
//	    options.addArguments("--disable-notifications");
//		options.setAcceptInsecureCerts(true);

		
//		driver = new ChromeDriver(options);
//		driver.manage().window().maximize();
		
	}
	@AfterTest
	public void tearDown() {
		if (driver != null) {
			 driver.quit();
			
		}
	}
	 
	}
	


