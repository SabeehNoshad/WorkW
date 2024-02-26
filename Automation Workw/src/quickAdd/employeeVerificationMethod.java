package quickAdd;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Xpaths.getterMethods;
import signin.Base_page;

public class employeeVerificationMethod extends Base_page{

	public employeeVerificationMethod(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void employeeDefaultValuesVerification(String employee_name_new) throws InterruptedException {
		getterMethods def = new getterMethods();
		driver.findElement(def.getEmployeeNavBarOpt()).click();
//		Thread.sleep(5000);
		driver.findElement(def.getEmployeeSearchBar()).click();
		driver.findElement(def.getEmployeeSearchBar()).sendKeys(employee_name_new);
	//	Thread.sleep(5000);
		driver.findElement(def.getemployeeUpdateButton()).click();
//		Thread.sleep(5000);
		//String managerName= driver.findElement(def.getemployeeManagerName()).getText();
		String accessRole = driver.findElement(def.getemployeeAccessRole()).getText();
		String countryName = driver.findElement(def.getemployeeCountryName()).getText();
		//String cityName = driver.findElement(def.getemployeeCityName()).getText();
	//	Thread.sleep(3000);
		//Assert.assertEquals(managerName, "Sabeeh Noshad");
		Assert.assertEquals(accessRole, "Admin");
		Assert.assertEquals(countryName, "Pakistan");
		//Assert.assertEquals(cityName, "Karachi - Pakistan");
	
		
		
		
		
	}

}
