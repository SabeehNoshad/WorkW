package newsFeed;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Xpaths.getterMethods;
import signin.Base_page;
import user.urls.testArguments.getterMethodTextFile;

public class newsFeedMethod extends Base_page {
	getterMethods xpaths = new getterMethods();
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  getterMethodTextFile text= new getterMethodTextFile();

	public newsFeedMethod(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	} 
	public void createPostComposer() {
		driver.findElement(xpaths.getnewsFeedCreateComposer()).click();
	}
	public void createPost(Integer j,Integer l,String company) throws InterruptedException {
	
		
	//	Thread.sleep(7000);
		for (int k = 1 ; k <= j; k++) {
			createPostComposer();
		for (int i = 1 ; i <= l; i++) { 
			
		 WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getnewFeedTextArea()));
			  element.click();
		
			  WebElement elementComposerTag = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getnewFeedTextArea()));
			  elementComposerTag.sendKeys("@");
	
	
			  WebElement elementTagMemberClick = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getnewsfeedComposerMember()));
			  elementTagMemberClick.click();
	
		}
		driver.findElement(xpaths.getnewFeedTextArea()).sendKeys(k + text.getuserModuleDescription500());
		
		driver.findElement(xpaths.getnewsFeedClickMember()).click();
		if (company == "miletap") {
			driver.findElement(xpaths.getnewsFeedClickMember()).sendKeys(text.getmileTapMemberName1());
			//	Thread.sleep(5000);
				driver.findElement(xpaths.getnewsFeedSelectMember()).click();
				
			//	Thread.sleep(3000);
				driver.findElement(xpaths.getnewsFeedClickMember()).click();
				driver.findElement(xpaths.getnewsFeedClickMember()).sendKeys( text.getmileTapMemberName2());
			//	Thread.sleep(5000);
				driver.findElement(xpaths.getnewsFeedSelectMember()).click();
				
		//Thread.sleep(3000);
				driver.findElement(xpaths.getnewsFeedClickMember()).click();
				driver.findElement(xpaths.getnewsFeedClickMember()).sendKeys( text.getmileTapMemberName3());
			//	Thread.sleep(5000);
				driver.findElement(xpaths.getnewsFeedSelectMember()).click();
		}
		else {
			driver.findElement(xpaths.getnewsFeedClickMember()).sendKeys(text.getCompantMember1());
			//	Thread.sleep(5000);
				driver.findElement(xpaths.getnewsFeedSelectMember()).click();
				
			//	Thread.sleep(3000);
				driver.findElement(xpaths.getnewsFeedClickMember()).click();
				driver.findElement(xpaths.getnewsFeedClickMember()).sendKeys( text.getCompanyMember2());
			//	Thread.sleep(5000);
				driver.findElement(xpaths.getnewsFeedSelectMember()).click();
				
		//Thread.sleep(3000);
				driver.findElement(xpaths.getnewsFeedClickMember()).click();
				driver.findElement(xpaths.getnewsFeedClickMember()).sendKeys( text.getCompanyMember3());
			//	Thread.sleep(5000);
				driver.findElement(xpaths.getnewsFeedSelectMember()).click();
		}
		
	//	Thread.sleep(5000);
		 WebElement newsfeedImportantButton = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getnewsFeedImportantButton()));
		 newsfeedImportantButton .click();
		 WebElement newsFeedPostSubmittButton = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getnewFeedCreateButton()));
		 newsFeedPostSubmittButton.click();
		Thread.sleep(2000);
	}
	}
	public void newsFeedPollComposer(Integer j,Integer l) throws InterruptedException {
		//	Thread.sleep(7000);
		for (int k = 1 ; k <= j; k++) {
			 WebElement newsFeedPollOption = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getnewsfeedPollOption()));
			 newsFeedPollOption.click();
			 WebElement newsFeedPollOption1 = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getnewsFeedPollOption1()));
			 newsFeedPollOption1.sendKeys(text.getprioritylow());
//			 driver.findElement(xpaths.getnewsFeedPollOption1()).sendKeys(text.getprioritylow());
			 WebElement newsFeedPollOption2 = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getnewsFeedPollOption2()));
			 newsFeedPollOption2.sendKeys(text.getpriorityhighh());
		for (int i = 1 ; i <= l; i++) { 
			
		 WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getnewFeedTextArea()));
			  element.click();
		
			  WebElement elementComposerTag = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getnewFeedTextArea()));
			  elementComposerTag.sendKeys("@");
	
	
			  WebElement elementTagMemberClick = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getnewsfeedComposerMember()));
			  elementTagMemberClick.click();
	
		}
//		 WebElement newsFeedPostdesTextArea = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getnewFeedTextArea()));
//		 newsFeedPostdesTextArea.sendKeys(k + text.getuserModuleDescription500());
	//	driver.findElement(xpaths.getnewFeedTextArea()).sendKeys(k + text.getuserModuleDescription500());
	

		 WebElement newsFeedPostSubmittButton = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getnewFeedCreateButton()));
		 newsFeedPostSubmittButton.click();
		Thread.sleep(2000);
		}
	}
//	 driver.findElement(xpaths.getnewsFeedPollOption2()).sendKeys(text.getpriorityhighh());
//	 WebElement newsfeedImportantButton = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getnewsFeedImportantButton()));
//	 newsfeedImportantButton .click();

}
