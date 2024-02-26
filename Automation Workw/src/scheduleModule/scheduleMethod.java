package scheduleModule;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Xpaths.getterMethods;
import signin.Base_page;
import user.urls.testArguments.getterMethodTextFile;

public class scheduleMethod extends Base_page {
	getterMethods xpaths = new getterMethods();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	getterMethodTextFile text = new getterMethodTextFile();


	public scheduleMethod(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void scheduleRoute(Integer times,String company) {
		WebElement scheduleNavBar = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getscheduleNavBar()));
		scheduleNavBar.click();
		for (int i = 0; i <= times ; i ++) {
		//	driver.findElement(xpaths.getscheduleCreateButton()).click();
//		WebElement scheduleCreateButton = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getscheduleCreateButton()));
//		scheduleCreateButton.click();
		createComposer(i,company);
		}
		
	}
	public void createComposer(Integer i,String company ) {
		driver.findElement(xpaths.getscheduleCreateButton()).click();
		driver.findElement(xpaths.getscheduleCreateButton()).click();

		WebElement scheduleSubject = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getscheduleSubject()));
		scheduleSubject.sendKeys(i + text.getSubject());
		driver.findElement(xpaths.getscheduleDescription()).click();
		WebElement scheduleDescription = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getscheduleDescription()));
		scheduleDescription.sendKeys(i + text.getuserModuleDescription500());
		driver.findElement(xpaths.getscheduleMemberlistClick()).click();
		if (company == "miletap") {
			WebElement scheduleMemberList = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getscheduleMemberlistClick()));
			scheduleMemberList.sendKeys(text.getmileTapMemberName1());
		}
		else {
			WebElement scheduleMemberList = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getscheduleMemberlistClick()));
			scheduleMemberList.sendKeys(text.getCompantMember1());
		}
		
		
		WebElement scheduleMember = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getscheduleMemberlistClick()));
		scheduleMember.click();
		WebElement scheduleMemberSelectionClick = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getscheduleMemberlistClick()));
		scheduleMemberSelectionClick.click();
		WebElement scheduleSubmit = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getscheduleSubmittButton()));
		scheduleSubmit.click();
	}

}
