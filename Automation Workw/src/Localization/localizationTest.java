package Localization;

import org.testng.annotations.Test;

import signin.Login_Method;
import signin.TestBase;
import user.urls.testArguments.getterMethod_Defaults;

public class localizationTest extends TestBase{
	@Test 
	public boolean localicationlangTest ( String email, String pass) throws InterruptedException {
		setUp();
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		driver.get(defaults.getwebUrl());
		//Thread.sleep(2000);
		Login_Method login = new Login_Method(driver);
		login.sign_in(email,pass);
		//Thread.sleep(5000);
		localicationMethod lcl = new localicationMethod(driver);
		 try {
			 	lcl.languageSelect();
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
