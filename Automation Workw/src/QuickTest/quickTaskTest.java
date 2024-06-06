package QuickTest;
import org.testng.annotations.Test;
import App.ApplicationNew;
import signin.Login_Method;
import signin.TestBase;
import user.urls.testArguments.getterMethod_Defaults;

public class quickTaskTest extends TestBase {
	@Test
	public boolean quickTask_Test(Integer Loop, String email,String pass) throws InterruptedException {
		setUp();
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		  String currentURL = "";

	//	Thread.sleep(2000);
		
		//login.sign_in(defaults.getrmployeeEmail(), defaults.getemployeepassword());
		
		 try {
			 long startTime = System.currentTimeMillis();
			  long pageLoadTime = System.currentTimeMillis() - startTime;

				driver.get(defaults.getwebUrl());
				Login_Method login = new Login_Method(driver);
				login.sign_in(email,pass);
				quickTaskMethod quickTask = new quickTaskMethod(driver);

				quickTask.taskQuickTestRoute(Loop);
				 ApplicationNew.resTime("Response time: " + pageLoadTime + " milliseconds" );
				 ApplicationNew.logError("Quick Task Creation Test Sucessfull");
		        tearDown();
		        return true;
		       
		 } catch (Exception e) {
			 currentURL = driver.getCurrentUrl();
			 ApplicationNew.logError("Error occurred during Quick Task Creation Creation  on URL: " + currentURL + "\nError message: "  + e.getMessage());
		        return false;
		 }
		 finally {
			 // Handle exceptions or log errors if createPost fails
		      //  e.printStackTrace(); // Replace with appropriate logging
		        tearDown(); // Still call tearDown in case cleanup is needed
		 }
		
		
	}

}
