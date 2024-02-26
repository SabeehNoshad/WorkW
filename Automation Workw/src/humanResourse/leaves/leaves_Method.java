package humanResourse.leaves;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Xpaths.getterMethods;
import signin.Base_page;
import user.urls.testArguments.getterMethodTextFile;

public class leaves_Method extends Base_page {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	  getterMethodTextFile text = new getterMethodTextFile();
		getterMethods leave = new getterMethods();
	public leaves_Method(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void leaveCreate(Integer times,String company) throws InterruptedException {
		driver.findElement(leave.getLeavesNavBar()).click();
		
		for (int i = 1 ; i <= times ; i++) {
		 WebElement leaveCreateComposerOpen= wait.until(ExpectedConditions.visibilityOfElementLocated(leave.getLeavesCreateOption()));
		 leaveCreateComposerOpen.click();
		 leaveCreateComposer("casual" ,  i);
		 		for (int j = 1 ; j <= i ; j++) {
		 			 WebElement leaveCreateComposerOpen1= wait.until(ExpectedConditions.visibilityOfElementLocated(leave.getLeavesCreateOption()));
		 			 leaveCreateComposerOpen1.click();
		 			leaveCreateComposer("annual" ,  i);
		 							
		 			for (int k = 1 ; k <= j ; k++) {
			 			 WebElement leaveCreateComposerOpen2= wait.until(ExpectedConditions.visibilityOfElementLocated(leave.getLeavesCreateOption()));
			 			 leaveCreateComposerOpen2.click();
			 			leaveCreateComposer("sick" ,  i);
		 			}
		 		}
			}
		}

		 		
	
	public void leaveCreateComposer(String type , Integer i) throws InterruptedException {
		driver.findElement(leave.getLeavesLeaveTypeClick()).click();
		//Thread.sleep(3000);
		if (type == "casual") {
			 WebElement leaveCasual= wait.until(ExpectedConditions.visibilityOfElementLocated(leave.getLeavesLeaveTypeCasual()));
			 leaveCasual.click();
		}
		else if (type == "annual") {
			 WebElement leaveAnnual= wait.until(ExpectedConditions.visibilityOfElementLocated(leave.getLeavesLeaveTypeAnnual()));
			 leaveAnnual.click();
				}
		else {
			 WebElement leaveSick= wait.until(ExpectedConditions.visibilityOfElementLocated(leave.getLeavesLeaveTypeSick()));
			 leaveSick.click();
		}
		
		driver.findElement(leave.getLeavesDescription()).sendKeys(i+ text.getuserModuleDescription500());
		
//		WebElement leaveStartDate= wait.until(ExpectedConditions.visibilityOfElementLocated(leave.getLeavesStartDate()));
//		leaveStartDate.sendKeys(text.getleaveStartDate());
//		
//		WebElement leaveEndDate= wait.until(ExpectedConditions.visibilityOfElementLocated(leave.getLeavesEndDate()));
//		leaveEndDate.sendKeys(text.getleaveEndDate());
	   // Thread.sleep(1000);
	    WebElement leaveCountBox= wait.until(ExpectedConditions.visibilityOfElementLocated(leave.getLeavesComposerCount()));
	    String count = leaveCountBox.getText();
	    //Thread.sleep(5000);
	    System.out.println("days count is =" + count);
	    WebElement leaveSubmitButton= wait.until(ExpectedConditions.visibilityOfElementLocated(leave.getLeavesCreateButton()));
	    leaveSubmitButton.click();
	    
	
	}

}
