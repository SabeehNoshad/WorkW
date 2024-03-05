package expense;

import org.testng.annotations.Test;

import signin.Login_Method;
import signin.TestBase;
import user.urls.testArguments.getterMethodTextFile;
import user.urls.testArguments.getterMethod_Defaults;

public class expenseCreateNavBar_Test extends TestBase {
	@Test 
	public void expenseCreateTest() throws InterruptedException {
		
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		driver.get(defaults.getwebUrl());
		//Thread.sleep(2000);
		Login_Method login = new Login_Method(driver);
		login.sign_in(defaults.getrmployeeEmail(), defaults.getemployeepassword());
		//Thread.sleep(7000);
		expence_Method expense = new expence_Method(driver);
		getterMethodTextFile text = new getterMethodTextFile();
		expense.createExpenseNavBarOption(text.getuserAmmount(),text.getuserdate(),text.getuserModuleDescription500());

}
	
}
