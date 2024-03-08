package humanResourse.promotion;

import org.testng.annotations.Test;

import App.ApplicationNew;
import signin.Login_Method;
import signin.TestBase;
import user.urls.testArguments.getterMethodTextFile;
import user.urls.testArguments.getterMethod_Defaults;

public class promotion_Test extends TestBase {
	@Test (priority =1 )
	public Boolean createPromotionTest(Integer loop,String email,String pass,String company) throws InterruptedException {
		setUp();
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		  String currentURL = "";

		//Thread.sleep(5000);
		 try {
				driver.get(defaults.getwebUrl());
				//Thread.sleep(5000);
				Login_Method login = new Login_Method(driver);
				//login.sign_in(defaults.getrmployeeEmail(), defaults.getemployeepassword());
				login.sign_in(email,pass);

				//Thread.sleep(5000);
				promotion_Method promoMeth = new promotion_Method(driver); 
				promoMeth.createPromoComposer(loop,company);		
		        // If createPost is successful, tearDown and return true
		        tearDown();
		        return true;
		 } catch (Exception e) {
			 currentURL = driver.getCurrentUrl();
			 ApplicationNew.logError("Error occurred during localizationTest on URL: " + currentURL + "\nError message: "  + e.getMessage());
		        return false;
		 }
		 finally {
			 // Handle exceptions or log errors if createPost fails
		      //  e.printStackTrace(); // Replace with appropriate logging
		        tearDown(); // Still call tearDown in case cleanup is needed
		 }
	} 
}
