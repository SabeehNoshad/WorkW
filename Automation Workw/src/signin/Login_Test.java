package signin;

import user.urls.testArguments.getterMethod_Defaults;



public class Login_Test extends TestBase {
	 



	public void testLogin() throws InterruptedException {
	
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		driver.get(defaults.getwebUrl());
	//	Thread.sleep(2000);
		Login_Method login = new Login_Method(driver);
		login.sign_in(defaults.getrmployeeEmail(), defaults.getemployeepassword());
//		Thread.sleep(5000);
	
	}

}
