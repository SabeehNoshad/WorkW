package payRoll;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Xpaths.getterMethods;
import signin.Base_page;
import user.urls.testArguments.getterMethodTextFile;

public class payRollMethod extends Base_page {

	public payRollMethod(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	getterMethods xpaths = new getterMethods();
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	  getterMethodTextFile text = new getterMethodTextFile();
	  
	public void payrollRoute(Integer times) throws InterruptedException {
		 WebElement payROllNavBar = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getpayrollNavBarOption()));
		 payROllNavBar.click();
		 for (int i = 1 ; i <= times ; i++) {
		 WebElement payrollCreateButton = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getpayrollCreateButton()));
		 payrollCreateButton.click();
		 payrollCreateMethod(i);
		 }
	}
	public void payrollCreateMethod(Integer i ) throws InterruptedException {
		Thread.sleep(2000);
//		driver.findElement(xpaths.getpayrollDateandYear()).click();
//		Thread.sleep(1000);
//		driver.findElement(xpaths.getpayrollDateandYear()).clear();
//		Thread.sleep(2000);
//		driver.findElement(xpaths.getpayrollDateandYear()).sendKeys(text.getpayrollDateandYear());
//		Thread.sleep(2000);
		driver.findElement(xpaths.getpayrollDisperseCalender()).click();
		driver.findElement(xpaths.getpayrollDisperseCalender()).sendKeys(text.getpayrollDisperseyear());
		Thread.sleep(1000);
		driver.findElement(xpaths.getpayrollDisperseCalender()).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		WebElement payrollSumbmittButton = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getpayrollSubmittRoll()));
		payrollSumbmittButton.click();
	}
}
