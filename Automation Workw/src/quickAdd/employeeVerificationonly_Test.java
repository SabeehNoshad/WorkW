package quickAdd;

import org.testng.annotations.Test;

import signin.Login_Method;
import signin.TestBase;
import user.urls.testArguments.getterMethod_Defaults;

public class employeeVerificationonly_Test extends TestBase {
	@Test 
	public void testLogin() throws InterruptedException {
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		driver.get(defaults.getwebUrl());
//		Thread.sleep(2000);
		Login_Method login = new Login_Method(driver);
		login.sign_in(defaults.getrmployeeEmail(),defaults.getemployeepassword());
//		Thread.sleep(5000);
		employeeVerificationMethod emp = new employeeVerificationMethod(driver);
		emp.employeeDefaultValuesVerification("Ko Nect");
		
	} 

}
