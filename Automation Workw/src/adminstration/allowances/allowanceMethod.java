package adminstration.allowances;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Xpaths.getterMethods;
import signin.Base_page;
import user.urls.testArguments.getterMethodTextFile;

public class allowanceMethod extends Base_page{
	public allowanceMethod(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	getterMethods xpaths = new getterMethods();
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  getterMethodTextFile text = new getterMethodTextFile();
	  
	  public void adminstrationRoute() {
		  WebElement administrationNavBarClick = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getAdministrationNavBarOption()));
		  administrationNavBarClick.click();
		  WebElement administrationAllowanceOption = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getAdministrationAllowanceOpt()));
		  administrationAllowanceOption.click();
		  allowanceCreateMethod();
		  WebElement administrationGradeAllowanceOption = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getGradeAllowanceOptionClick()));
		  administrationGradeAllowanceOption.click();
		  
	  }
	  public void allowanceCreateMethod() {
		  WebElement administrationAllowanceName = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getAllowanceName()));
		  administrationAllowanceName.sendKeys(text.getuserFirstName());
		  WebElement administrationAllowanceDesc = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getAllowanceName()));
		  administrationAllowanceDesc.sendKeys(text.getuserModuleDescription150());
		  WebElement administrationAllowanceSubmitButton = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getAllowanceName()));
		  administrationAllowanceSubmitButton.click();

	  }
	  public void gradeAllowanceCreate() {
		  driver.findElement(xpaths.getGradeAllowanceGradeList()).click();
		  WebElement administrationAllowanceName = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getAllowanceName()));
		  administrationAllowanceName.sendKeys(text.getuserLastName());
	  }
}
