package SearchMainModule;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Xpaths.getterMethods;
import signin.Base_page;

public class searchMainModuleMethod extends Base_page {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); 

	public searchMainModuleMethod(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	getterMethods xpaths = new getterMethods();
	By[] modules = new By [] {xpaths.getscheduleNavBar(),xpaths.getLeadManagerOpt(),xpaths.getcustomApprovalNavBar(),
								xpaths.getTravelNavBarOpt(),xpaths.getclickDocs(),
								xpaths.getclickOnLandD(),xpaths.getProjectNavBarOpt(),
								xpaths.getworkboardNavBaroption(),xpaths.getGroupNavBar(),
								xpaths.getexpenseNavBarOption(),xpaths.getTaskNavBarOpt(),
								xpaths.getclickOnBusinessPolicy(),xpaths.getformNavBar(),
								xpaths.getauctionNavBar(),xpaths.getclickOnDiscussionBoard(),
								xpaths.getpagesnewsFeedOpt()};
	public void searchRoute() throws InterruptedException {
		for (int i = 1;i <=16 ; i ++) {
			WebElement module = wait.until(ExpectedConditions.visibilityOfElementLocated(modules[i]));
			module.click();
			WebElement Search = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getsearchHrModules()));
			Search.click();
			Search.sendKeys("test");
			Thread.sleep(5000);
		}
}
}
