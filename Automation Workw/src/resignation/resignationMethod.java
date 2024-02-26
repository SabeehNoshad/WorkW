package resignation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Xpaths.getterMethods;
import signin.Base_page;
import user.urls.testArguments.getterMethodTextFile;

public class resignationMethod extends Base_page {
	getterMethods xpaths = new getterMethods();
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  getterMethodTextFile text = new getterMethodTextFile();

	public resignationMethod(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
public void reginationRoute(Integer time) throws InterruptedException {
	WebElement resignationNavBar = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getresignationNavBar()));
	resignationNavBar.click();
	for (int i = 0 ; i <= time ;i++) {
	WebElement resignationCreateButton = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getresignationCreateButon()));
	resignationCreateButton.click();
	resignationCreateComposer(i);
	}
	
}
public void resignationCreateComposer(Integer i) throws InterruptedException {
	// select reason
	driver.findElement(xpaths.getresignationReasonMenu()).click();
	WebElement resignationReason = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getresignationReasonOption()));
	resignationReason.click();
	   //date
	WebElement resignationDate = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getresignationDateClick()));
	resignationDate.click();
	WebElement resignationDatevalue = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getresignationDateClick()));
	resignationDatevalue.sendKeys(text.getuserdate());
	WebElement resignationReportingTO = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getresignationReportingTO()));
	resignationReportingTO.sendKeys(text.getuserdate());
	WebElement resignationHR = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getresignationHR()));
	resignationHR.sendKeys(text.getuserdate());
	WebElement resignationAdmin = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getresignationAdmin()));
	resignationAdmin.sendKeys(text.getuserdate());
	WebElement resignationIT = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getresignationIT()));
	resignationIT.sendKeys(text.getuserdate());
	WebElement resignationFinance = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getresignationFinance()));
	resignationFinance.sendKeys(text.getuserdate());
	WebElement resignationExitInterview = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getresignationExitInter()));
	resignationExitInterview.sendKeys(text.getuserdate());
	WebElement resignationDescription = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getresignationExitInter()));
	resignationDescription.sendKeys(i + text.getuserModuleDescription500());
	WebElement resignationSubmitButton = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getresignationSubmitButton()));
	resignationSubmitButton.click();
	Thread.sleep(3000);
	
}

}
