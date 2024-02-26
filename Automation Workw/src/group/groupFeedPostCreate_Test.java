package group;

import org.testng.annotations.Test;

import signin.Login_Method;
import signin.TestBase;
import user.urls.testArguments.getterMethod_Defaults;

public class groupFeedPostCreate_Test extends TestBase {

	@Test (priority =1 )
	public void groupCreate() throws InterruptedException {
		 
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		driver.get(defaults.getwebUrl());
		//Thread.sleep(2000);
		Login_Method login = new Login_Method(driver);
		login.sign_in(defaults.getrmployeeEmail(), defaults.getemployeepassword());
		//Thread.sleep(5000);
		groupMethod group = new groupMethod(driver);
		
		group.createPostInGroup(40);
		Thread.sleep(2000);
		}
	}

