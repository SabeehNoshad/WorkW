package humanResourse.loan;

import org.testng.annotations.Test;

import signin.Login_Method;
import signin.TestBase;
import user.urls.testArguments.getterMethodTextFile;
import user.urls.testArguments.getterMethod_Defaults;

public class loan_Test extends TestBase {
	@Test
	public Boolean loanCreate(Integer loop,String email,String pass) throws InterruptedException {
		setUp();
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		driver.get(defaults.getwebUrl());
		//Thread.sleep(5000);
		Login_Method login = new Login_Method(driver);
		//login.sign_in(defaults.getrmployeeEmail(), defaults.getemployeepassword());
		//login.sign_in(defaults.getadminWorkWiseEmail(), defaults.getAdminWorkWisePassword());
		login.sign_in(email,pass);

		//Thread.sleep(7000);
		loan_Method loanmeth = new loan_Method(driver);
	
		//Thread.sleep(5000);
		 try {
				loanmeth.loanCreateComposer(loop);
		        // If createPost is successful, tearDown and return true
		        tearDown();
		        return true;
		    } catch (Exception e) {
		        // Handle exceptions or log errors if createPost fails
		        e.printStackTrace(); // Replace with appropriate logging
		        tearDown(); // Still call tearDown in case cleanup is needed
		        return false;
		    }
	}

}
