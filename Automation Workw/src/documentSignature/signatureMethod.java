package documentSignature;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Xpaths.getterMethods;
import signin.Base_page;
import user.urls.testArguments.getterMethodTextFile;

public class signatureMethod extends Base_page{
	getterMethods xpaths = new getterMethods();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	getterMethodTextFile text = new getterMethodTextFile();

	public signatureMethod(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void signatureRoute () throws InterruptedException {
		WebElement profileClick = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getLangOption()));
		profileClick.click();
		WebElement settingsCLick = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getSettingProfileOption()));
		settingsCLick.click();
	
		signatureMethod();
		Thread.sleep(5000);
		
	}
	public void signatureMethod () throws InterruptedException {
		WebElement signatureClick = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getdocumentSignatureOption()));
		signatureClick.click();
		Thread.sleep(60000);
		WebElement signatureSaveSignatureButton = wait.until(ExpectedConditions.visibilityOfElementLocated(xpaths.getSignatureSaveButton()));
		signatureSaveSignatureButton.click();
	}

}
