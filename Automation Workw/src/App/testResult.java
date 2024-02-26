package App;

import org.testng.ITestResult;

public class testResult {
	String testdetails ;
	  public String printTestDetails(ITestResult testResult) {
		   if (testResult != null) {
		        String testName = testResult.getName();
		        long testTime = testResult.getEndMillis() - testResult.getStartMillis();
		        return "Test Name: " + testName + ", Test Time: " + testTime + " milliseconds";
		    } else {
		        return "Test Result is null";
		    }	       
	    		   
	    
	  }
	  public String settestDetails(String details) {
		  return this.testdetails= details;
	  }
	  public String getuserTestDetails() {
		  return testdetails;
	  }

}
