package leadManager;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Xpaths.getterMethods;
import signin.Base_page;
import user.urls.testArguments.getterMethodTextFile;

public class leadManager_Method extends Base_page  {

	public leadManager_Method(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

getterMethods xpaths = new getterMethods();
getterMethodTextFile text = new getterMethodTextFile();
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

// creating number of lead groups 
public void leadGroupRoute(Integer times) throws InterruptedException {
	WebElement LeadManagerNavBar = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getLeadManagerOpt()));
	LeadManagerNavBar.click();
	for (int i =1; i <= times ; i ++) {
//	WebElement LeadManagerTabGroupOption = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getleadGroupTabSelection()));
//	LeadManagerTabGroupOption.click();
	WebElement LeadManagerCreateGroupOpti = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getCreateLeadGroupOption()));
	LeadManagerCreateGroupOpti.click();
	createLeadGroup(i);
	Thread.sleep(3000);
	createLeadGroupMUltipleTime();
	Thread.sleep(1000);
	}
}

// test method for creating multiple lead in the created lead group 

	public void leads (Integer times) throws InterruptedException {
		WebElement LeadManagerNavBar = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getLeadManagerOpt()));
		LeadManagerNavBar.click();
		WebElement LeadManagerTabGroupOption = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getleadGroupTabSelection()));
		LeadManagerTabGroupOption.click();
		WebElement lmGroupSelection = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getleadGroupTabSelection()));
		lmGroupSelection.click();
		WebElement lmGroupDummyGroup = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getLeadGroupDummy()));
		lmGroupDummyGroup.click();
		for (int i = 1 ; i <= times ; i ++) {
			WebElement lmGroupSectionClick = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getCreateSectionOpt()));
			lmGroupSectionClick.click();
			Thread.sleep(2000);
		addlead_Lead(i);
	}
	}


	// after creating a lead group the back option is called by this method 
	public void createLeadGroupMUltipleTime() {
		WebElement lmGroupBackButton = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getleadgroupbackbutton()));
		lmGroupBackButton.click();
	}
	


// create composer of lead group working / filling of the form 
	public void createLeadGroup(Integer i ) throws InterruptedException {
//		Thread.sleep(3000);
//		driver.findElement(xpaths.getNameField()).click();
		WebElement lmGroupName = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getNameField()));
		lmGroupName.sendKeys(i + text.getuserFirstName());
		driver.findElement(xpaths.getLeadDescriptionField()).click();
		WebElement lmGroupDesc = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getLeadDescriptionField()));
		lmGroupDesc.sendKeys(i + text.getuserModuleDescription500());
//		driver.findElement(xpaths.getSelectMemberField()).click();
//		driver.findElement(xpaths.getSelectMemberField()).sendKeys(memberName);
//		Thread.sleep(5000);
//		driver.findElement(xpaths.getSelectMemberOptClick()).click();
		//Thread.sleep(5000);
		driver.findElement(xpaths.getCreateButtonField()).click();
		Thread.sleep(3000);
		
	}
	
	public void addlead_Lead(Integer i ) throws InterruptedException {
//		WebElement lmGroupSectionClick = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getCreateSectionOpt()));
//		lmGroupSectionClick.click();
		//Thread.sleep(5000);
		driver.findElement(xpaths.getLeadName()).sendKeys(i + text.getuserFirstName());;
		driver.findElement(xpaths.getLeadAddress()).sendKeys(i + text.getuserLastName());;
		driver.findElement(xpaths.getLeadPhoneNumber()).sendKeys(text.getleadNumber());
		WebElement lmLeadStatusClick = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getLeadStatus()));
		lmLeadStatusClick.click();
		driver.findElement(xpaths.getLeadStatus()).click();
//		if(i == 2) {
//			WebElement lmGroupSectionPotentialOption = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getLeadpotential()));
//			lmGroupSectionPotentialOption.click();
//		}
//		else if (i == 1) {
//			WebElement lmGroupSectionContactEstablishOption = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getLeadcontactestablished()));
//			lmGroupSectionContactEstablishOption.click();
//		}
//		else if (i == 3) {
//			WebElement lmGroupSectionIntroductionCompleteOption = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getLeadintrocomplete()));
//			lmGroupSectionIntroductionCompleteOption.click();
//		}
//		else if (i == 4) {
//			WebElement lmGroupSectionContractSendOption = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getLeadcontractsend()));
//			lmGroupSectionContractSendOption.click();
//		}
//		else {
//			WebElement lmGroupSectionLeadCompleteOption = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getLeadcomplete()));
//			lmGroupSectionLeadCompleteOption.click();
//		}
//		
		
		//Thread.sleep(1000);
		if (i == 1) {
		driver.findElement(xpaths.getLeadInterested()).click();
		}
		else if (i == 2){
			
		driver.findElement(xpaths.getLeadNotInterested()).click();
	}
		//by default unknown
		else {
			driver.findElement(xpaths.getLeadUnknown()).click();
		}
		//Thread.sleep(3000);
		//driver.findElement(xpaths.getLeadAddButton()).click();
		if (i == 1 ) {
		WebElement lmGroupSectionSubmitButton = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getLeadAddButton()));
		lmGroupSectionSubmitButton.click();
		Thread.sleep(3000);
		}
		else {
			WebElement lmGroupSectionSubmitButton = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getleadSubmittButtonMoreThanOnce()));
			lmGroupSectionSubmitButton.click();
			Thread.sleep(3000);
		}
	}
	

	// multiple leads under created lead 
//	public void leadinloops (Integer i) throws InterruptedException {
//		getterMethodTextFile text = new getterMethodTextFile();
//		
//		addlead_Lead(text.getleadName()+i,text.getleadAddress(),text.getleadNumber(),text.getleadintereNotinter(),text.getleadStatus());
//		
	}

	