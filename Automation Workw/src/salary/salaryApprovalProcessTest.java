package salary;

import org.testng.annotations.Test;

import signin.Login_Method;
import signin.TestBase;
import user.urls.testArguments.getterMethodTextFile;
import user.urls.testArguments.getterMethod_Defaults;

public class salaryApprovalProcessTest extends TestBase {
	@Test 
	public void createSalaryTest() throws InterruptedException {
		
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		driver.get(defaults.getwebUrl());
//		Thread.sleep(2000);
		Login_Method login = new Login_Method(driver);
		login.sign_in(defaults.getapproverEmail(), defaults.getapproverPassword());
	//	Thread.sleep(10000);
		salaryMethod salary = new salaryMethod(driver);
		salary.salaryApprovalMethod();
		//text.getmemberSelectName()
}
}