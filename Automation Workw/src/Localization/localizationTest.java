package Localization;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import App.ApplicationNew;
import signin.Login_Method;
import signin.TestBase;
import user.urls.testArguments.getterMethod_Defaults;

public class localizationTest extends TestBase{
	@Test 
	public boolean localicationlangTest ( By lang,String email, String pass) throws InterruptedException {
		setUp();
		
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		  String currentURL = "";
		//Thread.sleep(2000);
	
		//Thread.sleep(5000);
		
		
		 try {
			 long startTime = System.currentTimeMillis();
			  long pageLoadTime = System.currentTimeMillis() - startTime;
			 driver.get(defaults.getwebUrl());
	         
				Login_Method login = new Login_Method(driver);
				login.sign_in(email,pass);
				localicationMethod lcl = new localicationMethod(driver);
			 	lcl.languageSelect(lang);
			 	 ApplicationNew.resTime("Response time: " + pageLoadTime + " milliseconds" );
				 ApplicationNew.logError("Localization Test SucessFull");
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


