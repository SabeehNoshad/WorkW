package humanResourse.loan;

import org.testng.annotations.Test;

import App.ApplicationNew;
import signin.Login_Method;
import signin.TestBase;
import user.urls.testArguments.getterMethodTextFile;
import user.urls.testArguments.getterMethod_Defaults;

public class loan_Test extends TestBase {
	@Test
	public Boolean loanCreate(Integer loop,String email,String pass) throws InterruptedException {
		setUp();
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		  String currentURL = "";

		 try {
			 long startTime = System.currentTimeMillis();
			  long pageLoadTime = System.currentTimeMillis() - startTime;

				driver.get(defaults.getwebUrl());
				//Thread.sleep(5000);
				Login_Method login = new Login_Method(driver);
				//login.sign_in(defaults.getrmployeeEmail(), defaults.getemployeepassword());
				//login.sign_in(defaults.getadminWorkWiseEmail(), defaults.getAdminWorkWisePassword());
				login.sign_in(email,pass);

				//Thread.sleep(7000);
				loan_Method loanmeth = new loan_Method(driver);
				loanmeth.loanCreateComposer(loop);
				 ApplicationNew.resTime("Response time: " + pageLoadTime + " milliseconds" );
				 ApplicationNew.logError("Loan Sucessfully Created ");
		        // If createPost is successful, tearDown and return true
		        tearDown();
		        return true;
		 } catch (Exception e) {
			 currentURL = driver.getCurrentUrl();
			 ApplicationNew.logError("Error occurred during Loan Creation  on URL: " + currentURL + "\nError message: "  + e.getMessage());
		        return false;
		 }
		 finally {
			 // Handle exceptions or log errors if createPost fails
		      //  e.printStackTrace(); // Replace with appropriate logging
		        tearDown(); // Still call tearDown in case cleanup is needed
		 }
	}
	@Test
	public Boolean workWiseLoan( String email,String pass) throws InterruptedException {
		setUp();
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		  String currentURL = "";

		 try {
			 long startTime = System.currentTimeMillis();
			  long pageLoadTime = System.currentTimeMillis() - startTime;

				driver.get(defaults.getwebUrl());
				//Thread.sleep(5000);
				Login_Method login = new Login_Method(driver);
				//login.sign_in(defaults.getrmployeeEmail(), defaults.getemployeepassword());
				//login.sign_in(defaults.getadminWorkWiseEmail(), defaults.getAdminWorkWisePassword());
				login.sign_in(email,pass);

				//Thread.sleep(7000);
				loan_Method loanmeth = new loan_Method(driver);
				loanmeth.workWiseLoan();
				 ApplicationNew.resTime("Response time: " + pageLoadTime + " milliseconds" );
				 ApplicationNew.logError("WorkWise Loan Sucessfully Created ");
		        // If createPost is successful, tearDown and return true
		        tearDown();
		        return true;
		 } catch (Exception e) {
			 currentURL = driver.getCurrentUrl();
			 ApplicationNew.logError("Error occurred during WorkWiseLoan Creation  on URL: " + currentURL + "\nError message: "  + e.getMessage());
		        return false;
		 }
		 finally {
			 // Handle exceptions or log errors if createPost fails
		      //  e.printStackTrace(); // Replace with appropriate logging
		        tearDown(); // Still call tearDown in case cleanup is needed
		 }
	}

}
