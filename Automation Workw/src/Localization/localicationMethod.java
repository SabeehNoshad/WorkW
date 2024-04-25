package Localization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Xpaths.getterMethods;
import signin.Base_page;

public class localicationMethod extends Base_page{
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		getterMethods xpaths = new getterMethods();
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
		
		
	public localicationMethod(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void languageSelect (By lang) throws InterruptedException {
		  WebElement LangClick = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getLangOption()));
		  LangClick.click();
		  WebElement LangCzech = wait.until(ExpectedConditions.visibilityOfElementLocated(lang));
		  LangCzech.click();
		  Thread.sleep(3000);
		
		  ModuleHunt();
	}
	public void ModuleHunt () throws InterruptedException {
		for (int i = 1 ; i <= 49;i++) {
			 WebElement module = wait.until(ExpectedConditions.visibilityOfElementLocated(modules[i]));
			 module.click();
			 Thread.sleep(5000);
		}
		
	}

}
