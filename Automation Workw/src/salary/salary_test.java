package salary;

import org.testng.annotations.Test;

import signin.Login_Method;
import signin.TestBase;
import user.urls.testArguments.getterMethodTextFile;
import user.urls.testArguments.getterMethod_Defaults;

// run this test in large screen or wuth min resolution 
public class salary_test extends TestBase {
	@Test 
	public boolean createSalaryTest(String email,String password,String company) throws InterruptedException {
		setUp();
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		driver.get(defaults.getwebUrl());
//		Thread.sleep(2000);
		Login_Method login = new Login_Method(driver);
		login.sign_in(email,password);
	//	Thread.sleep(10000);
		salaryMethod salary = new salaryMethod(driver);
		 try {
			 salary.salaryModuleClick(company);
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