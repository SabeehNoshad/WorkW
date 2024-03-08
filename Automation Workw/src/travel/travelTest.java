package travel;


import org.testng.annotations.Test;

import App.ApplicationNew;
import signin.Login_Method;
import signin.TestBase;
import user.urls.testArguments.getterMethod_Defaults;

public class travelTest extends TestBase {
	@Test
	public boolean travelCreateTest(Integer loop,String email,String Password) throws InterruptedException {
		setUp();
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		  String currentURL = "";

		 try {
			    driver.get(defaults.getwebUrl());			
				Login_Method login = new Login_Method(driver);
			    login.sign_in(email,Password);
			
				travelMethod trav =new travelMethod(driver);
				trav.createComposer(loop);
		        tearDown();
		        return true;
		       
		 } catch (Exception e) {
			 currentURL = driver.getCurrentUrl();
			 ApplicationNew.logError("Error occurred during localizationTest on URL: " + currentURL + "\nError message: "  + e.getMessage());
		        return false;
		 }
		 finally {
			 // Handle exceptions or log errors if createPost fails
		      //  e.printStackTrace(); // Replace with appropriate logging
		        tearDown(); // Still call tearDown in case cleanup is needed
		 }
		
	} 
	
}

