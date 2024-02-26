package travel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Xpaths.getterMethods;
import signin.Base_page;
import user.urls.testArguments.getterMethodTextFile;

public class travelMethod extends Base_page{

	getterMethods xpaths = new getterMethods();
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	  getterMethodTextFile text = new getterMethodTextFile();
	  
	public travelMethod(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void createComposer(Integer times) throws InterruptedException {
		 WebElement travelNavBarOption = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getTravelNavBarOpt()));
		 travelNavBarOption.click();
		 for (int i= 10 ; i <= times ; i++) {
		 WebElement travelCreateComposer = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getTravelCreateComposer()));
		 travelCreateComposer.click();
		 travelCreateForm(i);
		 }
	}
	public void travelCreateForm(Integer i) throws InterruptedException {
		driver.findElement(xpaths.getTravelSubject());
		 WebElement travelSubject = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getTravelSubject()));
		 travelSubject.sendKeys(i + text.getSubject());
		 
		 WebElement travelDescription = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getTravelDescription()));
		 travelDescription.sendKeys(i + text.getuserModuleDescription500());
		 
		 driver.findElement(xpaths.getTravelAgent()).click();
		 WebElement travelAgent = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getTravelAgent()));
		 travelAgent.sendKeys(text.getmileTapMemberName1());
		 
		 
		 WebElement travelAgentClick = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getTravelAgentSelectionClick()));
		 travelAgentClick.click();
		 
		 WebElement travelreason = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getTravelReason()));
		 travelreason.sendKeys(text.getreaconCharacterLimit());;
	
		 
		 driver.findElement(xpaths.getTravelTo()).click();
		 WebElement travelTo = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getTravelTo()));
		 travelTo.sendKeys(text.getIslamabad());
		 Thread.sleep(3000);

		 WebElement travelToSelection = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths. getTravelToSelectionClick()));
		 travelToSelection.click();
		 Thread.sleep(3000);
		 
		 driver.findElement(xpaths.getTravelFrom()).click();
		 WebElement travelFrom = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getTravelFrom()));
		 travelFrom.sendKeys(text.getKarachi());
		 Thread.sleep(3000);
		 WebElement travelFromClick = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getTravelFromSelectionClick()));
		 travelFromClick.click();
		 Thread.sleep(3000);
//		 WebElement travelHotelReq = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getTravelHotelReq()));
//		 travelHotelReq.click();
//		 WebElement travelDrop = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getTravelDropOffReq()));
//		 travelDrop.click();
		 WebElement travelAdd = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getTravelAdd()));
		 travelAdd.click();
		 WebElement travelSubmittButton = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getTravelSubmitButton()));
		 travelSubmittButton.click();
		 
		 Thread.sleep(3000);
		 
	}

}
