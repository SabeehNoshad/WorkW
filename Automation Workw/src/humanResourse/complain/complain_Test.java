package humanResourse.complain;

import org.testng.annotations.Test;

import App.ApplicationNew;
import signin.Login_Method;
import signin.TestBase;
import user.urls.testArguments.getterMethodTextFile;
import user.urls.testArguments.getterMethod_Defaults;

public class complain_Test extends TestBase {
	@Test (priority =1 )
	public Boolean CreateComplainOff(Integer loop,String email,String pass,String company) throws InterruptedException {
		setUp();
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		  String currentURL = "";

	
		//Thread.sleep(5000);
		
		//Thread.sleep(5000);
		 try {
				driver.get(defaults.getwebUrl());
			 Login_Method login = new Login_Method(driver);
				
				login.sign_in(email,pass);

				//Thread.sleep(5000);
				complain_Method compMeth = new complain_Method(driver);
			
				compMeth.complainCreate(loop,company);
		        // If createPost is successful, tearDown and return true
		        tearDown();
		 } catch (Exception e) {
			 currentURL = driver.getCurrentUrl();
			 ApplicationNew.logError("Error occurred during localizationTest on URL: " + currentURL + "\nError message: "  + e.getMessage());
			 throw e;
		 }
		 finally {
			 // Handle exceptions or log errors if createPost fails
		      //  e.printStackTrace(); // Replace with appropriate logging
		        tearDown(); // Still call tearDown in case cleanup is needed
		        return false;
		 }
	
		
	} 

}
