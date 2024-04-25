package workboard;

import org.testng.annotations.Test;

import App.ApplicationNew;
import signin.Login_Method;
import signin.TestBase;
import user.urls.testArguments.getterMethod_Defaults;

public class workBoardTest extends TestBase {
	@Test 
	public Boolean workBoardCreateAndSectionAndTodos(Integer loop,Integer Value,String email,String password,String company) throws InterruptedException {
		setUp();
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		  String currentURL = "";

	
		 try {
			 long startTime = System.currentTimeMillis();
			  long pageLoadTime = System.currentTimeMillis() - startTime;

				driver.get(defaults.getwebUrl());
				//	Thread.sleep(2000);
					Login_Method login = new Login_Method(driver);
					login.sign_in(email,password);
					workboardMethod work = new workboardMethod(driver);
			 work.workBoardRoute(loop,Value,company);	        // If createPost is successful, tearDown and return true
			 ApplicationNew.resTime("Response time: " + pageLoadTime + " milliseconds" );
			 ApplicationNew.logError("WorkBoard + Todo Created Sucessfully");   
			 tearDown();
		        return true;
		 } catch (Exception e) {
			 currentURL = driver.getCurrentUrl();
			 ApplicationNew.logError("Error occurred during WorkBoard Creation on URL: " + currentURL + "\nError message: "  + e.getMessage());
		        return false;
		 }
		 finally {
			 // Handle exceptions or log errors if createPost fails
		      //  e.printStackTrace(); // Replace with appropriate logging
		        tearDown(); // Still call tearDown in case cleanup is needed
		 }
	
}
}