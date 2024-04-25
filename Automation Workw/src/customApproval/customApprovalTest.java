package customApproval;

import org.testng.annotations.Test;

import App.ApplicationNew;
import signin.Login_Method;
import signin.TestBase;

import user.urls.testArguments.getterMethod_Defaults;

public class customApprovalTest extends TestBase{
	@Test
	public boolean CustomApprovalCreateTest(Integer loop,String email,String Password) throws InterruptedException {
		setUp();
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		  String currentURL = "";

		 try {
			 long startTime = System.currentTimeMillis();
			  long pageLoadTime = System.currentTimeMillis() - startTime;

				driver.get(defaults.getwebUrl());
//				Thread.sleep(2000);
				Login_Method login = new Login_Method(driver);
			   login.sign_in(email,Password);
				

				//	Thread.sleep(7000);
				customApprovalMethod Cust =new customApprovalMethod(driver);
			 Cust.CustomApprovalRoute(loop);
			 ApplicationNew.resTime("Response time: " + pageLoadTime + " milliseconds" );
			 ApplicationNew.logError("CustomApproval Creation Test Sucessfull");
		        tearDown();
		        return true;
		 } catch (Exception e) {
			 currentURL = driver.getCurrentUrl();
			 ApplicationNew.logError("Error occurred during CustomApproval Creation on URL: " + currentURL + "\nError message: "  + e.getMessage());
		        return false;
		 }
		 finally {
			 // Handle exceptions or log errors if createPost fails
		      //  e.printStackTrace(); // Replace with appropriate logging
		        tearDown(); // Still call tearDown in case cleanup is needed
		 }
		
	} 

}
