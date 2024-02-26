package group;

import org.testng.annotations.Test;

import project.projectMethod;
import signin.Login_Method;
import signin.TestBase;
import user.urls.testArguments.getterMethod_Defaults;

public class groupTaskVerification extends TestBase {
	@Test 
	public void groupTaskVerification() throws InterruptedException {
		 
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		driver.get(defaults.getwebUrl());
		//Thread.sleep(2000);
		Login_Method login = new Login_Method(driver);
		login.sign_in(defaults.getrmployeeEmail(), defaults.getemployeepassword());
		//Thread.sleep(7000);
		groupMethod project= new groupMethod(driver);
		project.verifyTask();
	
	}
}
