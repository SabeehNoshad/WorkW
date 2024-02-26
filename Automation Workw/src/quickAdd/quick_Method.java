package quickAdd;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Xpaths.getterMethods;
import signin.Base_page;
import user.urls.testArguments.getterMethodTextFile;

public class quick_Method extends Base_page {
	getterMethods xpaths = new getterMethods();
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  getterMethodTextFile text = new getterMethodTextFile();
	public quick_Method(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	 public void Add_employee(Integer times,String company) throws InterruptedException {
	  WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getQuickAddOpt()));
		  element.click();

		for (int i = 1; i <= times ; i++) {
			WebElement userNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getFirstNameField()));
			userNameField.sendKeys(text.getuserFirstName());
			if (company == "miletap") {
				  WebElement firstName = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getFirstNameField()));
				  firstName.sendKeys(i + text.getuserFirstName());
				  WebElement LastName = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getLastNameField()));
				  LastName.sendKeys(text.getuserLastName());
				  driver.findElement(xpaths.getEmailField()).sendKeys(text.getuserFirstName() + i +text.getuserLastName() + "@gmail.com");
			}
			else {
				 WebElement firstName = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getFirstNameField()));
				  firstName.sendKeys(i + text.getcompanyFirstname());
				  WebElement LastName = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getLastNameField()));
				  LastName.sendKeys(text.getCompanyLastName());
				  driver.findElement(xpaths.getEmailField()).sendKeys(text.getcompanyFirstname() + i +text.getCompanyLastName() + "@gmail.com");
			}
		
		
		 driver.findElement(xpaths.getDesignationField()).click();
		 driver.findElement(xpaths.getDesignationValueField()).sendKeys(text.getemployeeDesignation());
		 
		 WebElement desigantioSelect = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getDesignationSelectValueField()));
		 desigantioSelect.click();
		
		 driver.findElement(xpaths.getPhoneNumberField()).sendKeys(i+text.getleadNumber());
	//	 Thread.sleep(3000);
		
		 driver.findElement(xpaths.getAddButton()).click();
	//   Thread.sleep(1000);
		}
		Thread.sleep(3000);
		
		 WebElement submitButton = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getSubmitButton()));
		 submitButton.click();
		 

		 
	Thread.sleep(7000);
		 
		 
	 }
	 // employee verification method 
	 public void employee_Verification(String employee_name) throws InterruptedException {
		 getterMethods employee = new getterMethods();
		 driver.findElement(employee.getEmployeeNavBarOpt()).click();
		// Thread.sleep(2000);
		 driver.findElement(employee.getEmployeeSearchBar()).click();
		 driver.findElement(employee.getEmployeeSearchBar()).sendKeys(employee_name);
//		 Thread.sleep(2000);
		 String verificationName = driver.findElement(employee.getEmployeeSearchListing()).getText();
	//	 Thread.sleep(2000);
		 Assert.assertEquals(verificationName, employee_name);
		// Thread.sleep(2000);

		 
	 }
}
