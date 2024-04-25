package clockInClockOut;

import java.io.IOException;

import org.openqa.selenium.devtools.v85.network.model.Request;
import org.testng.annotations.Test;

import App.ApplicationNew;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import signin.Login_Method;
import signin.TestBase;
import user.urls.testArguments.getterMethod_Defaults;

public class clockIn_Test extends TestBase {
	@Test 
	public boolean clockInMessageTest( String email, String pass) throws InterruptedException {
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
				clockinMethod clock = new clockinMethod(driver);
			 clock.clockInMethod();
			 ApplicationNew.resTime("Response time: " + pageLoadTime + " milliseconds" );
			 ApplicationNew.logError("Clock In/Out Test Sucessfull");
		        tearDown();
		        return true;
		       
		 } catch (Exception e) {
			 currentURL = driver.getCurrentUrl();
			 ApplicationNew.logError("Error occurred during ClockIn/Out on URL: " + currentURL + "\nError message: "  + e.getMessage());
		        return false;
		 }
		 finally {
			 // Handle exceptions or log errors if createPost fails
		      //  e.printStackTrace(); // Replace with appropriate logging
		        tearDown(); // Still call tearDown in case cleanup is needed
		 }
		
	}
		
	}


