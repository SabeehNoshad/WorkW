package signin;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import responsivness.responsivness_Test;

public class TestBase  {
	protected WebDriver driver;
@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");
//		driver =new ChromeDriver();
		
	
		ChromeOptions options = new ChromeOptions();
		

		
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
//		ChromeOptions options = new ChromeOptions();
//	    options.addArguments("--disable-notifications");
//		options.setAcceptInsecureCerts(true);
//		options.addArguments("--remote-allow-origins=*");
//		
//		driver = new ChromeDriver(options);
//		driver.manage().window().maximize();
//	
		
		  // Test different viewport sizes
//		responsivness_Test.testViewportSize(driver, 320, 480); // Test for mobile
//		responsivness_Test. testViewportSize(driver, 768, 1024); // Test for tablet
//		responsivness_Test. testViewportSize(driver, 1366, 768); // Test for desktop

	}
	@AfterTest
	public void tearDown() {
		if (driver != null) {
			 driver.quit();
			
		}
	}
	 
	}
	