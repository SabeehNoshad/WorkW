package travel;


import org.testng.annotations.Test;

import signin.Login_Method;
import signin.TestBase;
import user.urls.testArguments.getterMethod_Defaults;

public class travelTest extends TestBase {
	@Test
	public boolean travelCreateTest(Integer loop,String email,String Password) throws InterruptedException {
		setUp();
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		driver.get(defaults.getwebUrl());
//		Thread.sleep(2000);
		Login_Method login = new Login_Method(driver);
	   login.sign_in(email,Password);
		

		//	Thread.sleep(7000);
		travelMethod trav =new travelMethod(driver);
		 try {
				trav.createComposer(loop);
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

