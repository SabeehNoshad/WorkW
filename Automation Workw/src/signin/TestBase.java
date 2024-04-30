package signin;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
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
	}
	@AfterTest
	public void tearDown() {
		if (driver != null) {
			 driver.quit();
			
		}
	}
	 
	}
	