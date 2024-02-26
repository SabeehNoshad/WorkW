package project;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Xpaths.getterMethods;
import signin.Base_page;
import user.urls.testArguments.getterMethodTextFile;

public class projectMethod extends Base_page {

	public projectMethod(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

getterMethods xpaths = new getterMethods();
getterMethodTextFile text = new getterMethodTextFile();
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


public void  navigation(Integer times) throws InterruptedException { 
	 WebElement projectNavBar = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getProjectNavBarOpt()));
	 projectNavBar.click();
	 for (int i = 1 ; i  <= times ; i++ ) {
	 WebElement projectCreateComposer = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getGroupCreateOption()));
	 projectCreateComposer.click();
	 createProject(i);
	 }
//	Thread.sleep(5000);
}
public void createProject(Integer i) throws InterruptedException {

//Thread.sleep(3000);
driver.findElement(xpaths.getprojectCreateName()).click();
WebElement projectCreateName = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getprojectCreateName()));
projectCreateName.sendKeys(i + text.getuserFirstName());

driver.findElement(xpaths.getprojectDescription()).click();
driver.findElement(xpaths.getprojectDescription()).sendKeys(i + text.getuserModuleDescription500());
driver.findElement(xpaths.getprojectStartEndDateClick()).click();
//Thread.sleep(2000);
driver.findElement(xpaths.getprojectStartEndDateClick()).sendKeys(text.getuserdate());
driver.findElement(xpaths.getprojectStartEndDateClick()).sendKeys(Keys.TAB);
//Thread.sleep(3000);
driver.findElement(xpaths.getprojectStartEndDateClick()).sendKeys(Keys.TAB);
//driver.findElement(xpaths.getprojectEndDateClick()).click();
driver.findElement(xpaths.getprojectEndDateClick()).sendKeys(text.getuserdate());
//Thread.sleep(3000);
driver.findElement(xpaths.getprojectDescription()).click();
//Thread.sleep(3000);
driver.findElement(xpaths.getprojectuserSelection()).click();
driver.findElement(xpaths.getprojectuserSelection()).sendKeys(text.getmileTapMemberName1());
//Thread.sleep(5000);
WebElement projectMemberSelectionClick = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getprojectMemberSelectionClick()));
projectMemberSelectionClick.click();

driver.findElement(xpaths. getprojectTaskButtonClick()).click();
//Thread.sleep(3000);
driver.findElement(xpaths.getprojectCreateButtonClick()).click();
Thread.sleep(3000);
}
public void verifyProjectTask() throws InterruptedException {
	driver.findElement(xpaths.getprojectSelectionClick()).click();
	//Thread.sleep(3000);
	driver.findElement(xpaths.getprojectTaskTabOpt()).click();
	//Thread.sleep(3000);
	driver.findElement(xpaths.getprojectAssignedByMeTabTask()).click();
	//Thread.sleep(5000);
	
}
public void createPostInProject() throws InterruptedException {
	
	driver.findElement(xpaths.getprojectFeedCreateComposer()).click();
	driver.findElement(xpaths.getprojectFeedTextArea()).click();
	driver.findElement(xpaths.getprojectFeedTextArea()).sendKeys(text.getuserModuleDescription500());
	driver.findElement(xpaths.getprojectTaskButtonClick()).click();
}

}
