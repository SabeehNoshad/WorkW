package humanResourse.bonus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import App.ApplicationNew;
import signin.Login_Method;
import signin.TestBase;
import user.urls.testArguments.getterMethodTextFile;
import user.urls.testArguments.getterMethod_Defaults;

public class bonus_Test extends TestBase {
	@Test (priority =1 )
	public Boolean BonusCreation(Integer loop,String email,String pass,String company) throws InterruptedException {
		setUp();
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		
		getterMethodTextFile text = new getterMethodTextFile();
		  String currentURL = "";

		
		 try {
			 driver.get(defaults.getwebUrl());
				//Thread.sleep(3000);
				
				Login_Method login = new Login_Method(driver);
			
				login.sign_in(email,pass);

				bonus_Method bonusmethod = new bonus_Method(driver);
				bonusmethod.bonusClickAndComposer(loop,company );
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
