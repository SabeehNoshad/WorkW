package customApproval;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Xpaths.getterMethods;
import signin.Base_page;
import user.urls.testArguments.getterMethodTextFile;

public class customApprovalMethod extends Base_page {
	getterMethods xpaths = new getterMethods();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	getterMethodTextFile text = new getterMethodTextFile();

	public customApprovalMethod(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void CustomApprovalRoute(Integer times ) throws InterruptedException {
		WebElement customApprovalNavBar = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getcustomApprovalNavBar()));
		customApprovalNavBar.click();
		for (int i = 0 ; i <= times ; i ++) {
		WebElement customApprovalCreateButton = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getcustomApprovalCreateButton()));
		customApprovalCreateButton.click();
		CreateComposer(i);
		}
		
	}
	public void CreateComposer(Integer i ) throws InterruptedException {
		WebElement customApprovalSubject = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getcustomApprovalSubject()));
		customApprovalSubject.sendKeys(i + text.getSubject());
	driver.findElement(xpaths.getcustomApprovalClickCategory()).click();
//		WebElement customApprovalClickCategory = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getcustomApprovalClickCategory()));
//		customApprovalClickCategory.click();
		WebElement customApprovalSelectCategory = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getcustomApprovalSelectCategory()));
		customApprovalSelectCategory.click();
		WebElement customApprovalEnterAmount = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getcustomApprovalEnterAmount()));
		customApprovalEnterAmount.sendKeys(i+ text.getuserAmmount());
		WebElement customApprovalDescription= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getcustomApprovalDescription()));
		customApprovalDescription.sendKeys(i + text.getuserModuleDescription500());
		WebElement customApprovalSubmitButton= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getcustomApprovalSubmitButton()));
		customApprovalSubmitButton.click();
		Thread.sleep(2000);
		
	}

}
