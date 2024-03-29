package group;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Xpaths.getterMethods;
import signin.Base_page;
import user.urls.testArguments.getterMethodTextFile;

public class groupMethod extends Base_page{
	  

public groupMethod(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

getterMethods xpaths = new getterMethods();
getterMethodTextFile text = new getterMethodTextFile();
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
// feature adding array 
By[] modules = new By [] {xpaths.getgroupTaskFeature(),xpaths.getgroupWorkBoardFeature(),xpaths.getgroupExpenseFeature(),xpaths.getgroupScheduleFeature(),xpaths.getgroupDocumentsFeature()
							,xpaths.getgroupDisscusionBoardFeature(),xpaths.getgroupPagesFeature()};
// creating group 
public void  navigation(Integer times,Integer value) throws InterruptedException {
	NavBarGroupOption();
	 for (int i = 1 ; i <= times ;i++) {
	 WebElement groupCreateComposer = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getGroupCreateOption()));
	 groupCreateComposer.click();
	 createGroup(i,value);
	 }
	
	//Thread.sleep(5000);	
}
// adding feature
public void addingFeature() throws InterruptedException {
	NavBarGroupOption();
	addFeatures();
	
}
public void NavBarGroupOption() {
	 WebElement groupNavBarOption = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getGroupNavBar()));
	 groupNavBarOption.click();
}
public void createGroup(Integer i,Integer value) throws InterruptedException {
	

driver.findElement(xpaths.getGroupName()).click();
WebElement groupName = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getGroupName()));
groupName.sendKeys(value+ i + text.getuserFirstName());
driver.findElement(xpaths.getGroupDescription()).click();
driver.findElement(xpaths.getGroupDescription()).sendKeys(text.getuserModuleDescription500());
driver.findElement(xpaths.getGroupTaskOption()).click();

WebElement groupSubmitButton = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getGroupCreateButton()));
groupSubmitButton.click();

Thread.sleep(3000);
}
public void verifyTask() throws InterruptedException {
	WebElement groupNavBarOption = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getGroupNavBar()));
	 groupNavBarOption.click();
	driver.findElement(xpaths.getgroupSelectionClick()).click();
	//Thread.sleep(3000);
	driver.findElement(xpaths.getgroupTaskTabOpt()).click();
	//Thread.sleep(3000);
	driver.findElement(xpaths.getgroupAssignedByMeTabTask()).click();
	//Thread.sleep(5000);
	
}
public void createPostInGroup(Integer j) throws InterruptedException {
	 WebElement groupNavBarOption = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getGroupNavBar()));
	 groupNavBarOption.click();
	
	driver.findElement(xpaths.getgroupSelectionClick()).click();
	for (int i =1 ; i<= j; i++) {
	driver.findElement(xpaths.getgroupFeedCreateComposer()).click();
	  WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getgroupFeedTextArea()));
	  element.click();

	driver.findElement(xpaths.getgroupFeedTextArea()).click();
	driver.findElement(xpaths.getgroupFeedTextArea()).sendKeys(i + text.getuserModuleDescription500());
	driver.findElement(xpaths.getgroupFeedComposerCreateButton()).click();
	Thread.sleep(2000);
	}
	}
//adding features
public void addFeatures() throws InterruptedException {
	WebElement groupSearchCLick = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getgroupSearchField()));
	groupSearchCLick.sendKeys("56 Hello");
	Thread.sleep(2000);
	WebElement groupClick = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getgroupSearchedItemClick()));
	groupClick.click();
	WebElement groupSettingOption = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getgroupSettingOption()));
	groupSettingOption.click();
	WebElement groupSettingAddFeatures = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getgroupFeatureOptionClick()));
	groupSettingAddFeatures.click();
	for (int i = 1 ; i <= 7 ; i++) {
		WebElement groupAddingFeatures = wait.until(ExpectedConditions.visibilityOfElementLocated(modules[i]));
		groupAddingFeatures.click();
		Thread.sleep(1000);
	}
}
	

}
