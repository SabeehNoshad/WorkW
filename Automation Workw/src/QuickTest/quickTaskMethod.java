package QuickTest;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Xpaths.getterMethods;
import signin.Base_page;
import user.urls.testArguments.getterMethodTextFile;

public class quickTaskMethod extends Base_page {
	getterMethods xpaths = new getterMethods();
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  getterMethodTextFile text= new getterMethodTextFile();

	public quickTaskMethod(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void taskQuickTestRoute (Integer loop) throws InterruptedException {
		WebElement taskNavBarOPtion = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getTaskNavBarOpt()));
		taskNavBarOPtion.click();
		WebElement quickTaskOPtion = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getquickAddTaskOptionUnderTask()));
		quickTaskOPtion.click();
		quickTaskComposers(loop);
		Thread.sleep(3000);
	}
	public void quickTaskComposers (Integer loop) throws InterruptedException {
		for (int i = 0 ; i<= loop;i++) {
		WebElement quickTestName = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.gettaskEntertextFieldOfQuickTask()));
		quickTestName.sendKeys("My Quick Task"+i);
		quickTestName.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		}
//		WebElement quickTestCalendar = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getLangOption()));
//		quickTestCalendar.click();
//		WebElement quickTestCalendarvalueBefore = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getLangOption()));
//		quickTestCalendarvalueBefore.sendKeys(null);
//		WebElement quickTestCalendarValueAfter = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getLangOption()));
//		quickTestCalendarValueAfter.sendKeys(null);
//		memberSelection();
//		WebElement quickTestNameCLick = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getLangOption()));
//		quickTestNameCLick.click();

		
		
	}
//	public void memberSelection() {
//		WebElement memberSelectionName = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getLangOption()));
//		memberSelectionName.sendKeys(null);
//		WebElement memberSaveOption = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getLangOption()));
//		memberSaveOption.click();
//	}

}
