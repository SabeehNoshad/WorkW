package humanResourse.warnings;

import org.testng.annotations.Test;

import signin.Login_Method;
import signin.TestBase;
import user.urls.testArguments.getterMethodTextFile;
import user.urls.testArguments.getterMethod_Defaults;

public class warning_Test extends TestBase {
	@Test 
	public Boolean createWarning(Integer loop,String email,String pass,String company) throws InterruptedException {
		setUp();
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		driver.get(defaults.getwebUrl());
		Login_Method login = new Login_Method(driver);
		login.sign_in(email,pass);

		warning_Method warmeth = new warning_Method(driver);
		try {
			warmeth.warning(loop,company);
	        // If createPost is successful, tearDown and return true
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
