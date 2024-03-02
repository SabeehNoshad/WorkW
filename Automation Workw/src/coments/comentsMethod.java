package coments;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Xpaths.getterMethods;
import leadManager.leadManager_Method;
import signin.Base_page;
import user.urls.testArguments.getterMethodTextFile;

public class comentsMethod extends Base_page {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		getterMethods xpaths = new getterMethods();
		getterMethodTextFile text = new getterMethodTextFile();
		leadManager_Method lead = new leadManager_Method(driver);

	public comentsMethod(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	// coments on feed 
	public void comentRoute(Integer times) {
		//after login click on the post coment option 
		  WebElement postClick = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.gecommentOption()));
		  postClick.click();
		for (int i = 0 ; i <= times ; i++) {
			feedComent(i);
		}
	}
	public void feedComent(Integer i ) {
		
		//place the cursor on the coment field 
		  WebElement comentCursorClick = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getcomentTextArea()));
		  comentCursorClick.sendKeys(i + text.getComment());
		//placce the comment
		  WebElement comentplace = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getcomentTextArea()));
		  comentplace.sendKeys(Keys.ENTER);;
		
	}
	//---------------------------`````````````-------------------------`````````````````````-----------------------``````````-----------------------------------`````````````
		public void commentOnLead(Integer times) throws InterruptedException {
	
			  WebElement leadManagerClick = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getcomentTextArea()));
			  leadManagerClick.click();
			  WebElement leadClick = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getcomentTextArea()));
			  leadClick.click();
			  for (int i = 1 ; i <= times ;i++) {
			  WebElement leadComentClick = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getcomentTextArea()));
			  leadComentClick.sendKeys("experimental Text Comment");
			  WebElement leadEnterClick = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getcomentTextArea()));
			  leadEnterClick.sendKeys(Keys.ENTER);
			  }
			  }
	
}
