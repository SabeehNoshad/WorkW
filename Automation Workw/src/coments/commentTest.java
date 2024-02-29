package coments;

import org.testng.annotations.Test;

import clockInClockOut.clockinMethod;
import signin.Login_Method;
import signin.TestBase;
import user.urls.testArguments.getterMethod_Defaults;

public class commentTest extends TestBase {
	@Test 
	public boolean commentsTest (Integer times, String email, String pass) throws InterruptedException {
		setUp();
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		driver.get(defaults.getwebUrl());
		//Thread.sleep(2000);
		Login_Method login = new Login_Method(driver);
		login.sign_in(email,pass);
		//Thread.sleep(5000);
		comentsMethod coment = new comentsMethod(driver);
	
		 try {
			 coment.comentRoute(times);
		        tearDown();
		        return true;
		       
		 } catch (Exception e) {
		 
			 // Handle exceptions or log errors if createPost fails
		        e.printStackTrace(); // Replace with appropriate logging
		        tearDown(); // Still call tearDown in case cleanup is needed
		        return false;
		        
		}
		
	}
	
	@Test 
	public boolean commentLeadManagerTest (Integer times, String email, String pass) throws InterruptedException {
		setUp();
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		driver.get(defaults.getwebUrl());
		//Thread.sleep(2000);
		Login_Method login = new Login_Method(driver);
		login.sign_in(email,pass);
		//Thread.sleep(5000);
		comentsMethod coment = new comentsMethod(driver);
	
		 try {
			 coment.commentOnLead(times);
		        tearDown();
		        return true;
		       
		 } catch (Exception e) {
		 
			 // Handle exceptions or log errors if createPost fails
		        e.printStackTrace(); // Replace with appropriate logging
		        tearDown(); // Still call tearDown in case cleanup is needed
		        return false;
		        
		}
		
	}
	
}
