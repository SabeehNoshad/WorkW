package appraisal;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Xpaths.getterMethods;
import signin.Base_page;
import user.urls.testArguments.getterMethodTextFile;

public class appraisalMethod extends Base_page {

	public appraisalMethod(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	getterMethods xpaths = new getterMethods();
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  getterMethodTextFile text = new getterMethodTextFile();
	  
	  public void appraisalRoute (Integer times,String company) throws InterruptedException {
		  WebElement appraisalNavBaroption = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getAppraisalNavBar()));
		  appraisalNavBaroption.click();
		  for (int i = 1 ; i <+ times ; i++) {
		  WebElement appraisalCreateButton = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getAppraisalCreateButton()));
		  appraisalCreateButton.click();
		  appraisalCreateComposer(i,company);
		  }
	  }
	  public void appraisalCreateComposer (Integer i,String company) throws InterruptedException {
		  driver.findElement(xpaths.getAppraisalSelectMember()).click();
		  if (company == "miletap") {
			  driver.findElement(xpaths.getAppraisalSelectMember()).sendKeys(text.getmileTapMemberName1());
  
		  }
		  else {
			  driver.findElement(xpaths.getAppraisalSelectMember()).sendKeys(text.getCompantMember1());
 
		  }
		  WebElement appraisalmemberSelection = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getAppraisalMemberSelectionClick()));
		  appraisalmemberSelection.click();
		  WebElement appraisaldatepicker = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getAppraisalDatePicker()));
		  appraisaldatepicker.click();
		  WebElement appraisalStartDate = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getAppraisalStartDateClick()));
		  appraisalStartDate.click();
		  WebElement appraisalendDate = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getAppraisalEndDateClick()));
		  appraisalendDate.click();
//		  WebElement appraisalPromotionNO = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getAppraisalPromotionNo()));
//		  appraisalPromotionNO.click();
//		  WebElement appraisalBonusNo = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getAppraisalBonusNo()));
//		  appraisalBonusNo.click();
//		  WebElement appraisalIncrementNO = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getAppraisalIncrementNo()));
//		  appraisalIncrementNO.click();
//		  WebElement appraisalresponse1 = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getAppraisalResponsiveStar()));
//		  appraisalresponse1.click();
//		  WebElement appraisalresponse2 = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getAppraisalTeamPlayerStar()));
//		  appraisalresponse2.click();
//		  WebElement appraisalresponse3 = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getAppraisalLongTermStar()));
//		  appraisalresponse3.click();
//		  WebElement appraisalresponse4 = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getAppraisalEnthusiasmStar()));
//		  appraisalresponse4.click();
//		  WebElement appraisalResponse5 = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getAppraisalAmbitionStar()));
//		  appraisalResponse5.click();
//		  WebElement appraisalResponse6 = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getAppraisalAbilityToProduce()));
//		  appraisalResponse6.click();
//		  appraisalCommentText.sendKeys(i + text.getuserModuleDescription150());;
		  WebElement appraisalSubmittButton = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getAppraisalSubmitOption()));
		  appraisalSubmittButton.click();
		  Thread.sleep(3000);
	  }
}
