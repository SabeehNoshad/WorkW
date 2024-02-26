package salary;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Xpaths.getterMethods;
import signin.Base_page;
import user.urls.testArguments.getterMethodTextFile;

public class salaryMethod extends Base_page {
	
	public salaryMethod(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	getterMethods xpaths = new getterMethods();
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	  getterMethodTextFile text = new getterMethodTextFile();
	  public String[] miletapnames = {text.getmileTapMemberName1(),text.getmileTapMemberName2(),text.getmileTapMemberName3()};
	  public String[] companynames = {text.getCompantMember1(),text.getCompanyMember2(),text.getCompanyMember3()};
	  
	public void salaryModuleClick (String company) throws InterruptedException {
		 WebElement salaryNavBarOption = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getsalaryNavBar()));
		 salaryNavBarOption.click();
		 for (int i = 0 ; i <= 3 ; i ++) {
		 WebElement salaryCreateButton = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getsalaryCreateSalary()));
		 salaryCreateButton.click();
		 if (company == "miletap") {
		 salaryCreateMethod(miletapnames[i]);
		 }
		 else {
			 salaryCreateMethod(companynames[i]);
		 }
		 }
//		 salaryCreateMethod(text.getsalarymember2());
//		 salaryCreateMethod(text.getsalarymember3());

	}
	public void salaryCreateMethod (String name) throws InterruptedException {
		// Click enter and select name of the employee
		driver.findElement(xpaths.getsalaryEmployeeName()).click();
		WebElement salaryName = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getsalaryEmployeeName()));
		salaryName.sendKeys(name);
		Thread.sleep(2000);
		driver.findElement(xpaths.getsalaryEmploeeSelected()).click();
//		get grade of the employee
		String grade = driver.findElement(xpaths.getsalaryGrade()).getText();
	//	Thread.sleep(5000);
		System.out.print("your grade is "+ grade);
		
		//driver.findElement(xpaths.getsalaryBasicSalary()).click();
		//enter basic Salary 
		WebElement salaryBasicSalaryInput = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getsalaryBasicSalary()));
		salaryBasicSalaryInput.sendKeys(text.getbasicSalary());
	  //      Thread.sleep(2000);
		driver.findElement(xpaths.getsalarydescription()).click();
		WebElement salaryDesc = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getsalarydescription()));
		salaryDesc.sendKeys(text.getuserModuleDescription150());
		
		WebElement salarySubmitButton = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getsalaryCreateButton()));
		salarySubmitButton.click();
		Thread.sleep(3000);
	}
	public void salaryApprovalMethod() throws InterruptedException  {
		WebElement salaryNavBarOption = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getsalaryNavBar()));
		salaryNavBarOption.click();
		//Thread.sleep(5000);
		WebElement salaryApprovalTab = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getsalaryForApprovalTab()));
		salaryApprovalTab.click();
		Thread.sleep(3000);
		WebElement salaryApprovallisting = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getsalaryApprovalListing()));
		salaryApprovallisting.click();
	//	Thread.sleep(3000);
		driver.findElement(xpaths.getsalaryApproverComposer()).click(); // approve decline hold composer
		//Thread.sleep(3000);
		WebElement salaryApproverButton = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getsalaryApproveButton()));
		salaryApproverButton.click();
//		Thread.sleep(3000);
		WebElement salaryApproverButtonok = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getsalaryApproveOkButton()));
		salaryApproverButtonok.click();
	    Thread.sleep(3000);
	}

}
