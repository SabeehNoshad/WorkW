package NotificationEnable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Xpaths.getterMethods;
import signin.Base_page;
import user.urls.testArguments.getterMethodTextFile;

public class notification_Method extends Base_page {

	getterMethods xpaths = new getterMethods();
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  getterMethodTextFile text= new getterMethodTextFile();
	
	public notification_Method(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void notificatioRoute() throws InterruptedException {
		WebElement profileCLick = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getLangOption()));
		profileCLick.click();
		WebElement settingClick = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getSettingProfileOption()));
		settingClick.click();
		WebElement notificationCLick = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getNotificationOPtionCLick()));
		notificationCLick.click();
		notificationOption();
		WebElement notificationCLickAgain = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getNotificationOPtionCLick()));
		notificationCLickAgain.click();
		Thread.sleep(5000);
	}
	public void notificationOption() {
		WebElement notificationEnableCLick = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getEnableCheckBox()));
		notificationEnableCLick.click();
		WebElement notificationSaveButton = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getSaveButtonNotification()));
		notificationSaveButton.click();
	}

}
