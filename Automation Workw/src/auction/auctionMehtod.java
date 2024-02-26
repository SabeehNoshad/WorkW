package auction;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Xpaths.getterMethods;
import signin.Base_page;
import user.urls.testArguments.getterMethodTextFile;

public class auctionMehtod extends Base_page {

	public auctionMehtod(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	getterMethods xpaths = new getterMethods();
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	  getterMethodTextFile text = new getterMethodTextFile();
	  
	  public void auctionRoute(Integer times) throws InterruptedException {
		  WebElement aucitonNavBarOption = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getauctionNavBar()));
		  aucitonNavBarOption.click();
		  for (int i = 0 ; i <= times ; i ++) {
		  WebElement aucitonCreateOption = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getauctionCreateAction()));
		  aucitonCreateOption.click(); 
		  createAuctionForm(i);
		  }
	  }
	  
	  public void createAuctionForm (Integer i) throws InterruptedException {
		 Thread.sleep(1000);
		  driver.findElement(xpaths.getauctionName()).click();
		  WebElement aucitonName = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getauctionName()));
		  aucitonName.sendKeys(i + text.getuserFirstName());
		  driver.findElement(xpaths.getauctionStartBid()).click();
		  WebElement aucitonStartBid = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getauctionStartBid()));
		  aucitonStartBid.sendKeys(i + text.getauctionStartBid());
		  driver.findElement(xpaths.getauctionIncreaseBid()).click();
		  WebElement aucitonIncreaseBid = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getauctionIncreaseBid()));
		  aucitonIncreaseBid.sendKeys(text.getauctionIncreaseBid());
		  driver.findElement(xpaths.getauctionBuyNOwAmount()).click();
		  WebElement aucitonBuyNowAmount = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getauctionBuyNOwAmount()));
		  aucitonBuyNowAmount.sendKeys(i + text.getaucitonBuyNowAmount()); 
		  driver.findElement(xpaths.getauctionMemberr()).click();
		  WebElement aucitonMemeberSelection = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getauctionMemberr()));
		  aucitonMemeberSelection.sendKeys(text.getmileTapMemberName1());
		  WebElement aucitonselectTheMember = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getauctionSelectionOfMember()));
		  aucitonselectTheMember.click();
		  driver.findElement(xpaths.getauctionDatePicker()).click();
		  WebElement aucitonstartDate = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getauctionStartDate()));
		  aucitonstartDate.click();
		  WebElement aucitonDateOkButton = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getauctionDateOkButton()));
		  aucitonDateOkButton.click();
		  driver.findElement(xpaths.getauctionDescription()).click();
		  WebElement aucitonDesc = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getauctionDescription()));
		  aucitonDesc.sendKeys(i + text.getuserModuleDescription150());
		  driver.findElement(xpaths.getauctionSubmittButton()).click();
		  Thread.sleep(2000);
	  }
	  
}
