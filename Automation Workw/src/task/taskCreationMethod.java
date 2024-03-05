package task;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Xpaths.getterMethods;
import signin.Base_page;
import user.urls.testArguments.getterMethodTextFile;

public class taskCreationMethod extends Base_page{
	getterMethods xpaths = new getterMethods();
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	  getterMethodTextFile text = new getterMethodTextFile();
	  
	public taskCreationMethod(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
public void taskCreationFeedOpt(Integer times) throws InterruptedException  {
	for (int i = 1; i <= times ; i++) {
	WebElement taskCreateFeedOption = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getTaskFeedOption()));
	 taskCreateFeedOption.click();
	taskCreateComposer(i, text.getTaskType() ,text.getprioritylow());
	}
} 
public void taskCreationNavBarOpt(Integer value) throws InterruptedException {
	
	driver.findElement(xpaths.getTaskNavBarOpt()).click();
	//Thread.sleep(5000);
	for (int j = 1 ; j <= value ; j++) {
			driver.findElement(xpaths.getTaskCreateOptionUndrNav()).click();
	
//	Thread.sleep(5000);
	taskCreateComposer(j,text.getTaskType() ,text.getpriorityhighh());
	// for priority or use getprioritylow   getprioritymed
	}
}
public void taskCreateComposer(Integer i , String type , String priority) throws InterruptedException {
	
	driver.findElement(xpaths.getTaskSubject()).click();
	driver.findElement(xpaths.getTaskSubject()).sendKeys(i + text.getuserFirstName());
	driver.findElement(xpaths.getTaskDescription()).click();
	driver.findElement(xpaths.getTaskDescription()).sendKeys(text.getuserModuleDescription500());
	
	if (type == "general") {
	driver.findElement(xpaths.getTaskGeneralOpt()).click();
	}
	else if (type == "project") {
	driver.findElement(xpaths.getTaskProjectOpt()).click();
	//Thread.sleep(5000);
	taskType();
	}
	else if (type == "group") {
	driver.findElement(xpaths.getTaskGroupOpt()).click();
	//Thread.sleep(5000);
	taskType();
	}
	else {System.out.print("your default type is the general");}
	
	if(priority == "low") {
	driver.findElement(xpaths.getTaskPrioritylow()).click();
	}
	else if (priority == "medium") {
	driver.findElement(xpaths.getTaskPriorityMedium()).click();
	}
	else if (priority == "high") {
	driver.findElement(xpaths.getTaskPriorityhigh()).click();
	}
	else {System.out.print("your default priority is set as low ");}
	
	
//	driver.findElement(xpaths.getTaskDatePicker()).click();
//	//Thread.sleep(2000);
//	driver.findElement(xpaths.getTaskDatePicker()).clear();
//	//Thread.sleep(2000);
//	driver.findElement(xpaths.getTaskDatePicker()).sendKeys(date);
//	//Thread.sleep(2000);
////	driver.findElement(xpaths.getTaskEndDate()).clear();
////	Thread.sleep(3000);
//	//driver.findElement(xpaths.getTaskEndDate()).sendKeys("2024-02-04");
//	driver.findElement(xpaths.getTaskDatePickerClose()).click();
	//Thread.sleep(5000);
	 WebElement taskSubmitButton = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getTaskCreateButton()));
	 taskSubmitButton.click();
//	 driver.findElement(xpaths.getTaskCreateButton());
	
}
public void taskType () throws InterruptedException {
	
		driver.findElement(xpaths.getTaskGroupOrProject()).click();
		//Thread.sleep(5000);
		driver.findElement(xpaths.getTaskGroupOrProject()).sendKeys(text.getuserFirstName());
		//Thread.sleep(5000);
		driver.findElement(xpaths.getTaskGroupSelectedItem()).click();
//Thread.sleep(2000);
		driver.findElement(xpaths.getTaskAssignTo()).click();
	//	Thread.sleep(5000);
		driver.findElement(xpaths.getTaskAssignTo()).sendKeys(text.getmileTapMemberName1());
		//Thread.sleep(7000);
		 WebElement taskmemberSelection = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getTaskuserSelected()));
		 taskmemberSelection.click();
		//Thread.sleep(5000);
}		




}
