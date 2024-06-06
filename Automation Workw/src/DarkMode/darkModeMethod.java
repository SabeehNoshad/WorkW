package DarkMode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Xpaths.getterMethods;
import signin.Base_page;
import user.urls.testArguments.getterMethodTextFile;

public class darkModeMethod extends Base_page{
	getterMethods xpaths = new getterMethods();
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  getterMethodTextFile text= new getterMethodTextFile();
	  
	//****************************************************************** module array ************************************************************************
	  By[] modules = new By [] {xpaths.getscheduleNavBar(),xpaths.getclickOnMessenger(),
				xpaths.getclickOnMailBox(),xpaths.getLeadManagerOpt(),xpaths.getcustomApprovalNavBar(),
				xpaths.getTravelNavBarOpt(),xpaths.getclickDocs(),xpaths.getclickOnLandD(),
				xpaths.getProjectNavBarOpt(),xpaths.getworkboardNavBaroption(),xpaths.getGroupNavBar(),
				xpaths.getexpenseNavBarOption(),xpaths.getTaskNavBarOpt(),xpaths.getclickOnJObBoard(),
				xpaths.getclickOnBusinessPolicy(),xpaths.getclickOnForms(),xpaths.getclickOnMarketplace(),
				xpaths.getauctionNavBar(),xpaths.getclickOnDiscussionBoard(),xpaths.getclickOnPages(),
				xpaths.getEmployeeNavBarOpt(),xpaths.getAppraisalNavBar(),xpaths.getAdministrationNavBarOption(),
				xpaths.getPromotionNavBar(),xpaths.getWarningNavBar(),xpaths.getBonusNavBar(),xpaths.getclickOnOrgChart(),
				xpaths.getComplainNavBar(),xpaths.getRewardNavBaroption(),xpaths.getclickOnMyTeam(),
				xpaths.getLeavesNavBar(),xpaths.getclickOnCareers(),xpaths.getsalaryNavBar(),
				xpaths.getLoanNavBar(),xpaths.getresignationNavBar(),xpaths.getclickOnAttendance(),
				xpaths.getclickOnChartsOfAccounts(),xpaths.getclickOnQuotation(),xpaths.getclickOnVoucher(),
				xpaths.getclickOnvoucherList(),xpaths.getclickOnLedgerRepo(),xpaths.getclickOnTrailBalance(),
				xpaths.getclickOnPayroll(),xpaths.getclickOnRequisition(),xpaths.getclickOnAssetsAllocaiton(),
				xpaths.getclickOnCreateAssets(),xpaths.getclickOnAssetsLists(),xpaths.getclickOnRequestForItems(),
				xpaths.getclickOnCompanies()};
	  
	public darkModeMethod(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void darkModeRoute() throws InterruptedException {
		WebElement darkmodeEnableOption = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getdarModeModuleButtonOnWorkWise()));
		darkmodeEnableOption.click();
		moduleHunt();
	}
	public void moduleHunt() throws InterruptedException {
		for (int i = 0; i <= 44; i ++ ) {
			WebElement moduleClickAndWait = wait.until(ExpectedConditions.visibilityOfElementLocated(modules[i]));
			moduleClickAndWait.click();
			Thread.sleep(5000);
		}
	}

}
