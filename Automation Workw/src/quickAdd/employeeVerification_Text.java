package quickAdd;

import org.testng.annotations.Test;

import signin.Login_Method;
import signin.TestBase;
import user.urls.testArguments.getterMethod_Defaults;

public class employeeVerification_Text extends TestBase{
	@Test
	public void employeeVerify() throws InterruptedException {
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		driver.get(defaults.getwebUrl());
//		Thread.sleep(2000);
		Login_Method login = new Login_Method(driver);
		login.sign_in(defaults.getrmployeeEmail(),defaults.getemployeepassword());
//		Thread.sleep(7000);
		quick_Method emp = new quick_Method(driver);
		emp.employee_Verification("Ko Nect");
	}

}
