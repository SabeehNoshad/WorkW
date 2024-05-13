package responsivness;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import App.ApplicationNew;
import Localization.localicationMethod;
import auction.auctionMehtod;
import signin.Login_Method;
import signin.TestBase;
import user.urls.testArguments.getterMethod_Defaults;

public class responsivness_Test extends TestBase {
	@Test 
	public boolean responsiveTest(  String email, String pass) throws InterruptedException {
		setUp();
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		  String currentURL = "";

	
	
		 try {
			 long startTime = System.currentTimeMillis();

				driver.get(defaults.getwebUrl());
				//Thread.sleep(2000);
				Login_Method login = new Login_Method(driver);
				login.sign_in(email,pass);
				  long pageLoadTime = System.currentTimeMillis() - startTime;

//		       
				//Thread.sleep(5000);
				//  responsiveMethod responsive = new responsiveMethod(driver);
				  responsiveMethod.testViewportSize(driver,344,882);
				  localicationMethod screen= new localicationMethod(driver);
				  screen.ModuleHuntresponsive();
				//  responsiveMethod.testViewportSize(driver,320,480);
			 ApplicationNew.resTime("Response time: " + pageLoadTime + " milliseconds" );
			 ApplicationNew.logError("Auction Test Sucessfull");
		        tearDown();
		        return true;
		       
		 } catch (Exception e) {
			 currentURL = driver.getCurrentUrl();
			 ApplicationNew.logError("Error occurred during Auction on URL: " + currentURL + "\nError message: "  + e.getMessage());
		        return false;
		 }
		 finally {
			 // Handle exceptions or log errors if createPost fails
		      //  e.printStackTrace(); // Replace with appropriate logging
		        tearDown(); // Still call tearDown in case cleanup is needed
		 }
		
	}
	@Test 
	public boolean responsiveTestTablet(  String email, String pass) throws InterruptedException {
		setUp();
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		  String currentURL = "";

	
	
		 try {
			 long startTime = System.currentTimeMillis();

				driver.get(defaults.getwebUrl());
				//Thread.sleep(2000);
				Login_Method login = new Login_Method(driver);
				login.sign_in(email,pass);
				  long pageLoadTime = System.currentTimeMillis() - startTime;

//		       
				//Thread.sleep(5000);
				//  responsiveMethod responsive = new responsiveMethod(driver);
				  responsiveMethod.testViewportSize(driver,768,1024);
				  localicationMethod screen= new localicationMethod(driver);
				  screen.ModuleHuntresponsive();
				//  responsiveMethod.testViewportSize(driver,320,480);
			 ApplicationNew.resTime("Response time: " + pageLoadTime + " milliseconds" );
			 ApplicationNew.logError("Auction Test Sucessfull");
		        tearDown();
		        return true;
		       
		 } catch (Exception e) {
			 currentURL = driver.getCurrentUrl();
			 ApplicationNew.logError("Error occurred during Auction on URL: " + currentURL + "\nError message: "  + e.getMessage());
		        return false;
		 }
		 finally {
			 // Handle exceptions or log errors if createPost fails
		      //  e.printStackTrace(); // Replace with appropriate logging
		        tearDown(); // Still call tearDown in case cleanup is needed
		 }
		
	}	

}
