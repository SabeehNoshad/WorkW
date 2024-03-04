package group;

import org.testng.annotations.Test;

import App.ApplicationNew;
import signin.Login_Method;
import signin.TestBase;
import user.urls.testArguments.getterMethod_Defaults;

public class groupCreateTest extends TestBase {
	@Test (priority =1 )
	public Boolean groupCreate(Integer loop , String email, String password) throws InterruptedException {
		setUp(); 
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		  String currentURL = "";

		
		 try {

				driver.get(defaults.getwebUrl());
				//Thread.sleep(2000);
				Login_Method login = new Login_Method(driver);
				login.sign_in(email,password);
				
				//Thread.sleep(5000);
				groupMethod group = new groupMethod(driver);
			 group.navigation(loop);

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
