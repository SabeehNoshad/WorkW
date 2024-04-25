package Employee;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Xpaths.getterMethods;
import signin.Base_page;
import user.urls.testArguments.getterMethodTextFile;

public class employeeMethod extends Base_page{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
	getterMethods xpaths = new getterMethods();
	getterMethodTextFile text= new getterMethodTextFile();

	public employeeMethod(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void employeeModuleRoute() throws InterruptedException {
		WebElement EmployeeNavBaroption	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmployeeNavBarOpt()));
		EmployeeNavBaroption.click();
		WebElement EmployeeUpdateOption	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmployeeUpdateButton()));
		EmployeeUpdateOption.click();
		empEmailConfiguration();
		bankDetail();
		educationModule();
		emergencyInformation();
		workExperience ();
		rebate();
		salaryEmployee();
		family();
		
		
		
	}
	//**********************EMAILcONFIGURATION************************************************************
	public void empEmailConfiguration() throws InterruptedException {
		WebElement EmployeeEmailConfigurationOption	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmployeeEmailConfiguration()));
		EmployeeEmailConfigurationOption.click();
		WebElement EmployeeEmailConfigurationAddButton	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmployeeUpdateButton()));
		EmployeeEmailConfigurationAddButton.click();
		WebElement EmployeeEmailConfigurationUserName	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmployeeEmailUsername()));
		EmployeeEmailConfigurationUserName.click();
		WebElement EmployeeEmailConfigurationPassword	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmployeePassword()));
		EmployeeEmailConfigurationPassword.click();
		WebElement EmployeeEmailConfigurationSubmittButton	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmployeePassword()));
		EmployeeEmailConfigurationSubmittButton.click();
		Thread.sleep(3000);

	}
	//***********************BANKDETAIL***********************************************************************
	public void bankDetail(Integer times) throws InterruptedException {
		WebElement EmployeeBankDetailOption	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmployeeBankDetailOption()));
		EmployeeBankDetailOption.click();
		WebElement EmployeeBankDetailAddButton	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmployeeAddBankDetailButton()));
		EmployeeBankDetailAddButton.click();
		for (int i = 1 ; i <= times ;i++) {
		WebElement EmployeeBankDetailAccTitle	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmployeeAccTitle()));
		EmployeeBankDetailAccTitle.sendKeys(i + "Testing");;
		WebElement EmployeeBankDetailBranchCode	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpBranchCode()));
		EmployeeBankDetailBranchCode.sendKeys(i + "0000");;
		WebElement EmployeeBankDetailAccNumber	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpAccountNumber()));
		EmployeeBankDetailAccNumber.sendKeys(i+ "11223377445566");
		WebElement EmployeeBankDetailIBAN	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpIBAN()));
		EmployeeBankDetailIBAN.sendKeys(i + "112233");
		WebElement EmployeeBankDetailSortCode	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpSortCode()));
		EmployeeBankDetailSortCode.sendKeys(i + "111");;
		WebElement EmployeeBankDetailCountryList	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpCountryList()));
		EmployeeBankDetailCountryList.click();
		EmployeeBankDetailCountryList.sendKeys("Pakistan");
		Thread.sleep(2000);
		WebElement EmployeeBankDetailCountryClick	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpCountryClick()));
		EmployeeBankDetailCountryClick.click();
		WebElement EmployeeBankDetailcityList	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpCityList()));
		EmployeeBankDetailcityList.click();
		EmployeeBankDetailcityList.sendKeys("Karachi");
		Thread.sleep(2000);
		WebElement EmployeeBankDetailcityClick	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpCityClick()));
		EmployeeBankDetailcityClick.click();
		WebElement EmployeeBankDetailIsDefault	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpIsDefaultClick()));
		EmployeeBankDetailIsDefault.click();
		WebElement EmployeeBankDetailSubmittButton	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpAddBankSubmittButton()));
		EmployeeBankDetailSubmittButton.click();
		}
	}
	//********************************EDUCATION********************************************************************************
	public void educationModule(Integer times) throws InterruptedException {
		WebElement EmployeeEducationOption	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpEducationOption()));
		EmployeeEducationOption.click();
		WebElement EmployeeEducationAddButton	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpAddEducationButton()));
		EmployeeEducationAddButton.click();
		for (int i = 1 ; i <= times ; i++) {
		WebElement EmployeeEducationDegreeName	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpDegreeName()));
		EmployeeEducationDegreeName.sendKeys(i + text.getuserFirstName());
		WebElement EmployeeEducationInstituteName	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpInstitute()));
		EmployeeEducationInstituteName.sendKeys(i+ text.getmileTapMemberName1());
		WebElement EmployeeEducationTotalMarks	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpTotalMarks()));
		EmployeeEducationTotalMarks.sendKeys(i + "550");
		WebElement EmployeeEducationOptainMarks	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpObtainMarks()));
		EmployeeEducationOptainMarks.sendKeys(i+"22");
		WebElement EmployeeEducationStartDate	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpStatdate()));
		EmployeeEducationStartDate.click();
		WebElement EmployeeEducationDateSelection	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpStartDateclick()));
		EmployeeEducationDateSelection.click();
		WebElement EmployeeEducationEndDate	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpEndDateClick()));
		EmployeeEducationEndDate.click();
		Thread.sleep(3000);
		
		WebElement EmployeeEducationCountryClick	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpCountry()));
		EmployeeEducationCountryClick.click();
		EmployeeEducationCountryClick.sendKeys("Pakistan");
		WebElement EmployeeEducationCountrySelection	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpCountyclick()));
		EmployeeEducationCountrySelection.click();
		WebElement EmployeeEducationCityListClik	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpcityList()));
		EmployeeEducationCityListClik.click();
		EmployeeEducationCityListClik.sendKeys("Karachi");
		WebElement EmployeeEducationCityCLick	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpCityCli()));
		EmployeeEducationCityCLick.click();
		WebElement EmployeeEducationSubmittButton	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpEducationSubmittButton()));
		EmployeeEducationSubmittButton.click();
		}
	}
	//*************************************************EmergencyInformation*****************************************************************************
	public void emergencyInformation(Integer times) {
		WebElement EmployeeEmergencyOptio	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpEmergencyInformation()));
		EmployeeEmergencyOptio.click();
		WebElement EmployeeEmeInformaitonAddButton	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpEmergencyAddButton()));
		EmployeeEmeInformaitonAddButton.click();
		for (int i = 0 ; i <= times ; i++) {
		WebElement EmployeeEmerInformationName	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpEmename()));
		EmployeeEmerInformationName.sendKeys();
		WebElement EmployeeEmergencyInfoAddress	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpEmeAdd()));
		EmployeeEmergencyInfoAddress.sendKeys();
		WebElement EmployeeEmeInforNumber	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpEmeNumber()));
		EmployeeEmeInforNumber.sendKeys();
		WebElement EmployeeEmeInfoRelationListClick	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpEmeRelationList()));
		EmployeeEmeInfoRelationListClick.click();
		WebElement EmployeeEmeInformaitonselecRelation	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpEmeSelectRelation()));
		EmployeeEmeInformaitonselecRelation.click();
		WebElement EmployeeEmeInforSubmittButton	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpEmeSubmittButton()));
		EmployeeEmeInforSubmittButton.click();
		}
	}
	//******************************************************WORKEXPERIANCE************************************************************************************
	public void workExperience (Integer times) {
		WebElement EmployeeWorkOptio	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpWorkExpOpt()));
		EmployeeWorkOptio.click();
		WebElement EmployeeWorkAddButton	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpWorkAddButton()));
		EmployeeWorkAddButton.click();
		for (int i = 1 ; i <= times ; i++) {
		WebElement EmployeeWorkPosition	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpWorkPosi()));
		EmployeeWorkPosition.sendKeys("Senior Manager");
		WebElement EmployeeWorkEmpTYpeList	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpWorkPosi()));
		EmployeeWorkEmpTYpeList.click();
		WebElement EmployeeWorkempTypeClick	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpWorkEmploymentTypeClick()));
		EmployeeWorkempTypeClick.click();
		WebElement EmployeeWorkOrganizationName	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpWorkOrganization()));
		EmployeeWorkOrganizationName.sendKeys(i + "ABC Corps");
		WebElement EmployeeWorkSubmittButton	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpAddWorkExpSubmittButton()));
		EmployeeWorkSubmittButton.click();
		}
	}
	//*******************************************************REBATE***********************************************************************************************
	//**************************ONLY IN REBATE THE MODAL CLOSES AFTER SUBMITTION*******************************************************
	public void rebate(Integer times) {
		WebElement EmployeeRebateOption	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpRebateOption()));
		EmployeeRebateOption.click();
		for (int i = 1 ; i <= times ; i ++) {
		WebElement EmployeeRebateAddButton	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpRebateAddButton()));
		EmployeeRebateAddButton.click();
		WebElement EmployeeRebateamount	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpRebateAmount()));
		EmployeeRebateamount.sendKeys(i + text.getuserAmmount());
		WebElement EmployeeRebateCategoryClick	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpRebateCategoryList()));
		EmployeeRebateCategoryClick.click();
		WebElement EmployeeRebateCategorySelection	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpRebateCategoryClick()));
		EmployeeRebateCategorySelection.click();
		WebElement EmployeeRebateDateClick	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpRebateDateClick()));
		EmployeeRebateDateClick.click();
		WebElement EmployeeRebateDateSelection	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpRebateDateSelect()));
		EmployeeRebateDateSelection.click();
		WebElement EmployeeRebateDescription	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpRebateDescription()));
		EmployeeRebateDescription.sendKeys(i + text.getuserModuleDescription500());
		WebElement EmployeeRebateSubmittButton	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpRebateSubmittButton()));
		EmployeeRebateSubmittButton.click();
		}
		
	}
	//********************************************************SALARY*************************************************************************************************
	public void salaryEmployee(Integer times) {
		WebElement EmployeeSalaryOption	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpSalaryOption()));
		EmployeeSalaryOption.click();
		for (int i = 1 ; i<=times ;i++) {
		WebElement EmployeeSalaryAddButton	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpSalaryAddButton()));
		EmployeeSalaryAddButton.click();
		WebElement EmployeeSalaryEffectiveDateClick	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpSalaryEffectiveDateClick()));
		EmployeeSalaryEffectiveDateClick.click();
		WebElement EmployeeSalaryEffectiveDateSelec	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpSalaryEffectiveDateSelect()));
		EmployeeSalaryEffectiveDateSelec.click();
		
		WebElement EmployeeSalaryDescription	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpSalaryDescription()));
		EmployeeSalaryDescription.sendKeys(i + text.getuserModuleDescription500());
		WebElement EmployeeSalarySubmittButton	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpSalarySubmittButton()));
		EmployeeSalarySubmittButton.click();
		}
	}
	//*********************************************************FAMILY****************************************************************************************************
	//***********************************************MODAL CLOSES WHEN THE CREATE FUNCTIONS ********************************************************************************
	public void family(Integer times) {
		WebElement EmployeeFamilyOption	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpFamilyOption()));
		EmployeeFamilyOption.click();
		for (int i = 1 ; i <= times;i ++  ) {
		WebElement EmployeeFamilyAddButton	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpFamilyAddButton()));
		EmployeeFamilyAddButton.click();
		WebElement EmployeeFamilyFirstName	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpFamilyFirstName()));
		EmployeeFamilyFirstName.sendKeys(i + text.getcompanyFirstname());
		WebElement EmployeeFamilyLAstName	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpFamilyLastName()));
		EmployeeFamilyLAstName.sendKeys(i + text.getuserLastName());
		WebElement EmployeeFamilyDOBClick	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpDateOfBirthClick()));
		EmployeeFamilyDOBClick.click();
		WebElement EmployeeFamilyDOBSelection	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpDateOfBirthSelect()));
		EmployeeFamilyDOBSelection.click();
		WebElement EmployeeFamilyContactNumber	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpFamilyContactNo()));
		EmployeeFamilyContactNumber.sendKeys(text.getleadNumber());
		WebElement EmployeeFamilyEmailAddress	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpFamilyEmailAddress()));
		EmployeeFamilyEmailAddress.sendKeys(text.getleadAddress());
		WebElement EmployeeFamilyRelationList	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpFamilyRelationList()));
		EmployeeFamilyRelationList.click();
		WebElement EmployeeFamilyRelationListSelection	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpFamilyRelationClick()));
		EmployeeFamilyRelationListSelection.click();
		WebElement EmployeeFamilySubmittButton	=  wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEmpFamilySubmittButton()));
		EmployeeFamilySubmittButton.click();
	}
	}
}
