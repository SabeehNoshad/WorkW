package humanResourse.loan;

import org.testng.annotations.Test;

import signin.Login_Method;
import signin.TestBase;
import user.urls.testArguments.getterMethod_Defaults;

public class LoanMultipleApprover_Test extends TestBase {
	@Test
	public void loanApproverAddTest() throws InterruptedException {
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		driver.get(defaults.getwebUrl());
		//Thread.sleep(2000);
		Login_Method login = new Login_Method(driver);
		login.sign_in(defaults.getrmployeeEmail(),defaults.getemployeepassword());
	//	Thread.sleep(7000);
		loan_Method loanmeth = new loan_Method(driver);
		loanmeth.loanCreationMultipleApprovers("workwise",1000.0 ,20 , "amir", "abcdefghijklmnopqrstuvwxyz");
	} 
}
