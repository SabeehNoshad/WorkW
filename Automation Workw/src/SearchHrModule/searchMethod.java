package SearchHrModule;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Xpaths.getterMethods;
import signin.Base_page;

public class searchMethod extends Base_page
{

	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); 
		public searchMethod(WebDriver driver) {
			super(driver);
			// TODO Auto-generated constructor stub
		}
	getterMethods xpaths = new getterMethods();
	By[] modules = new By [] {xpaths.getEmployeeNavBarOpt(),xpaths.getAppraisalNavBar(),xpaths.getPromotionNavBar(),
								xpaths.getWarningNavBar(),xpaths.getBonusNavBar(),
								xpaths.getComplainNavBar(),xpaths.getRewardNavBaroption(),
								xpaths.getLeavesNavBar(),xpaths.getsalaryNavBar(),
								xpaths.getLoanNavBar(),xpaths.getresignationNavBar()};
	// department careers and attendance not included

		public void searchRoute() throws InterruptedException {
			for (int i = 1;i <=10 ; i ++) {
				WebElement module = wait.until(ExpectedConditions.visibilityOfElementLocated(modules[i]));
				module.click();
				WebElement Search = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getsearchHrModules()));
				Search.click();
				Search.sendKeys("test");
				Thread.sleep(5000);
			}
		}

}
