package group;

import java.time.Duration;

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

public void  navigation(Integer times) throws InterruptedException {
	 WebElement groupNavBarOption = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getGroupNavBar()));
	 groupNavBarOption.click();
	 for (int i = 1 ; i <= times ;i++) {
	 WebElement groupCreateComposer = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getGroupCreateOption()));
	 groupCreateComposer.click();
	 createGroup(i);
	 }
	
	//Thread.sleep(5000);	
}
public void createGroup(Integer i) throws InterruptedException {
	

driver.findElement(xpaths.getGroupName()).click();
WebElement groupName = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getGroupName()));
groupName.sendKeys(i + text.getuserFirstName());
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
}
