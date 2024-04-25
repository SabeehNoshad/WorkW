package workboard;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Xpaths.getterMethods;
import signin.Base_page;
import user.urls.testArguments.getterMethodTextFile;

public class workboardMethod extends Base_page {

	public workboardMethod(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	getterMethods xpaths = new getterMethods();
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	  getterMethodTextFile text = new getterMethodTextFile();
	  
	  public void workBoardRoute(Integer times,Integer Value,String company) throws InterruptedException {
		  WebElement workboardNavBarOption = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getworkboardNavBaroption()));
		  workboardNavBarOption.click();
		  WebElement workboardCreateBoard = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getworkboardCreateBoard()));
		  workboardCreateBoard.click();
		  workBoardCreateComposer(times,Value ,company);
		  Thread.sleep(2000);
		  workBoardSectionCreation();
		  workBoardTodo(times);
		  
		  
	  }
	  public void workBoardCreateComposer(Integer times,Integer Value,String company) throws InterruptedException {
		  Thread.sleep(2000);
		  //work board name 
		  driver.findElement(xpaths.getworkboardname()).click();
		  WebElement workboardName = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getworkboardname()));
		  workboardName.sendKeys(Value+ times + text.getuserFirstName());
		  // workboard description
		  WebElement workboardDescription = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getworkboardDescription()));
		  workboardDescription.sendKeys(text.getuserModuleDescription500());
		  // selecting member
		  if (company == "miletap") {
			  WebElement workboardmemberField = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getworkboardMemberField()));
			  workboardmemberField.sendKeys(text.getmileTapMemberName1());
		  }
		  else {
			  WebElement workboardmemberField = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getworkboardMemberField()));
			  workboardmemberField.sendKeys(text.getmileTapMemberName1());
		  }
		
		  Thread.sleep(2000);
		  WebElement workboardmemberSelection = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getworkboardMemberSelection()));
		  workboardmemberSelection.click();
		  WebElement workboardSubmittButton = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getworkboardSubmitButton()));
		  workboardSubmittButton.click();
	  }
	  public void workBoardSectionCreation() {
		  // clicking on the created workboard
		  WebElement workboardselection = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getworkboardCreatedBoard()));
		  workboardselection.click();
		 // creating section 
		  WebElement workboardSectionCreation = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getworkboardCreateSection1()));
		  workboardSectionCreation.click();
		  driver.findElement(xpaths.getworkboardSectionName()).click();
		  driver.findElement(xpaths.getworkboardSectionName()).sendKeys(text.getmileTapMemberName1());
		  driver.findElement(xpaths.getworkboardSectionName()).sendKeys(Keys.ENTER);
		   }
	  public void workBoardTodo (Integer times) {
		  for (int i = 1 ; i <= times ; i++) {
			  WebElement workboardTodoPlusOption = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getworkboardTodoPlusOption()));
			  workboardTodoPlusOption .click();
//		  WebElement workboardTodo = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getworkboardTodo1()));
//		  workboardTodo.click();
		  WebElement workboardTodoName = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getworkboardTodo1()));
		  workboardTodoName.sendKeys(i + text.getuserFirstName());
		  driver.findElement(xpaths.getworkboardTodo1()).sendKeys(Keys.ENTER);
		  }
	  }
	  
	  
}
