package resignation;

import org.testng.annotations.Test;

import salary.salaryMethod;
import signin.Login_Method;
import signin.TestBase;
import user.urls.testArguments.getterMethod_Defaults;

public class resignationTest extends TestBase {
	@Test 
	public boolean createResignationTest(Integer i ,String email,String password) throws InterruptedException {
		setUp();
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		driver.get(defaults.getwebUrl());
//		Thread.sleep(2000);
		Login_Method login = new Login_Method(driver);
		login.sign_in(email,password);
	//	Thread.sleep(10000);
		resignationMethod resig = new resignationMethod(driver);
		 try {
			 resig.reginationRoute(i);
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
