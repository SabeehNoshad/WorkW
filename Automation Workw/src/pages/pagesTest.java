package pages;

import org.testng.annotations.Test;

import App.ApplicationNew;
import clockInClockOut.clockinMethod;
import signin.Login_Method;
import signin.TestBase;
import user.urls.testArguments.getterMethod_Defaults;

public class pagesTest extends TestBase {
	@Test 
	public boolean pagesMethodTest(Integer times,String email, String pass) throws InterruptedException {
		setUp();
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		  String currentURL = "";

	
	
		 try {
			 long startTime = System.currentTimeMillis();

				driver.get(defaults.getwebUrl());
				//Thread.sleep(2000);
				Login_Method login = new Login_Method(driver);
				login.sign_in(email,pass);
				  long pageLoadTime = System.currentTimeMillis() - startTime;

//		       
				//Thread.sleep(5000);
				pagesMethod page = new pagesMethod(driver);
			 page.pageRoute(times);;
			 ApplicationNew.resTime("Response time: " + pageLoadTime + " milliseconds" );
			 ApplicationNew.logError("Pages Create Test Sucessfull");
		        tearDown();
		        return true;
		       
		 } catch (Exception e) {
			 currentURL = driver.getCurrentUrl();
			 ApplicationNew.logError("Error occurred during Pages Creation on URL: " + currentURL + "\nError message: "  + e.getMessage());
		        return false;
		 }
		 finally {
			 // Handle exceptions or log errors if createPost fails
		      //  e.printStackTrace(); // Replace with appropriate logging
		        tearDown(); // Still call tearDown in case cleanup is needed
		 }
		
	}
		
}
