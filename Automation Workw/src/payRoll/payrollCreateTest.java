package payRoll;

import org.testng.annotations.Test;

import signin.Login_Method;
import signin.TestBase;
import travel.travelMethod;
import user.urls.testArguments.getterMethod_Defaults;

public class payrollCreateTest extends TestBase {
	@Test
	public void travelCreateTest() throws InterruptedException {
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		driver.get(defaults.getwebUrl());
//		Thread.sleep(2000);
		Login_Method login = new Login_Method(driver);
	//login.sign_in(defaults.getrmployeeEmail(),defaults.getemployeepassword());
//		login.sign_in(defaults.getadminWorkWiseEmail(), defaults.getAdminWorkWisePassword());
		login.sign_in(defaults.getuerAutomatestingEmail(), defaults.getuerAutomatestingPassword());

		//	Thread.sleep(7000);
		payRollMethod payroll = new payRollMethod(driver);
		payroll.payrollRoute(50);
	} 
}
