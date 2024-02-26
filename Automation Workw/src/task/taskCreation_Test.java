package task;

import org.testng.annotations.Test;

import signin.Login_Method;
import signin.TestBase;
import user.urls.testArguments.getterMethod_Defaults;

public class taskCreation_Test extends TestBase{
	
	@Test (priority = 1)
	public boolean testCreateTestCond1(Integer i , String email,String pass) throws InterruptedException {
		setUp();
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		driver.get(defaults.getwebUrl());
//		Thread.sleep(2000);
		Login_Method login = new Login_Method(driver);
//		login.sign_in(defaults.getrmployeeEmail(), defaults.getemployeepassword());
		login.sign_in(email,pass);

		//	Thread.sleep(5000);
		taskCreationMethod task = new taskCreationMethod(driver);
		//Thread.sleep(5000);
		 try {
			 task.taskCreationFeedOpt(i);
		        tearDown();
		        return true;
		       
		 } catch (Exception e) {
		 
			 // Handle exceptions or log errors if createPost fails
		        e.printStackTrace(); // Replace with appropriate logging
		        tearDown(); // Still call tearDown in case cleanup is needed
		        return false;
		        
		}
		
}
	@Test (priority = 2)
	public void testCreateTestCond2() throws InterruptedException {
		
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		driver.get(defaults.getwebUrl());
//		Thread.sleep(2000);
		Login_Method login = new Login_Method(driver);
//		login.sign_in(defaults.getrmployeeEmail(), defaults.getemployeepassword());
		login.sign_in(defaults.getuerAutomatestingEmail(), defaults.getuerAutomatestingPassword());

		//	Thread.sleep(5000);
		taskCreationMethod task = new taskCreationMethod(driver);
		task.taskCreationFeedOpt(50);
		//Thread.sleep(5000);
}
	@Test (priority = 3)
	public void testCreateTestCond3() throws InterruptedException {
		
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		driver.get(defaults.getwebUrl());
//		Thread.sleep(2000);
		Login_Method login = new Login_Method(driver);
		login.sign_in(defaults.getuerAutomatestingEmail(), defaults.getuerAutomatestingPassword());

//		login.sign_in(defaults.getrmployeeEmail(), defaults.getemployeepassword());
	//	Thread.sleep(7000);
		taskCreationMethod task = new taskCreationMethod(driver);
		task.taskCreationFeedOpt(50);
		//Thread.sleep(5000);
}
}
