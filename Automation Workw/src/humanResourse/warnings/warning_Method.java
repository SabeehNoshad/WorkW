package humanResourse.warnings;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Xpaths.getterMethods;
import signin.Base_page;
import user.urls.testArguments.getterMethodTextFile;

public class warning_Method extends Base_page {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  getterMethodTextFile text = new getterMethodTextFile();
	  getterMethods warning = new getterMethods();
	public warning_Method(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void warning(Integer times,String company ) throws InterruptedException {
		 WebElement warningNavBar = wait.until(ExpectedConditions.visibilityOfElementLocated(warning.getWarningNavBar()));
		 warningNavBar.click();
		 for (int i = 1 ; i <= times ; i++) {
		 WebElement warningComposer = wait.until(ExpectedConditions.visibilityOfElementLocated(warning.getWarningCreateOption()));
		 warningComposer.click();
		 createWarning(company);
		 }
	}
    public void createWarning(String company) throws InterruptedException {
    	
    	
    	
    	driver.findElement(warning.getWarningCategoryClick()).click();
   // 	Thread.sleep(1000);
    	 WebElement warningReasonAttendence = wait.until(ExpectedConditions.visibilityOfElementLocated(warning.getWarningCategoryAttendence()));
    	 warningReasonAttendence.click();
    	
    	driver.findElement(warning.getWarningToSelectMemeber()).click();
    	if (company == "miletap") {
    	   	 WebElement warningToSelectMember = wait.until(ExpectedConditions.visibilityOfElementLocated(warning.getWarningToSelectMemeber()));
        	 warningToSelectMember.sendKeys(text.getmileTapMemberName1());
    	}
    	else {
    		 WebElement warningToSelectMember = wait.until(ExpectedConditions.visibilityOfElementLocated(warning.getWarningToSelectMemeber()));
        	 warningToSelectMember.sendKeys(text.getCompantMember1());
    	}
    	
 
    	
    //	Thread.sleep(2000);
    	 WebElement warningSelectedMemClick = wait.until(ExpectedConditions.visibilityOfElementLocated(warning.getWarningToSelectionOfMember()));
    	 warningSelectedMemClick.click();
    	
    	driver.findElement(warning.getWarningDescription()).sendKeys(text.getuserModuleDescription500());
    	WebElement warningSubmitButton = wait.until(ExpectedConditions.visibilityOfElementLocated(warning.getWarningCreateButton()));
    	warningSubmitButton.click();
    	Thread.sleep(3000);

    }
}
