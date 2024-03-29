package group;

import org.testng.annotations.Test;

import App.ApplicationNew;
import signin.Login_Method;
import signin.TestBase;
import user.urls.testArguments.getterMethod_Defaults;

public class groupCreateTest extends TestBase {
	@Test (priority =1 )
	public Boolean groupCreate(Integer loop ,Integer value, String email, String password) throws InterruptedException {
		setUp(); 
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		  String currentURL = "";

		
		 try {
			 long startTime = System.currentTimeMillis();
			  long pageLoadTime = System.currentTimeMillis() - startTime;

				driver.get(defaults.getwebUrl());
				//Thread.sleep(2000);
				Login_Method login = new Login_Method(driver);
				login.sign_in(email,password);
				
				//Thread.sleep(5000);
				groupMethod group = new groupMethod(driver);
			 group.navigation(loop,value);
			 ApplicationNew.resTime("Response time: " + pageLoadTime + " milliseconds" );
			 ApplicationNew.logError("Group Creation Test Sucessfull");
		        // If createPost is successful, tearDown and return true
		        tearDown();
				 return true;

		 } catch (Exception e) {
			 currentURL = driver.getCurrentUrl();
			 ApplicationNew.logError("Error occurred during Creation Of Group on URL: " + currentURL + "\nError message: "  + e.getMessage());
		        return false;
		 }
		 finally {
			 // Handle exceptions or log errors if createPost fails
		      //  e.printStackTrace(); // Replace with appropriate logging
		        tearDown(); // Still call tearDown in case cleanup is needed
		 }
	
	}
	
	
	
	@Test (priority =2 )
	public Boolean groupAddFeatures(Integer loop ,Integer value, String email, String password) throws InterruptedException {
		setUp(); 
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		  String currentURL = "";

		
		 try {
			 long startTime = System.currentTimeMillis();
			  long pageLoadTime = System.currentTimeMillis() - startTime;

				driver.get(defaults.getwebUrl());
				//Thread.sleep(2000);
				Login_Method login = new Login_Method(driver);
				login.sign_in(email,password);
				
				//Thread.sleep(5000);
				groupMethod group = new groupMethod(driver);
			 group.addingFeature();
			 ApplicationNew.resTime("Response time: " + pageLoadTime + " milliseconds" );
			 ApplicationNew.logError("Group Creation Test Sucessfull");
		        // If createPost is successful, tearDown and return true
		        tearDown();
				 return true;

		 } catch (Exception e) {
			 currentURL = driver.getCurrentUrl();
			 ApplicationNew.logError("Error occurred during Creation Of Group on URL: " + currentURL + "\nError message: "  + e.getMessage());
		        return false;
		 }
		 finally {
			 // Handle exceptions or log errors if createPost fails
		      //  e.printStackTrace(); // Replace with appropriate logging
		        tearDown(); // Still call tearDown in case cleanup is needed
		 }
	
	}
}
