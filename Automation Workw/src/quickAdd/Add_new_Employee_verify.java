package quickAdd;

import org.testng.annotations.Test;

import signin.Login_Method;
import signin.TestBase;

public class Add_new_Employee_verify extends TestBase {
	@Test
	public void employeeAddverify() throws InterruptedException {
		driver.get("https://www.workw.com");
	//	Thread.sleep(2000);
		Login_Method login = new Login_Method(driver);
		login.sign_in("sabeeh@miletap.com", "string");
		//Thread.sleep(7000);
		quick_Method quick =new quick_Method(driver);
		//quick.Add_employee(1);
	}
	@Test
	public void employeeVerify() throws InterruptedException {
		driver.get("https://www.workw.com");
		//Thread.sleep(2000);
		Login_Method login = new Login_Method(driver);
		login.sign_in("sabeeh@miletap.com", "string");
		//Thread.sleep(7000);
		quick_Method emp = new quick_Method(driver);
		emp.employee_Verification("Automation Testing");
	}

}
