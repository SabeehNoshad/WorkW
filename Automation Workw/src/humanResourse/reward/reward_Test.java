package humanResourse.reward;

import org.testng.annotations.Test;

import App.ApplicationNew;
import signin.Login_Method;
import signin.TestBase;
import user.urls.testArguments.getterMethodTextFile;
import user.urls.testArguments.getterMethod_Defaults;

public class reward_Test extends TestBase{
	
		@Test (priority =1 )
		public Boolean createRewardTest(Integer loop,String email,String pass,String company) throws InterruptedException {
			setUp();
			getterMethod_Defaults defaults = new getterMethod_Defaults();
			  String currentURL = "";

		
			//Thread.sleep(5000);
			 try {
				 long startTime = System.currentTimeMillis();
				  long pageLoadTime = System.currentTimeMillis() - startTime;

					driver.get(defaults.getwebUrl());
					//Thread.sleep(5000);
					Login_Method login = new Login_Method(driver);
				
					login.sign_in(email,pass);

					//Thread.sleep(7000);
					reward_Method reward = new reward_Method(driver);
					reward.rewardComposer(loop,company);
					 ApplicationNew.resTime("Response time: " + pageLoadTime + " milliseconds" );
					 ApplicationNew.logError("Reward Sucessfully Created");
			        // If createPost is successful, tearDown and return true
			        tearDown();
			        return true;
			 } catch (Exception e) {
				 currentURL = driver.getCurrentUrl();
				 ApplicationNew.logError("Error occurred during Reward Creation on URL: " + currentURL + "\nError message: "  + e.getMessage());
			        return false;
			 }
			 finally {
				 // Handle exceptions or log errors if createPost fails
			      //  e.printStackTrace(); // Replace with appropriate logging
			        tearDown(); // Still call tearDown in case cleanup is needed
			 }
					}
}
