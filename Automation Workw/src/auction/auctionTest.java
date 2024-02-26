package auction;

import org.testng.annotations.Test;

import signin.Login_Method;
import signin.TestBase;
import user.urls.testArguments.getterMethod_Defaults;

public class auctionTest extends TestBase {
	@Test
	// auction only available in workwise company not available in other companies
	
	public void auctionCreateTest() throws InterruptedException {
		
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		driver.get(defaults.getwebUrl());
	//	Thread.sleep(2000);
		Login_Method login = new Login_Method(driver);
		auctionMehtod auction = new auctionMehtod(driver);
		login.sign_in(defaults.getrmployeeEmail(), defaults.getemployeepassword());
	//	login.sign_in(defaults.getadminWorkWiseEmail(), defaults.getAdminWorkWisePassword());
	//	login.sign_in(defaults.getSuperAdminEmail(), defaults.getSuperAdminPassword());

		//		Thread.sleep(5000);
	
		auction.auctionRoute(5);
	}
}
