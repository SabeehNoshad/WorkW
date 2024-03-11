package scheduleModule;

import org.testng.annotations.Test;

import App.ApplicationNew;
import signin.Login_Method;
import signin.TestBase;

import user.urls.testArguments.getterMethod_Defaults;

public class scheduleTest extends TestBase {
	@Test
	public boolean scheduleCreateTest(Integer loop,String email,String Password,String company) throws InterruptedException {
		setUp();
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		  String currentURL = "";

		 try {
			 long startTime = System.currentTimeMillis();
			  long pageLoadTime = System.currentTimeMillis() - startTime;
			 driver.get(defaults.getwebUrl());
				Login_Method login = new Login_Method(driver);
			   login.sign_in(email,Password);

				scheduleMethod sche =new scheduleMethod(driver);
			 sche.scheduleRoute(loop,company);
			 ApplicationNew.resTime("Response time: " + pageLoadTime + " milliseconds" );
			 ApplicationNew.logError("Schedule Created Sucessfully");
		        tearDown();
		        return true;
		       
		 } catch (Exception e) {
			 currentURL = driver.getCurrentUrl();
			 ApplicationNew.logError("Error occurred during Schedule Creation on URL: " + currentURL + "\nError message: "  + e.getMessage());
		        return false;
		 }
		 finally {
			 // Handle exceptions or log errors if createPost fails
		      //  e.printStackTrace(); // Replace with appropriate logging
		        tearDown(); // Still call tearDown in case cleanup is needed
		 }
		
	} 

}
