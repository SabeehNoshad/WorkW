package newsFeed;

import org.testng.annotations.Test;

import App.ApplicationNew;
import signin.Login_Method;
import signin.TestBase;
import user.urls.testArguments.getterMethodTextFile;
import user.urls.testArguments.getterMethod_Defaults;

public class newsFeedCreate_Test extends TestBase {
	@Test 
	public boolean newsFeedCreateTest(Integer posts,Integer mention ,String email,String Password,String company) throws InterruptedException {
		setUp();
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		  String currentURL = "";

	
		 try {
			 long startTime = System.currentTimeMillis();
			  long pageLoadTime = System.currentTimeMillis() - startTime;
				driver.get(defaults.getwebUrl());
				Thread.sleep(2000);
				Login_Method login = new Login_Method(driver);

				login.sign_in(email,Password);
				
				Thread.sleep(7000);
				newsFeedMethod news = new newsFeedMethod(driver);
		        news.createPost(posts, mention,company);
		        ApplicationNew.resTime("Response time: " + pageLoadTime + " milliseconds" );
				 ApplicationNew.logError("Post Created Sucessfully");

		        // If createPost is successful, tearDown and return true
		        tearDown();
		        return true;
		 } catch (Exception e) {
			 currentURL = driver.getCurrentUrl();
			 ApplicationNew.logError("Error occurred during Post Creation on URL: " + currentURL + "\nError message: "  + e.getMessage());
		        return false;
		 }
		 finally {
			 // Handle exceptions or log errors if createPost fails
		      //  e.printStackTrace(); // Replace with appropriate logging
		        tearDown(); // Still call tearDown in case cleanup is needed
		 }
	}
	
	
	@Test 
	public boolean newsFeedPoll(Integer posts,Integer mention ,String email,String Password,String company) throws InterruptedException {
		setUp();
		getterMethod_Defaults defaults = new getterMethod_Defaults();
		  String currentURL = "";

	
		 try {
			 long startTime = System.currentTimeMillis();
			  long pageLoadTime = System.currentTimeMillis() - startTime;
				driver.get(defaults.getwebUrl());
				Thread.sleep(2000);
				Login_Method login = new Login_Method(driver);

				login.sign_in(email,Password);
				
				Thread.sleep(7000);
				newsFeedMethod news = new newsFeedMethod(driver);
		        news.newsFeedPollComposer(posts, mention);
		        ApplicationNew.resTime("Response time: " + pageLoadTime + " milliseconds" );
				 ApplicationNew.logError("Poll Created Sucessfully");

		        // If createPost is successful, tearDown and return true
		        tearDown();
		        return true;
		 } catch (Exception e) {
			 currentURL = driver.getCurrentUrl();
			 ApplicationNew.logError("Error occurred during Poll Creation on URL: " + currentURL + "\nError message: "  + e.getMessage());
		        return false;
		 }
		 finally {
			 // Handle exceptions or log errors if createPost fails
		      //  e.printStackTrace(); // Replace with appropriate logging
		        tearDown(); // Still call tearDown in case cleanup is needed
		 }
	}
	
}
