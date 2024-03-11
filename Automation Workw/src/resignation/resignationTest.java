package resignation;

import org.testng.annotations.Test;

import App.ApplicationNew;
import salary.salaryMethod;
import signin.Login_Method;
import signin.TestBase;
import user.urls.testArguments.getterMethod_Defaults;

public class resignationTest extends TestBase {
	@Test 
	public boolean createResignationTest(Integer i ,String email,String password) throws InterruptedException {
		setUp();
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		  String currentURL = "";

		 try {
			 long startTime = System.currentTimeMillis();
			  long pageLoadTime = System.currentTimeMillis() - startTime;
			 
			 driver.get(defaults.getwebUrl());
//				Thread.sleep(2000);
				Login_Method login = new Login_Method(driver);
				login.sign_in(email,password);
			//	Thread.sleep(10000);
				resignationMethod resig = new resignationMethod(driver);
			 resig.reginationRoute(i);
			 ApplicationNew.resTime("Response time: " + pageLoadTime + " milliseconds" );
			 ApplicationNew.logError("Resignation Created Sucessfully ");
		        tearDown();
		        return true;
		       
		 } catch (Exception e) {
			 currentURL = driver.getCurrentUrl();
			 ApplicationNew.logError("Error occurred during Resignation Creation on URL: " + currentURL + "\nError message: "  + e.getMessage());
		        return false;
		 }
		 finally {
			 // Handle exceptions or log errors if createPost fails
		      //  e.printStackTrace(); // Replace with appropriate logging
		        tearDown(); // Still call tearDown in case cleanup is needed
		 }
	
}

}
