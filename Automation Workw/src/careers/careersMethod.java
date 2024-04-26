package careers;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Xpaths.getterMethods;
import signin.Base_page;
import user.urls.testArguments.getterMethodTextFile;

public class careersMethod extends Base_page{
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); 
	 getterMethods xpaths = new getterMethods();
	 getterMethodTextFile text = new getterMethodTextFile();
	public careersMethod(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void careersRoute () throws InterruptedException {
		WebElement careerNavBar = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getcareersNavBarOption()));
		careerNavBar.click();
		WebElement careerCreateButton = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getcareersCreateButton()));
		careerCreateButton.click();
		createComposer();
	}
	public void createComposer() throws InterruptedException {
		WebElement CareerDesignation	= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getCareersDesignation()));
		CareerDesignation.click();
		WebElement CareerDesignationSelect	= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getcareerDesgnationClick()));
		CareerDesignationSelect.click();
		WebElement CareerDescription	= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getCareersDescription()));
		CareerDescription.sendKeys(text.getuserModuleDescription500());
		WebElement CareerSalaryRange	= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getCareersSalaryRange()));
		CareerSalaryRange.sendKeys(text.getbasicSalary());
		WebElement CareerMaxiSalary	= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getCareersMaxiSalary()));
		CareerMaxiSalary.sendKeys(text.getbasicSalary());
		Thread.sleep(1000);
		driver.findElement(xpaths.getCareersDepartmentList()).click();
//		WebElement CareerDepartmentList	= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getCareersDepartmentList()));
//		CareerDepartmentList.click();
		Thread.sleep(1000);
		driver.findElement(xpaths.getCareersDepartmentList()).sendKeys(Keys.ENTER);
//		WebElement CareerDepartmentCLick	= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getCareersDepartmentListClick()));
//		CareerDepartmentCLick.click();
		WebElement CareerSupervisorList	= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getCareersSupervisorList()));
		CareerSupervisorList.click();
		CareerSupervisorList.sendKeys(text.getmileTapMemberName2());
		Thread.sleep(3000);
		WebElement CareerSuperVisorClick	= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getCareersSuperVisorClick()));
		CareerSuperVisorClick.click();
		WebElement CareerInterviewersList	= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getCareersInterviewerList()));
		CareerInterviewersList.click();
		CareerInterviewersList.sendKeys(text.getmileTapMemberName2());
		Thread.sleep(3000);
		WebElement CareerInterClick	= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getCareersInterviewerClick()));
		CareerInterClick.click();
		WebElement CareerpostReviewerList	= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getCareersPostReviwerList()));
		CareerpostReviewerList.click();
		CareerpostReviewerList.sendKeys(text.getmileTapMemberName2());
		Thread.sleep(3000);
		WebElement CareerPostReviewerClick	= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getCareersReviewerClick()));
		CareerPostReviewerClick.click();
		WebElement CareerHiringBuddy	= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getCareersHiringBuddyList()));
		CareerHiringBuddy.click();
		CareerHiringBuddy.sendKeys(text.getmileTapMemberName2());
		Thread.sleep(3000);
		WebElement CareerHiringBuddyClick	= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getCareersHiringBuddyClick()));
		CareerHiringBuddyClick.click();
		WebElement CareerCityList	= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getCareersCityList()));
		CareerCityList.click();
		WebElement CareerCityCLick	= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getCareersCityClick()));
		CareerCityCLick.click();
//		WebElement CareerSkill	= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getCareersSkills()));
//		CareerSkill.sendKeys("newSkill");
//		CareerSkill.sendKeys(Keys.ENTER);
		WebElement CareerExperianceYEars	= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getCareersExperience()));
		CareerExperianceYEars.sendKeys("3");
		driver.findElement(xpaths.getCareersJobTypeList()).click();
//		WebElement CareerJobTypelist	= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getCareersJobTypeList()));
//		CareerJobTypelist.click();
		WebElement CareerJobTypeClick	= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getCareersJobTypeClick()));
		CareerJobTypeClick.click();
		driver.findElement(xpaths.getCareersJobShiftList()).click();
//		WebElement CareerJobSHiftList	= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getCareersJobShiftList()));
//		CareerJobSHiftList.click();
		WebElement CareerJobShiftClick	= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getCareersJobShiftClick()));
		CareerJobShiftClick.click();
		driver.findElement(xpaths.getCareersEducationList()).click();
//		WebElement CareerEducationList	= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getCareersEducationList()));
//		CareerEducationList.click();
		WebElement CareerEductionClick	= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getCareersEducationClick()));
		CareerEductionClick.click();
		WebElement CareerCareersList	= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getCareersCareerList()));
		CareerCareersList.click();
		WebElement CareerCareersCLick	= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getCareersCareerClick()));
		CareerCareersCLick.click();
		WebElement CareerEndDateCLick	= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getCareersDateList()));
		CareerEndDateCLick.click();
		WebElement CareerEndDateSelect	= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getCareersDateClick()));
		CareerEndDateSelect.click();
		WebElement CareerReviewCriterion	= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getCareersReviewCriterion()));
		CareerReviewCriterion.click();
		CareerReviewCriterion.sendKeys(text.getuserModuleDescription150());
		WebElement CareerReviewSubmitt	= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getCareersReviewSubmittButton()));
		CareerReviewSubmitt.click();
		WebElement CareerCareersSubmitt	= wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getCareersSubmitButton()));
		CareerCareersSubmitt.click();
		
	}
}
