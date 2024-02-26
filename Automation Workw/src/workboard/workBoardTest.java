package workboard;

import org.testng.annotations.Test;

import signin.Login_Method;
import signin.TestBase;
import user.urls.testArguments.getterMethod_Defaults;

public class workBoardTest extends TestBase {
	@Test 
	public Boolean workBoardCreateAndSectionAndTodos(Integer loop,String email,String password,String company) throws InterruptedException {
		setUp();
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		driver.get(defaults.getwebUrl());
	//	Thread.sleep(2000);
		Login_Method login = new Login_Method(driver);
		login.sign_in(email,password);
		workboardMethod work = new workboardMethod(driver);
		 try {
			 work.workBoardRoute(loop,company);	        // If createPost is successful, tearDown and return true
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