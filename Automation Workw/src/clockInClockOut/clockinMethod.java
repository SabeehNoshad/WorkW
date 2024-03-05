package clockInClockOut;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Xpaths.getterMethods;
import signin.Base_page;

public class clockinMethod extends Base_page {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
	public clockinMethod(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clockInMethod() throws InterruptedException {
		getterMethods xpaths = new getterMethods();
		driver.findElement(xpaths.getclockInOpt()).click();
		//Thread.sleep(3000);
		driver.findElement(xpaths.getclockInButton()).click();
		//Thread.sleep(2000);
		  WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getclockInMessage()));
		  
		String message =element.getText();
		//Thread.sleep(2000);
		Assert.assertNotEquals(message, "Are You Sure to check-out?");
		 WebElement clockinYesButton = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getclockInButtonYes()));
		 clockinYesButton.click();
		
		System.out.print(message);
	}

}
